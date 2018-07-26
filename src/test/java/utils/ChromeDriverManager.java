package utils;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeDriverManager extends DriverManagerAbstract {

  protected int secondsToWait = 1000; // wait for AJAX
  private ChromeDriverService chromeService;

  @Override
  public void startService() {
    if (null == chromeService) {
      try {
    	// PATH donde se encuentra chromedriver
    	String pathFile = System.getProperty("user.dir") + "\\src\\test\\resources\\driver\\chromedriver.exe";
        chromeService = new ChromeDriverService.Builder()
          .usingDriverExecutable(new File(pathFile))
          .usingAnyFreePort()
          .build();
        chromeService.start();
      } catch (Throwable e) {
        e.printStackTrace();
      }
    }
  }

  @Override
  public void stopService() {
    if (null != chromeService && chromeService.isRunning()) {
      chromeService.stop();
    }
  }

  @Override
  public void createDriver() throws Exception {

    DesiredCapabilities capabilities = DesiredCapabilities.chrome();
    capabilities.setCapability("name", "Solicitudes Sodimac - Automated Testing");
    capabilities.setPlatform(Platform.ANY);

    ChromeOptions options = new ChromeOptions();
    options.addArguments("test-type");
    options.addArguments("--start-maximized");
    options.addArguments("--disable-notifications");
    capabilities.setCapability(ChromeOptions.CAPABILITY, options);

    try {
      String remoteWebDriver = PropertyReader.getSeleniumUrl();
      driver = new RemoteWebDriver(new URL(remoteWebDriver), capabilities);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    } catch (Throwable e) {
      System.out.println("Fail remoteWebDriver" + e.getMessage());
    }
  } // End createDriver();
}