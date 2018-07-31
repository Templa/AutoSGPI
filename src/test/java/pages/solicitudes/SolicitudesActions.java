package pages.solicitudes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.login.LoginPage;

import static org.junit.Assert.*;

public class SolicitudesActions {
	  WebDriver driver;
	  private SolicitudesPage solicitudesPage;
	  
	  public SolicitudesActions(WebDriver driver) {
		    this.driver = driver;
		    solicitudesPage = new SolicitudesPage(driver);
		  }	  
	  
	  public void seleccionarTipoSolictud(String solicitud) {
		  solicitudesPage.getTipoSolicitud().selectByVisibleText(solicitud);
	  }
	  
	  public void seleccionarActiviad(String actividad) {
		  solicitudesPage.getActividades().selectByVisibleText(actividad);
	  }
	  
	  public void seleccionarEmpresa(String empresa) {
		  solicitudesPage.getEmpresaNameList().selectByVisibleText(empresa);
	  }
	  
	  public void validarCargaSodimacPorDefecto() {
		  String empresaPorDefecto = solicitudesPage.getEmpresaNameLabel().getText();
		  assertEquals(empresaPorDefecto,"Sodimac");
	  }
	  
	  public void seleccionarTienda(String tienda) {
		  solicitudesPage.getTienda().selectByVisibleText(tienda);
	  }
	  
	  
	  public void validaCentroCosto(String textoAviso) {
	      //  if (!solicitudesPage.getEstadoccAvisoLabel().getText().contains(avisoCCtext)){
	      //  	System.out.println("OK");
	  	  //textoAviso = "* Centro de costo tiene fondos disponibles"; -------->>>>> ingresar parametro en Gherkin.
		  String aviso_capturado = solicitudesPage.getEstadoccAvisoLabel().getText();
		  assertEquals(aviso_capturado,textoAviso);
	  }
	  
	  public void ingresaDescripcion(String comentarios) {
		  solicitudesPage.getComentarios().clear();
		  solicitudesPage.getComentarios().sendKeys(comentarios);
	  }

	  public void presionarEnviar(){
	  	  solicitudesPage.getEnviarButton().click();
	  }
	  
	  
	  // 12- rmaturana  - Ingresar Solicitud OBRAS NUEVAS -TIENDA NUEVA OBRA GRUESA+HABILITACION P1  (datos incompletos)
	  // 13- rmaturana  - Ingresar Solicitud OBRAS NUEVAS -TIENDA NUEVA OBRA GRUESA+HABILITACION P1 
	  // 16- ycastaneda - Ingresar Solicitud Remodelaciones-Remodelacion con cambio de Superficie 
	  public void seleccionarTipoPrototipo(String prototipo) {
		  solicitudesPage.getTipoPrototipoList().selectByVisibleText(prototipo);
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

}
