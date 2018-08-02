package pages.solicitudes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import pages.BasePageAbstract;

public class SolicitudesPage extends BasePageAbstract{

	public SolicitudesPage(WebDriver driver) {
		super(driver);
	}
  
	@FindBy(css = "#formSolicitud > div  h5")
  private WebElement formSolicitudTitle;
	
	  @FindBy(id = "tipoSolicitud")
	  private WebElement solicitudList;
	  
	  @FindBy(id = "Actividades")
	  private WebElement actividadesList;
	  
	  @FindBy(id = "EmpresaName")
	  private WebElement empresaList;
	  
	  @FindBy(id = "EmpresaName")
	  private WebElement empresaField;
	  
	  @FindBy(id = "tienda")
	  private WebElement tiendaList;
	  
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
	@FindBy(css = "div#formPlus1 select[name='Tippro']")
	private WebElement tipoPrototipoList;

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

  public WebElement getEmpresaNameLabel() {
	  return empresaField;
  }
  
  public WebElement getSolicitudList() {
    return solicitudList;
  }

  public WebElement getActividadesList() {
    return actividadesList;
  }

  public WebElement getEmpresaList() {
    return empresaList;
  }

  public WebElement getTiendaList() {
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

	public WebElement getFileMecanicoSueloButton(){
		return fileKmzButton;
	}

	public WebElement getTipoPrototipoList() {
    return tipoPrototipoList;
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

  public WebElement getFormSolicitudTitle() {
    return formSolicitudTitle;
  }

  public WebElement getEmpresaField() {
    return empresaField;
  }

  public WebElement getCentroCostoField() {
    return centroCostoField;
  }

  public WebElement getFechaField() {
    return fechaField;
  }

  public WebElement getComentariosField() {
    return comentariosField;
  }

  public WebElement getFormatoTextArea() {
    return formatoTextArea;
  }

}