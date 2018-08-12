package pages.mesatrabajo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.BasePageAbstract;

public class MesaTrabajoDetallePage extends BasePageAbstract {
  /**
   * FindBy
   * id, css, xpath, name, className, etc.
   */

  private final String detalleMesaTrabajo = "/detalleMesa2.html";

  // Cabecera columna A
  @FindBy(xpath = "//div[@id = 'cabecera']//div[@id = 'columnaA']")
  private WebElement cabeceraColumnaA;

  @FindBy(xpath = "//div[@id = 'cabecera']//div[@id = 'columnaA']/p")
  private List<WebElement> contenidoCabeceraColumnaA;

  @FindBy(xpath = "//*[@id='nombreMesa1']")
  private WebElement contenidoCabeceraColumnaAnombreMesa1;

  @FindBy(xpath = "//*[@id='Area']")
  private WebElement contenidoCabeceraColumnaAarea;

  @FindBy(xpath = "//*[@id='Tipo']")
  private WebElement contenidoCabeceraColumnaAtipo;

  // Cabecera columna B
  @FindBy(xpath = "//div[@id = 'cabecera']//div[@id = 'columnaB']")
  private WebElement cabeceraColumnaB;

  @FindBy(xpath = "//div[@id = 'cabecera']//div[@id = 'columnaB']//div[@id = 'columna1']//th")
  private WebElement tituloCabeceraColumnaB;

  @FindBy(xpath = "//div[@id = 'cabecera']//div[@id = 'columnaB']//div[@id = 'columna1']//td[@id='CANTIDAD_PROYECTOS_TIPOGRUPO']")
  private WebElement numSolicitudesCabeceraColumnaB;

  @FindBy(xpath = "//div[@id = 'cabecera']//div[@id = 'columnaB']//div[@id = 'columna2']//div[@id='principalGrafico']")
  private WebElement kpiAvanceCabeceraColumnaB;

  @FindBy(xpath = "//div[@id = 'cabecera']//div[@id = 'columnaB']//div[@id = 'columna3']//div[@id='principalGrafico2']")
  private WebElement kpiCumplimientoCabeceraColumnaB;

  // Cuerpo columna 1
  @FindBy(xpath = "//div[@id = 'cuerpo']//div[@id = 'cuerpoColumna1']")
  private WebElement cuerpoColumna1;

  @FindBy(xpath = "//div[@id = 'cuerpo']//div[@id = 'cuerpoColumna1']//h6")
  private WebElement tituloCuerpoColumna1;

  @FindBy(xpath = "//div[@id = 'cuerpo']//div[@id = 'cuerpoColumna1']//div[@id='tablaConstruccionMesa_wrapper']//div[@class='dataTables_scrollHeadInner']//tr/th")
  private List<WebElement> titulosTablaCuerpoColumna1;

  @FindBy(xpath = "//div[@id = 'cuerpo']//div[@id = 'cuerpoColumna1']//div[@id='tablaConstruccionMesa_wrapper']//div[@class='dataTables_scrollBody']//tbody/tr")
  private List<WebElement> contenidoTablaCuerpoColumna1;

  // Cuerpo columna 2
  @FindBy(xpath = "//div[@id = 'cuerpo']//div[@id = 'cuerpoColumna2']")
  private WebElement cuerpoColumna2;

  @FindBy(xpath = "//div[@id = 'cuerpo']//div[@id = 'cuerpoColumna2']//h6")
  private WebElement tituloCuerpoColumna2;

  @FindBy(xpath = "//div[@id = 'cuerpo']//div[@id = 'cuerpoColumna2']//div[@id='tablaTiendas_wrapper']//div[@class='dataTables_scrollHeadInner']//tr/th")
  private List<WebElement> titulosTablaCuerpoColumna2;

  @FindBy(xpath = "//div[@id = 'cuerpo']//div[@id = 'cuerpoColumna2']//div[@id='tablaTiendas_wrapper']//div[@class='dataTables_scrollBody']//tbody/tr")
  private List<WebElement> contenidoTablaCuerpoColumna2;

  // Cuerpo columna B
  @FindBy(xpath = "//div[@id = 'cuerpo']//div[@id = 'cuerpoColumnaB']")
  private WebElement cuerpoColumnaB;

  @FindBy(xpath = "//div[@id = 'cuerpo']//div[@id = 'cuerpoColumnaB']/h6")
  private WebElement tituloCuerpoColumnaB;

  @FindBy(xpath = "//div[@id = 'cuerpo']//div[@id = 'cuerpoColumnaB']//div[@id='tablaSolicitudes_wrapper']//div[@class='dataTables_scrollHeadInner']//thead/tr/th")
  private List<WebElement> titulosTablaCuerpoColumnaB;

  @FindBy(xpath = "//div[@id = 'cuerpo']//div[@id = 'cuerpoColumnaB']//div[@id='tablaSolicitudes_wrapper']//div[@class='dataTables_scrollBody']//tbody/tr")
  private List<WebElement> contenidoTablaCuerpoColumnaB;
  // Constructor
  public MesaTrabajoDetallePage(WebDriver driver) {
    super(driver);
  }

  //Getters
  public String getDetalleMesaTrabajo() {
    return detalleMesaTrabajo;
  }

  public WebElement getCabeceraColumnaA() {
    return cabeceraColumnaA;
  }

  public List<WebElement> getContenidoCabeceraColumnaA() {
    return contenidoCabeceraColumnaA;
  }

  public WebElement getCabeceraColumnaB() {
    return cabeceraColumnaB;
  }

  public WebElement getTituloCabeceraColumnaB() {
    return tituloCabeceraColumnaB;
  }

  public WebElement getNumSolicitudesCabeceraColumnaB() {
    return numSolicitudesCabeceraColumnaB;
  }

  public WebElement getKpiAvanceCabeceraColumnaB() {
    return kpiAvanceCabeceraColumnaB;
  }

  public WebElement getKpiCumplimientoCabeceraColumnaB() {
    return kpiCumplimientoCabeceraColumnaB;
  }

  public WebElement getCuerpoColumna1() {
    return cuerpoColumna1;
  }

  public WebElement getTituloCuerpoColumna1() {
    return tituloCuerpoColumna1;
  }

  public List<WebElement> getTitulosTablaCuerpoColumna1() {
    return titulosTablaCuerpoColumna1;
  }

  public List<WebElement> getContenidoTablaCuerpoColumna1() {
    return contenidoTablaCuerpoColumna1;
  }

  public WebElement getCuerpoColumna2() {
    return cuerpoColumna2;
  }

  public WebElement getTituloCuerpoColumna2() {
    return tituloCuerpoColumna2;
  }

  public List<WebElement> getTitulosTablaCuerpoColumna2() {
    return titulosTablaCuerpoColumna2;
  }

  public List<WebElement> getContenidoTablaCuerpoColumna2() {
    return contenidoTablaCuerpoColumna2;
  }

  public WebElement getCuerpoColumnaB() {
    return cuerpoColumnaB;
  }

  public WebElement getTituloCuerpoColumnaB() {
    return tituloCuerpoColumnaB;
  }

  public List<WebElement> getTitulosTablaCuerpoColumnaB() {
    return titulosTablaCuerpoColumnaB;
  }

  public List<WebElement> getContenidoTablaCuerpoColumnaB() {
    return contenidoTablaCuerpoColumnaB;
  }

  public WebElement getContenidoCabeceraColumnaAnombreMesa1() {
    return contenidoCabeceraColumnaAnombreMesa1;
  }

  public WebElement getContenidoCabeceraColumnaAarea() {
    return contenidoCabeceraColumnaAarea;
  }

  public WebElement getContenidoCabeceraColumnaAtipo() {
    return contenidoCabeceraColumnaAtipo;
  }

}
