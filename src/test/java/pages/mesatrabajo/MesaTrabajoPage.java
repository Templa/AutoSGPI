package pages.mesatrabajo;

import static org.junit.Assert.fail;

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

  @FindBy(xpath = "//div[@data-idarea='2']//div[contains(@class, 'collapse')]")
  private WebElement subGerenciaArquiSegundoNivel;

  //ROW Subgerencia Lic. Compras
  @FindBy(id = "row4")
  private WebElement subGerenciaLicComRow;

  @FindBy(xpath = "//div[@data-idarea='4']//div[contains(@class, 'collapse')]")
  private WebElement subGerenciaLicComSegundoNivel;

  //ROW Subgerencia obras nuevas
  @FindBy(id = "row1")
  private WebElement subGerenciaObrasNuevasRow;

  @FindBy(xpath = "//div[@data-idarea='1']//div[contains(@class, 'collapse')]")
  private WebElement subGerenciaObrasNuevasSegundoNivel;

  //ROW Subgerencia Remodelacion y replicas
  @FindBy(id = "row6")
  private WebElement subGerenciaRemReplRow;

  @FindBy(xpath = "//div[@data-idarea='6']//div[contains(@class, 'collapse')]")
  private WebElement subGerenciaRemReplSegundoNivel;

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

  public WebElement getSubGerenciaArquiRow() {
    return subGerenciaArquiRow;
  }

  public WebElement getSubGerenciaLicComRow() {
    return subGerenciaLicComRow;
  }

  public WebElement getSubGerenciaObrasNuevasRow() {
    return subGerenciaObrasNuevasRow;
  }

  public WebElement getSubGerenciaRemReplRow() {
    return subGerenciaRemReplRow;
  }

  // SEGUNDO NIVEL
  public WebElement getSubGerenciaArquiSegundoNivel() {
    return subGerenciaArquiSegundoNivel;
  }

  public WebElement getSubGerenciaLicComSegundoNivel() {
    return subGerenciaLicComSegundoNivel;
  }

  public WebElement getSubGerenciaObrasNuevasSegundoNivel() {
    return subGerenciaObrasNuevasSegundoNivel;
  }

  public WebElement getSubGerenciaRemReplSegundoNivel() {
    return subGerenciaRemReplSegundoNivel;
  }

  // Retorno una lista con todas las subareas según area de gerencia
  public List<WebElement> listSubAreas(String nombreArea) {
    List<WebElement> listSubAreas;
    switch (nombreArea) {
      case "Subgerencia Arquitectura":
        listSubAreas = getSubGerenciaArquiSegundoNivel().findElements(By.xpath("//div[@data-idarea='2']//div[contains(@class, 'collapse')]//div[@id='Fila1']"));
        return listSubAreas;
      case "Subgerencia Lic. y Compras":
        listSubAreas = getSubGerenciaLicComSegundoNivel().findElements(By.xpath("//div[@data-idarea='4']//div[contains(@class, 'collapse')]//div[@id='Fila1']"));
        return listSubAreas;
      case "Subgerencia Obras Nuevas":
        listSubAreas = getSubGerenciaObrasNuevasSegundoNivel().findElements(By.xpath("//div[@data-idarea='1']//div[contains(@class, 'collapse')]//div[@id='Fila1']"));
        return listSubAreas;
      case "Subgerencia Remodelacion y Réplicas":
        listSubAreas = getSubGerenciaRemReplSegundoNivel().findElements(By.xpath("//div[@data-idarea='6']//div[contains(@class, 'collapse')]//div[@id='Fila1']"));
        return listSubAreas;
      default:
       return null;
    }
  }

  public WebElement getNumSolicitudesSubArea(WebElement subArea) {
    WebElement numSolicitudes = subArea.findElement(By.xpath("//div[@id='segundaFila_columnaB']//td[1]"));
    return numSolicitudes;
  }

  public WebElement getNumMesasSubArea(WebElement subArea) {
    WebElement numMesas = subArea.findElement(By.xpath("//div[@id='segundaFila_columnaB']//td[2]"));
    return numMesas;
  }

  public WebElement getNumTiendasSubArea(WebElement subArea) {
    WebElement numTiendas = subArea.findElement(By.xpath("//div[@class='card-2']//td[1]"));
    return numTiendas;
  }

  public WebElement getNombreMesaSubArea(WebElement subArea) {
    // Toma el primero
    WebElement numTiendas = subArea.findElement(By.xpath("//div[@class='card']//div[contains(@class, 'NombreMesa')]"));
    return numTiendas;
  }

}
