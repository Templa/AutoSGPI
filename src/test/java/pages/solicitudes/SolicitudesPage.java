package pages.solicitudes;

import java.net.URL;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import pages.BasePageAbstract;
import utils.PropertyReader;

public class SolicitudesPage extends BasePageAbstract{

	public SolicitudesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	  @FindBy(id = "tipoSolicitud")
	  private Select solicitudList;
	  
	  @FindBy(id = "Actividades")
	  private Select actividadesList;
	  
	  @FindBy(id = "EmpresaName")
	  private Select empresaList;
	  
	  @FindBy(id = "EmpresaName")
	  private WebElement empresaField;
	  
	  @FindBy(id = "tienda")
	  private Select tiendaList;
	  
	  @FindBy(id = "CC")
	  private WebElement centroCostoField;
	  
	  @FindBy(id = "estadocc")
	  private WebElement estadoccAvisoLabel;
	  
	  @FindBy(id = "fecha")
	  private WebElement fechaField;
	  
	  @FindBy(id = "comentarios")
	  private WebElement comentariosField;
	  
	  @FindBy(id = "submit")
	  private WebElement enviarButton;
	  
	// SELECCION ARCHIVOS TIPO DE SOLICITUD ==> 12. OBRAS NUEVAS -TIENDA NUEVA OBRA GRUESA+HABILITACION P1 
	// SELECCION ARCHIVOS TIPO DE SOLICITUD ==> 13. Remodelaciones-Remodelacion con cambio de Superficie
	@FindBy(id = "jsonform-1-elt-Tippro")
	private Select tipoPrototipoList;

	@FindBy(id = "_transloadit_jsonform-0-elt-mecsue")
	private WebElement fileMecanicoSueloButton;

	@FindBy(id = "_transloadit_jsonform-0-elt-kmz")
	private WebElement fileKmzButton;

	@FindBy(id = "_transloadit_jsonform-0-elt-foto1")
	private WebElement fileFotoTerrenoButton;

	@FindBy(id = "_transloadit_jsonform-0-elt-fototop")
	private WebElement filePlanoTopograficoButton;

	@FindBy(id = "_transloadit_jsonform-0-elt-foto2")
	private WebElement filePlanoMunicipalButton;

	@FindBy(id = "_transloadit_jsonform-0-elt-foto3")
	private WebElement fileInfoPreviasButton;
	
	// SELECCION ARCHIVOS TIPO DE SOLICITUD ==> 15.PLANOS-PLANOS 
	@FindBy(id = "jsonform-0-elt-Necesidad")
	private WebElement tipoPlanoTextArea;

	@FindBy(id = "jsonform-0-elt-Esquema")
	private WebElement formatoTextArea;
	
	// SELECCION ARCHIVOS TIPO DE SOLICITUD ==> 17.Instalaciones-Instalaciones Sanitarias Mesas de Jardin
	@FindBy(id = "_transloadit_jsonform-0-elt-backgroundimage")
	private WebElement fileSolicitudUbicacionButton;
	
		
	// SELECCION ARCHIVOS TIPO DE SOLICITUD ==> 18.Remodelaciones-Obras Civiles Mayores (>500m2)
	// SELECCION ARCHIVOS TIPO DE SOLICITUD ==> 17.Instalaciones-Instalaciones Sanitarias Mesas de Jardin
	@FindBy(id = "_transloadit_jsonform-0-elt-backgroundimage")
	private WebElement fileFotoButton;

	@FindBy(id = "jsonform-0-elt-descripcion")
	private WebElement necesidadTextArea;

	@FindBy(id = "jsonform-0-elt-descripcion1")
	private WebElement descripcionDetalladaTextArea;
	  

	  
	  
//Getters 
	  public Select getTipoSolicitud() {
		  return solicitudList;
	  }
	  
	  public Select getActividades() {
		  return actividadesList;
	  }
	  
	  public Select getEmpresaNameList() {
		  return empresaList;
	  }
	  
	  public WebElement getEmpresaNameLabel() {
		  return empresaField;
	  }
	  
	  public Select getTienda() {
		  return tiendaList;
	  }
	  
	  public WebElement getEstadoccAvisoLabel() {
		  return estadoccAvisoLabel;
	  }
	  
	  public WebElement getComentarios() {
		  return comentariosField;
	  }
	  
	  public WebElement getEnviarButton(){
			return enviarButton;
		}
	  
	// SELECCION ARCHIVOS TIPO DE SOLICITUD ==> 12. OBRAS NUEVAS -TIENDA NUEVA OBRA GRUESA+HABILITACION P1 
	// SELECCION ARCHIVOS TIPO DE SOLICITUD ==> 13. Remodelaciones-Remodelacion con cambio de Superficie
	  public Select getTipoPrototipoList(){
			return tipoPrototipoList;
		}

		public WebElement getFileMecanicoSueloButton(){
			return fileKmzButton;
		}

		public WebElement getFileKmzButton(){
			return fileKmzButton;
		}

		public WebElement getFileFotoTerrenoButton(){
			return fileFotoTerrenoButton;
		}

		public WebElement getFilePlanoTopograficoButton(){
			return filePlanoTopograficoButton;
		}

		public WebElement getFilePlanoMunicipalButton(){
			return filePlanoMunicipalButton;
		}

		public WebElement getFileInfoPreviasButton(){
			return fileInfoPreviasButton;
		}
		
		// SELECCION ARCHIVOS TIPO DE SOLICITUD ==> 15.PLANOS-PLANOS 
		public WebElement getTipoPlanoTextArea(){
			return tipoPlanoTextArea;
		}

		public WebElement getformatoTextArea(){
			return formatoTextArea;
		}		
		// SELECCION ARCHIVOS TIPO DE SOLICITUD ==> 17.Instalaciones-Instalaciones Sanitarias Mesas de Jardin
		public WebElement getFileSolicitudUbicacionButton() {
			return fileSolicitudUbicacionButton;
		}
		
		// SELECCION ARCHIVOS TIPO DE SOLICITUD ==> 18.Remodelaciones-Obras Civiles Mayores (>500m2)
		// SELECCION ARCHIVOS TIPO DE SOLICITUD ==> 17.Instalaciones-Instalaciones Sanitarias Mesas de Jardin
		public WebElement getFileFotoButton(){
			return fileFotoButton;
		}

		public WebElement getNecesidadTextArea(){
			return necesidadTextArea;
		}

		public WebElement getDescripcionDetalladaTextArea(){
			return descripcionDetalladaTextArea;
		}
	  
	  
}