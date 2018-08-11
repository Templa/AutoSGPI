package sodimac;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import pages.mesatrabajo.MesaTrabajoActions;
import utils.DriverManagerAbstract;

public class MesasDeTrabajo {

  WebDriver driver;
  DriverManagerAbstract driverManager;
  MesaTrabajoActions mesaTrabajoActions;

  // DI
  public MesasDeTrabajo(Hooks hook) {
    this.driver = Hooks.getDriver();
    this.driverManager = hook.getDriverManager();
    mesaTrabajoActions = new MesaTrabajoActions(driver);
  }

  /*
   * Test Aqui
   */

  @And("^Ver todas las areas que tienen parametrizada algun tipo de mesa de trabajo$")
  public void verAreasConMesaDeTrabajo(List<String> areas) throws Throwable {
    mesaTrabajoActions.verAreasConMesaDeTrabajo(areas);
  }

  @And("^Ver numero de solicitud$")
  public void verNumeroSolicitudMT() throws Throwable {
    mesaTrabajoActions.verNumeroSolicitudMT();
  }

  @And("^Ver numero de mesas que tiene el area$")
  public void verNumerMesasPorArea() throws Throwable {
    mesaTrabajoActions.verNumerMesasPorArea();
  }

  @And("^Ver KPI avance$")
  public void verKpiAvance() throws Throwable {
    mesaTrabajoActions.verKpiAvance();
  }

  @And("^Ver KPI cumplimiento$")
  public void verKpiCumplimiento() throws Throwable {
    mesaTrabajoActions.verKpiCumplimiento();
  }

  @And("^Posicionarse sobre la mesa y ver popup \"(.*?)\"$")
  public void verPopUpSobreMT(String text) throws Throwable {
    mesaTrabajoActions.verPopUpSobreMT(text);
  }

}
