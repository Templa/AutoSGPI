package pages.solicitudes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.PropertyReader;


public class SolicitudesActions {
  WebDriver driver;
  private SolicitudesPage solicitudesPage;

  public SolicitudesActions(WebDriver driver) {
    this.driver = driver;
    solicitudesPage = new SolicitudesPage(driver);
  }

  public void validarTituloSolicitudes() throws Throwable {
    final int tiempoSeg = 10;
    assertTrue("FAILED: validarTituloSolicitudes waitVisibilityOfElement",
        solicitudesPage.waitVisibilityOfElement(solicitudesPage.getFormSolicitudTitle(), tiempoSeg));
    assertTrue("FAILED: validarTituloSolicitudes contains Datos generales de la solicitud",
        solicitudesPage.getFormSolicitudTitle().getText().contains(("Datos generales de la solicitud")));
  }

  public void seleccionarTipoSolictud(String solicitud) {
    Select solicitudes = new Select(solicitudesPage.getSolicitudList());
    solicitudes.selectByVisibleText(solicitud);
  }

  public void seleccionarActiviad(String actividad) {
    Select actividades = new Select(solicitudesPage.getActividadesList());
    actividades.selectByVisibleText(actividad);
  }

  public void validarCargaSodimacPorDefecto() {
    String empresaPorDefecto = solicitudesPage.getEmpresaNameLabel().getText();
    assertEquals(empresaPorDefecto, "Sodimac");
  }

  public void seleccionarTienda(String tienda) {
    Select tiendas = new Select(solicitudesPage.getTiendaList());
    tiendas.selectByVisibleText(tienda);
  }

  public void validaCentroCosto(String textoAviso) {
    //  if (!solicitudesPage.getEstadoccAvisoLabel().getText().contains(avisoCCtext)){
    //  System.out.println("OK");
    //  textoAviso = "* Centro de costo tiene fondos disponibles"; -------->>>>> ingresar parametro en Gherkin.
    String avisoCapturado = solicitudesPage.getEstadoccAvisoLabel().getText();
    assertEquals(avisoCapturado, textoAviso);
  }

  public void ingresaDescripcion(String comentarios) {
    solicitudesPage.getComentarios().clear();
    solicitudesPage.getComentarios().sendKeys(comentarios);
  }

  public void presionarEnviar() {
    solicitudesPage.getEnviarButton().click();
  }

  // 12- rmaturana  - Ingresar Solicitud OBRAS NUEVAS -TIENDA NUEVA OBRA GRUESA+HABILITACION P1  (datos incompletos)
  // 13- rmaturana  - Ingresar Solicitud OBRAS NUEVAS -TIENDA NUEVA OBRA GRUESA+HABILITACION P1
  // 16- ycastaneda - Ingresar Solicitud Remodelaciones-Remodelacion con cambio de Superficie
  public void seleccionarTipoPrototipo(String prototipo) throws Throwable {
    final int tiempoSeg = 7;
    assertTrue(solicitudesPage.fluentWaitVisibilityOfElement(solicitudesPage.getTipoPrototipoList(), tiempoSeg));
    Select prototipos = new Select(solicitudesPage.getTipoPrototipoList());
    prototipos.selectByValue(prototipo);
  }

  //14- ecueto     - Ingresar Solicitud PLANOS-PLANOS  Sin ingresar Datos Obligatorios
  //15- ecueto     - Ingresar Solicitud PLANOS-PLANOS
  public void ingresaTipoPlano(String plano) {
    solicitudesPage.getTipoPlanoTextArea().clear();
    solicitudesPage.getTipoPlanoTextArea().sendKeys(plano);
  }

  public void ingresaFormato(String formato) {
    solicitudesPage.getformatoTextArea().clear();
    solicitudesPage.getformatoTextArea().sendKeys(formato);
  }

  // 18- mruiz      - Ingresar Solicitud Remodelaciones-Obras Civiles Mayores (>500m2)
  public void ingresaNecesidad(String necesidad) {
    solicitudesPage.getNecesidadTextArea().sendKeys(necesidad);
  }

  public void ingresaDescripcionDetallada(String descripcion) {
    solicitudesPage.getDescripcionDetalladaTextArea().clear();
    solicitudesPage.getDescripcionDetalladaTextArea().sendKeys(descripcion);
  }

  public void ingresarFileMecanicaSuelo() throws Throwable {
    String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\img\\Foto.jpg";
    final int tiempoSeg = 5;
    assertTrue("FAILED: visibility getFileMecanicoSueloButton",
        solicitudesPage.waitVisibilityOfElement(solicitudesPage.getFileMecanicoSueloButton(), tiempoSeg));
    solicitudesPage.getFileMecanicoSueloButton().sendKeys(filePath);
    final int tiempoMili = 500;
    Thread.sleep(tiempoMili);
  }

    public void ingresarFileKmz() throws Throwable {
      String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\img\\Foto.jpg";
      final int tiempoSeg = 5;
      assertTrue("FAILED: visibility getFileKmzButton",
          solicitudesPage.waitVisibilityOfElement(solicitudesPage.getFileKmzButton(), tiempoSeg));
      solicitudesPage.getFileKmzButton().sendKeys(filePath);
      final int tiempoMili = 500;
      Thread.sleep(tiempoMili);
    }

    public void ingresarFileFotoTerreno() throws Throwable {
      String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\img\\Foto.jpg";
      final int tiempoSeg = 5;
      assertTrue("FAILED: visibility getFileFotoTerrenoButton",
          solicitudesPage.waitVisibilityOfElement(solicitudesPage.getFileFotoTerrenoButton(), tiempoSeg));
      solicitudesPage.getFileFotoTerrenoButton().sendKeys(filePath);
      final int tiempoMili = 500;
      Thread.sleep(tiempoMili);
    }

    public void ingresarFilePlanoTopografico() throws Throwable {
      String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\pdf\\Documento.pdf";
      final int tiempoSeg = 5;
      assertTrue("FAILED: visibility getFilePlanoTopograficoButton",
          solicitudesPage.waitVisibilityOfElement(solicitudesPage.getFilePlanoTopograficoButton(), tiempoSeg));
      solicitudesPage.getFilePlanoTopograficoButton().sendKeys(filePath);
      final int tiempoMili = 500;
      Thread.sleep(tiempoMili);
    }

    public void ingresarFilePlanoMunicipal() throws Throwable {
      String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\pdf\\Documento.pdf";
      final int tiempoSeg = 5;
      assertTrue("FAILED: visibility getFilePlanoMunicipalButton",
          solicitudesPage.waitVisibilityOfElement(solicitudesPage.getFilePlanoMunicipalButton(), tiempoSeg));
      solicitudesPage.getFilePlanoMunicipalButton().sendKeys(filePath);
      final int tiempoMili = 500;
      Thread.sleep(tiempoMili);
    }

    public void ingresarFileInfoPrevias() throws Throwable {
      String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\pdf\\Documento.pdf";
      final int tiempoSeg = 5;
      assertTrue("FAILED: visibility getFileInfoPreviasButton",
          solicitudesPage.waitVisibilityOfElement(solicitudesPage.getFileInfoPreviasButton(), tiempoSeg));
      solicitudesPage.getFileInfoPreviasButton().sendKeys(filePath);
      final int tiempoMili = 500;
      Thread.sleep(tiempoMili);
    }

    // VALIDACIONES
    public void validarFormularioActividades() throws Throwable {
      final int tiempoSeg = 5;
      assertTrue("FAILED: visibility validarFormularioActividades",
          solicitudesPage.waitVisibilityOfElement(solicitudesPage.getFormActividades(), tiempoSeg));
    }

    public void validarCampoEmpresa(String empresaName) throws Throwable {
       String valueEmpresaName =  (String) ((JavascriptExecutor) driver)
           .executeScript("return document.getElementById('EmpresaName').value");
       assertEquals("FAILED: validarCampoEmpresa", valueEmpresaName, empresaName);
    }

    public void validarCentroCosto() {
      String valueCentroCosto = (String) ((JavascriptExecutor) driver)
          .executeScript("return document.getElementById('CC').value");
      assertNotNull("FAILED: validarCentroCosto es NULL", valueCentroCosto);
    }

    public void validarMensajePopUp(String mensaje) throws Throwable {
      final int tiempoSeg = 5;
      assertTrue("FAILED: visibility validarMensajePopUp",
          solicitudesPage.waitVisibilityOfElement(
              solicitudesPage.getSolicitudesModalPage().getSweetAlertIdSolicitud(),
              tiempoSeg));
      String valorActual = solicitudesPage.getSolicitudesModalPage().getSweetAlertIdSolicitud().getText();
      assertTrue("FAILED: validarMensajePopUp validacion de mensaje",
          valorActual.contains(mensaje));

      // Guardo el id de la solicitud
      guardarIdSolicitud(valorActual);
    }

    /**
     * guardarIdSolicitud, desde un string retorno solo los valores numericos y luego los guardo
     * @param mensaje
     */
    private void guardarIdSolicitud(String mensaje) {
      String input  = String.valueOf(mensaje);
      Pattern p = Pattern.compile("[^0-9]");
      String numericOutput = p.matcher(input).replaceAll("");
      // Seteo la variable que compartire con el id de solicitud
      PropertyReader.setPropertyIdSolicitud(numericOutput);
    }

    public void presionarBotonOkPopUp() throws Throwable {
      final int tiempoSeg = 5;
      assertTrue("FAILED: visibility presionarBotonOkPopUp",
          solicitudesPage.waitVisibilityOfElement(
              solicitudesPage.getSolicitudesModalPage().getSweetAlertConfirmButtom(),
              tiempoSeg));
      solicitudesPage.getSolicitudesModalPage().getSweetAlertConfirmButtom().click();
    }
}
