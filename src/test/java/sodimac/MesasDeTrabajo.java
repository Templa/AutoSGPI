package sodimac;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import pages.home.HomeActions;
import pages.solicitudes.SolicitudesActions;
import utils.DriverManagerAbstract;

public class MesasDeTrabajo {

  WebDriver driver;
  DriverManagerAbstract driverManager;
  HomeActions homeActions;
  SolicitudesActions solicitudesActions;

  // DI
  public MesasDeTrabajo(Hooks hook) {
    this.driver = Hooks.getDriver();
    this.driverManager = hook.getDriverManager();
    homeActions = new HomeActions(driver);
    solicitudesActions = new SolicitudesActions(driver);
  }

  /*
   * Test Aqui
   */

  @And("^Ver todas las areas que tienen parametrizada algun tipo de mesa de trabajo$")
  public void verAreasConMesaDeTrabajo() throws Throwable {
    throw new PendingException();
  }

  @And("^Ver numero de solicitud$")
  public void verNumeroSolicitudMT() throws Throwable {
    throw new PendingException();
  }

  @And("^Ver numero de mesas que tiene el area$")
  public void verNumerMesasPorArea() throws Throwable {
    throw new PendingException();
  }

  @And("^Ver KPI avance$")
  public void verKpiAvance() throws Throwable {
    throw new PendingException();
  }

  @And("^Ver KPI cumplimiento$")
  public void verKpiCumplimiento() throws Throwable {
    throw new PendingException();
  }

  @And("^Posicionarse sobre la mesa y ver popup \"(.*?)\"$")
  public void verPopUpSobreMT() throws Throwable {
    throw new PendingException();
  }

}
