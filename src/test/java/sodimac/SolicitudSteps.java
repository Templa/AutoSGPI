package sodimac;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.solicitudes.SolicitudesActions;
import utils.DriverManagerAbstract;

public class SolicitudSteps {

  WebDriver driver;
  DriverManagerAbstract driverManager;
  SolicitudesActions solicitudesActions;
  // DI
  public SolicitudSteps(Hooks hook) {
    this.driver = Hooks.getDriver();
    this.driverManager = hook.getDriverManager();
    solicitudesActions = new SolicitudesActions(driver);
  }

  /*
   * Test Aqui
   */
  @Then("^Seleccionar en combobox Tipo Solicitud: \"(.*?)\"$")
  public void seleccionarTipoSolicitud(String tipoSolicitud) throws Throwable {
    solicitudesActions.seleccionarTipoSolictud(tipoSolicitud);
  }

  @And("^Seleccionar en combobox Actividad: \"(.*?)\"$")
  public void seleccionarActividad(String actividad) throws Throwable {
    solicitudesActions.seleccionarActiviad(actividad);
  }

  @And("^Seleccionar una Tienda en combobox \"(.*?)\"$")
  public void seleccionarTienda(String tienda) throws Throwable {
    solicitudesActions.seleccionarTienda(tienda);
  }

  @And("^Ingresar Descripcion de la Solicitud \"(.*?)\"$")
  public void ingresarDescripcionSolicitud(String comentarios) throws Throwable {
    solicitudesActions.ingresaDescripcion(comentarios);
  }

  @And("^Ingresar Tipo Prototipo \"(.*?)\"$")
  public void seleccionarPrototipo(String prototipo) throws Throwable {
    solicitudesActions.seleccionarTipoPrototipo(prototipo);
  }

  @And("^Adjuntar Archivo Mecanica de Suelo$")
  public void adjuntarArchivoMecanicaSuelo() throws Throwable {
    solicitudesActions.ingresarFileMecanicaSuelo();
  }

  @And("^Adjuntar Archivo KMZ$")
  public void adjuntarArchivoKMZ() throws Throwable {
    solicitudesActions.ingresarFileKmz();
  }

  @And("^Adjuntar Archivo Fotografia Terreno$")
  public void adjuntarArchivoFotografiaTerreno() throws Throwable {
    solicitudesActions.ingresarFileFotoTerreno();
  }

  @And("^Adjuntar Archivo Plano Topografico$")
  public void adjuntarPlanoTopografico() throws Throwable {
    solicitudesActions.ingresarFilePlanoTopografico();
  }

  @And("^Adjuntar Plano Municipal$")
  public void adjuntarPlanoMunicipal() throws Throwable {
    solicitudesActions.ingresarFilePlanoMunicipal();
  }

  @And("^Adjuntar Informes Previas$")
  public void adjuntarInformesPrevias() throws Throwable {
    solicitudesActions.ingresarFileInfoPrevias();
  }

  @And("^Presionar Boton Enviar$")
  public void presionarBotonEnviar() throws Throwable {
    solicitudesActions.presionarEnviar();
  }

  // VALIDACIONES
  @And("^Validar formulario de Actividades$")
  public void validarFormualioIngresoSolicitud() throws Throwable {
    solicitudesActions.validarFormularioActividades();
  }

  @And("^Validar que el campo empresa por defecto tenga el valor \"(.*?)\"$")
  public void validarCampoEmpresa(String empresaName) throws Throwable {
    solicitudesActions.validarCampoEmpresa(empresaName);
  }

  @And("^Validar campo Centro de Costo$")
  public void validarCentroCosto() throws Throwable {
    solicitudesActions.validarCentroCosto();
  }

  @And("^Validar mensaje en popup \"(.*?)\"$")
  public void validarMensajePopUp(String mensaje) throws Throwable {
    solicitudesActions.validarMensajePopUp(mensaje);
  }

  @And("^Presionar boton ok en popup$")
  public void presionarBotonOkPopUp() throws Throwable {
    solicitudesActions.presionarBotonOkPopUp();
  }

}
