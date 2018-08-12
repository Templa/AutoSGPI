package sodimac;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import pages.mesatrabajo.MesaTrabajoActions;
import pages.mesatrabajo.MesaTrabajoDetalleActions;
import utils.DriverManagerAbstract;

public class MesasDeTrabajo {

  WebDriver driver;
  DriverManagerAbstract driverManager;
  MesaTrabajoActions mesaTrabajoActions;
  MesaTrabajoDetalleActions mesaTrabajoDetalleActions;

  // DI
  public MesasDeTrabajo(Hooks hook) {
    this.driver = Hooks.getDriver();
    this.driverManager = hook.getDriverManager();
    mesaTrabajoActions = new MesaTrabajoActions(driver);
    mesaTrabajoDetalleActions = new MesaTrabajoDetalleActions(driver);
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

  // SEGUNDO NIVEL
  @And("^Hacer Clik en el nombre de la subgerencia area \"(.*?)\"$")
  public void clickNombreSubgerenciaArea(String nombreArea) throws Throwable {
    mesaTrabajoActions.clickNombreSubgerenciaArea(nombreArea);
  }

  @And("^Se visualizan los tipos de Mesas de Trabajo que tiene el area \"(.*?)\"$")
  public void visualizarTiposMesasPorArea(String nombreArea) throws Throwable {
    mesaTrabajoActions.visualizarTiposMesasPorArea(nombreArea);
  }

  @And("^Se visualiza el numero de Solicitudes para el area \"(.*?)\" sub area \"(.*?)\"$")
  public void visualizarNumeroSolicitudesPorSubArea(String nombreArea, String subArea) throws Throwable {
    mesaTrabajoActions.visualizarNumeroSolicitudesPorSubArea(nombreArea, subArea);
  }

  @And("^Se visualiza el numero de Mesas para el area \"(.*?)\" sub area \"(.*?)\"$")
  public void visualizarNumeroMesasPorSubArea(String nombreArea, String subArea) throws Throwable {
    mesaTrabajoActions.visualizarNumeroMesasPorSubArea(nombreArea, subArea);
  }

  @And("^Se visualiza para el numero de Tiendas para el area \"(.*?)\" sub area \"(.*?)\"$")
  public void visualizarNumeroTiendasPorSubArea(String nombreArea, String subArea) throws Throwable {
    mesaTrabajoActions.visualizarNumeroTiendasPorSubArea(nombreArea, subArea);
  }

  @And("^Se visualiza KPI de Avance por mesa para el area \"(.*?)\" sub area \"(.*?)\"$")
  public void visualizarKpiAvancePorSubArea(String nombreArea, String subArea) throws Throwable {
    mesaTrabajoActions.visualizarKpiAvancePorSubArea(nombreArea, subArea);
  }

  @And("^Se visualiza KPI de cumplimiento por mesa para el area \"(.*?)\" sub area \"(.*?)\"$")
  public void visualizarKpiCumplimientoPorSubArea(String nombreArea, String subArea) throws Throwable {
    mesaTrabajoActions.visualizarKpiCumplimientoPorSubArea(nombreArea, subArea);
  }

  @And("^Validar el texto \"(.*?)\" en negro para nombre de mesa en el area \"(.*?)\" sub area \"(.*?)\"$")
  public void validarTextoAlPosicionarseSobreNombreMesaTrabajo(String texto, String nombreArea, String subArea) throws Throwable {
    mesaTrabajoActions.validarTextoAlPosicionarseSobreNombreMesaTrabajo(texto, nombreArea, subArea);
  }

  @And("^Presionar sobre el nombre de la primera mesa para el area \"(.*?)\" sub area \"(.*?)\"$")
  public void presionarPrimerNombreMesa(String nombreArea, String subArea) throws Throwable {
    mesaTrabajoActions.presionarPrimerNombreMesa(nombreArea, subArea);
  }

  // ***
  // DETALLE MESA DE TRABAJO
  // ***

  @And("^Se despliega formulario Detalle Mesa$")
  public void validarFormularioDetalleMesa() throws Throwable {
    mesaTrabajoDetalleActions.validarFormularioDetalleMesa();
  }

  @And("^Validar seccion superior Nombre Mesa, Area, Tipo$")
  public void validarSeccionSuperiorMesaAreaTipo() throws Throwable {
    mesaTrabajoDetalleActions.validarSeccionSuperiorMesaAreaTipo();
  }

  @And("^Validar seccion superior derecha Num de Solicitudes, KPI Avance, KPI Cumplimiento en Plazo$")
  public void validarSeccionSuperiorDerechaNumSolKpis() throws Throwable {
    mesaTrabajoDetalleActions.validarSeccionSuperiorDerechaNumSolKpis();
  }

  @And("^Validar titulo \"(.*?)\" en la seccion central para integrantes de la mesa$")
  public void validarTituloSecCentralIntegrantesMesa(String titulo) throws Throwable {
    mesaTrabajoDetalleActions.validarTituloSecCentralIntegrantesMesa(titulo);
  }

  @And("^Validar contenido seccion central para integreantes de la mesa columnas Nombre, Area, Rol, Avance, Capacidad$")
  public void validarContenidoSecCentralColumNombreAreaRolAvanceCapacidad() throws Throwable {
    mesaTrabajoDetalleActions.validarContenidoSecCentralColumNombreAreaRolAvanceCapacidad();
  }

  @And("^Validar titulo \"(.*?)\" en la seccion inferior para las Tiendas Asociadas a la Mesa$")
  public void validarTituloSeccionInferiorTiendas(String titulo) throws Throwable {
    mesaTrabajoDetalleActions.validarTituloSeccionInferiorTiendas(titulo);
  }

  @And("^Validar contenido seccion inferior para las Tiendas Asociadas a la Mesa, columnas Nombre, Solicitudes , Capacidad$")
  public void validarContenidoSeccionInferiorTiendas() throws Throwable {
    mesaTrabajoDetalleActions.validarContenidoSeccionInferiorTiendas();
  }

  @And("^Validar titulo \"(.*?)\" en la seccion central derecha para las solicitudes asociadas a la mesa$")
  public void validarTituloSeccionCentralSolicitudes(String titulo) throws Throwable {
    mesaTrabajoDetalleActions.validarTituloSeccionCentralSolicitudes(titulo);
  }

  @And("^Validar contenido seccion central derecha para las solicitudes asociadas a la mesa, columnas Solicitud , la Sucursal, Solicitante y Estado$")
  public void validarContenidoSeccionCentralSolicitudes() throws Throwable {
    mesaTrabajoDetalleActions.validarContenidoSeccionCentralSolicitudes();
  }


}
