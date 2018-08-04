package sodimac;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.DriverManagerAbstract;
import utils.DriverManagerFactory;
import utils.DriverManagerFactory.DriverType;
import utils.PropertyReader;
import utils.Utils;

/*
 * Clase Global para el uso de Hooks Before y After
 */
public class Hooks {

  private static WebDriver driver;
  private DriverManagerAbstract driverManager;

  public static WebDriver getDriver() {
    return driver;
  }

  public DriverManagerAbstract getDriverManager() {
    return driverManager;
  }

  @Before // inicia el driver Chrome
  public void beforeAllTest(Scenario scenario) throws Exception {
    driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
    driver = driverManager.getDriver(); // DRIVER LOCAL SE DEBE ESPECIFICAR LA RUTA
    //driver = driverManager.getRemoteDriver()
  }

  @After
  public void afterTest(Scenario scenario) {
    try {
      if (scenario.isFailed()) {
        //Screenshoot for cucumber report
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png"); // ... and embed it in the report.

       //Screenshot for extent report
        String screenshotName = scenario.getName().replaceAll(" ", "_") + Utils.getCurrentTime();
        File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destinationPath = new File(getPathFromExtentProperties() + screenshotName + ".png");

        //Copy taken screenshot from source location to destination location
        Files.copy(sourcePath, destinationPath);

        //This attach the specified screenshot to the test
        Reporter.addScreenCaptureFromPath(screenshotName + ".png", "IMAGEN DE ERROR");

        // Refresh page: if test fail and currentUrl is equals to page init
        String urlSite = PropertyReader.getSiteUrl();
        if (driver.getCurrentUrl().equalsIgnoreCase(urlSite)) {
          driver.manage().deleteAllCookies();
          final int tiempoMili = 3000;
          Thread.sleep(tiempoMili);
          driver.navigate().refresh();
        }
      }
    } catch (Throwable e) {
      System.out.println("FAILED: afterTest " + e.getMessage());
    }

    System.out.println("************************************************************************");
    System.out.println(scenario.getName() + " Status - " + scenario.getStatus().toUpperCase());
    System.out.println("************************************************************************");
  }

  /**
   * Truco que permite crear un hookglobal ( sin junit desde cucumber )
   * https://automationpanda.com/2017/03/03/cucumber-jvm-global-hook-workarounds/
   */
  private static boolean dunit = false;
  @After
  public void afterAll() {
    if (!dunit) {
      Runtime.getRuntime().addShutdownHook(new Thread() {
        public void run() {
          // new thread for quit driver
          driverManager.quitDriver();
        }
      });
      dunit = true;
    }
  } // fin afterAll()

  /**
   * This method return path from ExtentProperties
   * @return path
   */
  private String getPathFromExtentProperties() {
    ExtentProperties extentProperties = ExtentProperties.INSTANCE;
    String[] parts = extentProperties.getReportPath().split("\\/");
    final String path = parts[0] + "/" + parts[1] + "/";
    return path;
  }

}
