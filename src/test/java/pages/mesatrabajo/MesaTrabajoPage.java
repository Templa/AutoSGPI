package pages.mesatrabajo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.BasePageAbstract;

public class MesaTrabajoPage extends BasePageAbstract {
  /**
   * FindBy
   * id, css, xpath, name, className, etc.
   */

  private final String mesaTrabajo = "/M_Trabajo";

  // PRIMERA FILA

  // LISTA DE ROWS PRIMERA FILA
  @FindBy(css = "div[id^=\"row\"]")
  private List<WebElement> rowList;

  // ROW Subgerencia arqui
  @FindBy(id = "row2")
  private WebElement subGerenciaArquiRow;

  //ROW Subgerencia Lic. Compras
  @FindBy(id = "row4")
  private WebElement subGerenciaLicComRow;

  //ROW Subgerencia obras nuevas
  @FindBy(id = "row1")
  private WebElement subGerenciaObrasNuevasRow;

  //ROW Subgerencia Remodelacion y replicas
  @FindBy(id = "row6")
  private WebElement subGerenciaRemReplRow;

  // titulo row
  // @FindBy(id = "imagen-card-header1")
  private WebElement tituloAreaColumn;

  // imagen
  //  @FindBy(id = "imagen-card-header2")
  private WebElement imagenAreaColumn;

  // n solicitudes
  // @FindBy(id = "seccion1-card-header")
  private WebElement numeroSolicitudesColumn;

  // n mesas
  // @FindBy(id = "seccion1-card-header")
  private WebElement numeroMesasColumn;

  // kpi avance
  // @FindBy(id = "seccion2-card-header")
  private WebElement kpiAvanceColumn;

  // kpi cumplimiento
  // @FindBy(id = "seccion2-card-header")
  private WebElement kpiCumplimientoColumn;

  private WebElement tituloArea;

  // Constructor
  public MesaTrabajoPage(WebDriver driver) {
    super(driver);
  }

  //Getters
  public String getMesaTrabajo() {
    return mesaTrabajo;
  }

  public List<WebElement> getRowList() {
    return rowList;
  }

  public WebElement getTituloAreaColumn(WebElement row) {
    tituloAreaColumn = row.findElement(By.id("imagen-card-header1"));
    return tituloAreaColumn;
  }

  public WebElement getImagenAreaColumn(WebElement row) {
    imagenAreaColumn = row.findElement(By.id("imagen-card-header2"));
    return imagenAreaColumn;
  }

  public WebElement getNumeroSolicitudesColumn(WebElement row) {
    numeroSolicitudesColumn = row.findElement(By.xpath("//div[@id='seccion1-card-header'][1]"));
    return numeroSolicitudesColumn;
  }

  public WebElement getNumeroMesasColumn(WebElement row) {
    numeroMesasColumn = row.findElement(By.xpath("//div[@id='seccion1-card-header'][2]"));
    return numeroMesasColumn;
  }

  public WebElement getKpiAvanceColumn(WebElement row) {
    kpiAvanceColumn = row.findElement(By.xpath("//div[@id='seccion2-card-header'][1]"));
    return kpiAvanceColumn;
  }

  public WebElement getKpiCumplimientoColumn(WebElement row) {
    kpiCumplimientoColumn = row.findElement(By.xpath("//div[@id='seccion2-card-header'][2]"));
    return kpiCumplimientoColumn;
  }

  public WebElement getTituloArea(WebElement row) {
    tituloArea = row.findElement(By.xpath("//div[@id='imagen-card-header1']/p"));
    return tituloArea;
  }

}
