package pages.solicitudes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.BasePageAbstract;

public class SolicitudesPage extends BasePageAbstract {

  @FindBy(css = "#formSolicitud > div  h5")
  private WebElement formSolicitudTitle;

  @FindBy(id = "tipoSolicitud")
  private WebElement solicitudList;

  @FindBy(id = "Actividades")
  private WebElement actividadesList;

  @FindBy(id = "EmpresaName")
  private WebElement empresaList;

  @FindBy(css = "label[for='EmpresaName']")
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

  // FORMULARIO DE ACTIVIDADES
  @FindBy(id = "formPlus1")
  private WebElement formActividades;

  @FindBy(css = "div#formPlus1 select[name='Tippro']")
  private WebElement tipoPrototipoList;

  @FindBy(css = "div#formPlus1 input[name='_transloadit_jsonform_genericupload_public_1']")
  private WebElement fileMecanicoSueloButton;

  @FindBy(css = "div#formPlus1 input[name='_transloadit_jsonform_genericupload_public_2']")
  private WebElement fileKmzButton;

  @FindBy(css = "div#formPlus1 input[name='_transloadit_jsonform_genericupload_public_3']")
  private WebElement fileFotoTerrenoButton;

  @FindBy(css = "div#formPlus1 input[name='_transloadit_jsonform_genericupload_public_4']")
  private WebElement filePlanoTopograficoButton;

  @FindBy(css = "div#formPlus1 input[name='_transloadit_jsonform_genericupload_public_5']")
  private WebElement filePlanoMunicipalButton;

  @FindBy(css = "div#formPlus1 input[name='_transloadit_jsonform_genericupload_public_6']")
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

  // SolicitudesModalPage
  SolicitudesModalPage solicitudesModalPage;

  public SolicitudesPage(WebDriver driver) {
    super(driver);
    solicitudesModalPage = new SolicitudesModalPage(driver);
  }

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

  public WebElement getEnviarButton() {
    return enviarButton;
  }

  // SELECCION ARCHIVOS TIPO DE SOLICITUD ==> 12. OBRAS NUEVAS -TIENDA NUEVA OBRA GRUESA+HABILITACION P1
  // SELECCION ARCHIVOS TIPO DE SOLICITUD ==> 13. Remodelaciones-Remodelacion con cambio de Superficie

  public WebElement getFileMecanicoSueloButton() {
    return fileMecanicoSueloButton;
  }

  public WebElement getFormActividades() {
    return formActividades;
  }

  public WebElement getTipoPrototipoList() {
    return tipoPrototipoList;
  }

  public WebElement getFileKmzButton() {
    return fileKmzButton;
  }

  public WebElement getFileFotoTerrenoButton() {
    return fileFotoTerrenoButton;
  }

  public WebElement getFilePlanoTopograficoButton() {
    return filePlanoTopograficoButton;
  }

  public WebElement getFilePlanoMunicipalButton() {
    return filePlanoMunicipalButton;
  }

  public WebElement getFileInfoPreviasButton() {
    return fileInfoPreviasButton;
  }

  // SELECCION ARCHIVOS TIPO DE SOLICITUD ==> 15.PLANOS-PLANOS
  public WebElement getTipoPlanoTextArea() {
    return tipoPlanoTextArea;
  }

  public WebElement getformatoTextArea() {
    return formatoTextArea;
  }
  // SELECCION ARCHIVOS TIPO DE SOLICITUD ==> 17.Instalaciones-Instalaciones Sanitarias Mesas de Jardin
  public WebElement getFileSolicitudUbicacionButton() {
    return fileSolicitudUbicacionButton;
  }

  // SELECCION ARCHIVOS TIPO DE SOLICITUD ==> 18.Remodelaciones-Obras Civiles Mayores (>500m2)
  // SELECCION ARCHIVOS TIPO DE SOLICITUD ==> 17.Instalaciones-Instalaciones Sanitarias Mesas de Jardin
  public WebElement getFileFotoButton() {
    return fileFotoButton;
  }

  public WebElement getNecesidadTextArea() {
    return necesidadTextArea;
  }

  public WebElement getDescripcionDetalladaTextArea() {
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

  public SolicitudesModalPage getSolicitudesModalPage() {
    return solicitudesModalPage;
  }

}
