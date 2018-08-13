package sodimac;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import utils.PropertyReader;
import utils.Utils;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/",
    glue = {"sodimac"},
    plugin = {
    "pretty",
    "html:target/Destination",
    "json:target/Destination/cucumber-report.json",
    "com.cucumber.listener.ExtentCucumberFormatter:"},
    tags = {"@Login, @Home, @IngresoSolicitudes, @MesasDeTrabajo, @MesasDeTrabajoDetalle"})

 /*
  * GENERA REPORTES EN HTML Y JSON EN LA RUTA /target/Destination
  * Indicar Ruta de Features y Test
  * features = "src/test/resources/"
  * glue = {"sodimac"}
  * Principales Tags:
  * @Login
  * @Home
  * @IngresoSolicitudes
  * @MesasDeTrabajo
  * @MesasDeTrabajoDetalle
  */

public class RunTest {
  @BeforeClass
  public static void setup() throws Exception {
    PropertyReader.initProperties(); // Init properties
    ExtentProperties extentProperties = ExtentProperties.INSTANCE;
    extentProperties.setReportPath("reports/Run_"
        + Utils.getCurrentTime()
        + "/reporte.html");
    extentProperties.setProjectName("Sodimac SGPI");
    System.out.println("URL HOME           : " + PropertyReader.getSiteUrl());
  }

  @AfterClass
  public static void teardown() throws Throwable {
    Reporter.loadXMLConfig(new File(PropertyReader.getReportConfigPath()));
    Reporter.setSystemInfo("Url", PropertyReader.getSiteUrl());
    String reportPath = ExtentProperties.INSTANCE.getReportPath().replaceAll("reports/", "");
    Reporter.setSystemInfo("Report", reportPath);
    System.out.println("************************************************************************");
    System.out.println("Report: " + reportPath);
    System.out.println("************************************************************************");
  }
}
