package pages.mesatrabajo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

public class MesaTrabajoActions {
  WebDriver driver;
  private MesaTrabajoPage mesaTrabajo;

  public MesaTrabajoActions(WebDriver driver) {
    this.driver = driver;
    mesaTrabajo = new MesaTrabajoPage(driver);
  }


  public void verAreasConMesaDeTrabajo(List<String> areas) throws Throwable {
    int contador = 0;
    String resultadoNull = "NO ENCONTRADOS:";
    for (String area : areas) {
      if (mesaTrabajo.findOneElementInList(mesaTrabajo.getRowList(), area) == null) {
        contador++;
        resultadoNull = resultadoNull + " " + area;
      }
    }
    // Si el contador es mayor a 0 significa que no encontro al menos 1 area
    if (contador > 0) {
      fail("FAILED: verAreasConMesaDeTrabajo - " + resultadoNull);
    }
  }

  // VALIDO QUE TODAS LAS FILAS CONTENGAN X ELEMENTO
  public void verNumeroSolicitudMT() throws Throwable {
    final String numeroSolicitudText = "N° Solicitudes";
    int contador = 0;
    for (WebElement element : mesaTrabajo.getRowList()) {
      if (!mesaTrabajo.getNumeroSolicitudesColumn(element).getText().contains(numeroSolicitudText)) {
        contador++;
      }
    }
    // Si el contador es mayor a 0 significa que no encontro al menos 1 titulo
    if (contador > 0) {
      fail("FAILED: verNumeroSolicitudMT, favor revisar que todas las areas posean: " + numeroSolicitudText);
    }
  }

  public void verNumerMesasPorArea() throws Throwable {
    final String numeroMesasText = "N° Mesas";
    int contador = 0;
    for (WebElement element : mesaTrabajo.getRowList()) {
      if (!mesaTrabajo.getNumeroMesasColumn(element).getText().contains(numeroMesasText)) {
        contador++;
      }
    }
    // Si el contador es mayor a 0 significa que no encontro al menos 1 titulo
    if (contador > 0) {
      fail("FAILED: verNumerMesasPorArea, favor revisar que todas las areas posean: " + numeroMesasText);
    }
  }

  public void verKpiAvance() throws Throwable {
    final String kpiAvanceText = "KPI Avance";
    int contador = 0;
    for (WebElement element : mesaTrabajo.getRowList()) {
      if (!mesaTrabajo.getKpiAvanceColumn(element).getText().contains(kpiAvanceText)) {
        contador++;
      }
    }
    // Si el contador es mayor a 0 significa que no encontro al menos 1 titulo
    if (contador > 0) {
      fail("FAILED: verKpiAvance, favor revisar que todas las areas posean: " + kpiAvanceText);
    }
  }

  public void verKpiCumplimiento() throws Throwable {
    final String kpiCumplimientoText = "KPI Cumplimiento";
    int contador = 0;
    for (WebElement element : mesaTrabajo.getRowList()) {
      if (!mesaTrabajo.getKpiCumplimientoColumn(element).getText().contains(kpiCumplimientoText)) {
        contador++;
      }
    }
    // Si el contador es mayor a 0 significa que no encontro al menos 1 titulo
    if (contador > 0) {
      fail("FAILED: verKpiCumplimiento, favor revisar que todas las areas posean: " + kpiCumplimientoText);
    }
  }

  public void verPopUpSobreMT(String toolTipText) throws Throwable {
    int contador = 0;
    Actions action = new Actions(driver);
    for (WebElement element : mesaTrabajo.getRowList()) {
      if (!mesaTrabajo.getTituloArea(element).getAttribute("data-original-title").contains(toolTipText)) {
        contador++;
      } else {
        action.clickAndHold(mesaTrabajo.getTituloArea(element))
          .build()
          .perform();
      }
    }

    // Si el contador es mayor a 0 significa que no encontro al menos 1 titulo
    if (contador > 0) {
      fail("FAILED: verPopUpSobreMT, favor revisar que todas las areas posean: " + toolTipText);
    }
  }

  public void clickNombreSubgerenciaArea(String nombreArea) throws Throwable {
    assertNotNull(mesaTrabajo.findOneElementInList(mesaTrabajo.getRowList(), nombreArea));
    switch (nombreArea) {
      case "Subgerencia Arquitectura":
        mesaTrabajo.getTituloArea(mesaTrabajo.getSubGerenciaArquiRow()).click();
        break;
      case "Subgerencia Lic. y Compras":
        mesaTrabajo.getTituloArea(mesaTrabajo.getSubGerenciaLicComRow()).click();
        break;
      case "Subgerencia Obras Nuevas":
        mesaTrabajo.getTituloArea(mesaTrabajo.getSubGerenciaObrasNuevasRow()).click();
        break;
      case "Subgerencia Remodelacion y Réplicas":
        mesaTrabajo.getTituloArea(mesaTrabajo.getSubGerenciaRemReplRow()).click();
        break;
      default:
        fail("FAILED: clickNombreSubgerenciaArea, favor revise que el area tenga le mismo nombre que " + nombreArea);
    }
  }

  public void visualizarTiposMesasPorArea(String nombreArea) throws Throwable {
    switch (nombreArea) {
      case "Subgerencia Arquitectura":
        assertTrue("FAILED: visualizarTiposMesasPorArea " + nombreArea + "No se visualiza",
            mesaTrabajo.getSubGerenciaArquiSegundoNivel()
              .getAttribute("class")
              .contains("show")
            );
        break;
      case "Subgerencia Lic. y Compras":
        assertTrue("FAILED: visualizarTiposMesasPorArea " + nombreArea + "No se visualiza",
            mesaTrabajo.getSubGerenciaLicComSegundoNivel()
              .getAttribute("class")
              .contains("show")
            );
        break;
      case "Subgerencia Obras Nuevas":
        assertTrue("FAILED: visualizarTiposMesasPorArea " + nombreArea + "No se visualiza",
            mesaTrabajo.getSubGerenciaObrasNuevasSegundoNivel()
              .getAttribute("class")
              .contains("show")
            );
        break;
      case "Subgerencia Remodelacion y Réplicas":
        assertTrue("FAILED: visualizarTiposMesasPorArea " + nombreArea + "No se visualiza",
            mesaTrabajo.getSubGerenciaRemReplSegundoNivel()
              .getAttribute("class")
              .contains("show")
            );
        break;
      default:
        fail("FAILED: visualizarTiposMesasPorArea, favor revise que el area tenga le mismo nombre que " + nombreArea);
    }
  }

  public void visualizarNumeroSolicitudesPorSubArea(String nombreArea, String subArea) throws Throwable {
   assertNotNull("FAILED: visualizarNumeroSolicitudesPorSubArea " + nombreArea + " Favor revise que el area posea subareas",
       mesaTrabajo.listSubAreas(nombreArea));
   WebElement encontrarSubArea = null;
   for (WebElement subAreaElement : mesaTrabajo.listSubAreas(nombreArea)) {
     if (subAreaElement.getText().contains(subArea)) {
       encontrarSubArea = subAreaElement;
     }
   }
   assertNotNull("FAILED: visualizarNumeroSolicitudesPorSubArea Favor revisa que el subarea exista " + subArea, encontrarSubArea);

   assertTrue("FAILED: visualizarNumeroSolicitudesPorSubArea contains N° Solicitudes",
       encontrarSubArea.getText().contains("N° Solicitudes"));

   String numeroSolicitudes = mesaTrabajo.getNumSolicitudesSubArea(encontrarSubArea).getText();
   assertNotNull("FAILED: visualizarNumeroSolicitudesPorSubArea numeroSolicitudes VACIO",
       numeroSolicitudes);
  }

  public void visualizarNumeroMesasPorSubArea(String nombreArea, String subArea) throws Throwable {
    assertNotNull("FAILED: visualizarNumeroMesasPorSubArea " + nombreArea + " Favor revise que el area posea subareas",
        mesaTrabajo.listSubAreas(nombreArea));
    WebElement encontrarSubArea = null;
    for (WebElement subAreaElement : mesaTrabajo.listSubAreas(nombreArea)) {
      if (subAreaElement.getText().contains(subArea)) {
        encontrarSubArea = subAreaElement;
      }
    }
    assertNotNull("FAILED: visualizarNumeroMesasPorSubArea Favor revisa que el subarea exista " + subArea, encontrarSubArea);

    assertTrue("FAILED: visualizarNumeroMesasPorSubArea contains N° Mesas",
        encontrarSubArea.getText().contains("N° Mesas"));

    String numeroMesas = mesaTrabajo.getNumMesasSubArea(encontrarSubArea).getText();
    assertNotNull("FAILED: visualizarNumeroMesasPorSubArea numeroMesas VACIO",
        numeroMesas);
  }

  public void visualizarNumeroTiendasPorSubArea(String nombreArea, String subArea) throws Throwable {
    assertNotNull("FAILED: visualizarNumeroTiendasPorSubArea " + nombreArea + " Favor revise que el area posea subareas",
        mesaTrabajo.listSubAreas(nombreArea));
    WebElement encontrarSubArea = null;
    for (WebElement subAreaElement : mesaTrabajo.listSubAreas(nombreArea)) {
      if (subAreaElement.getText().contains(subArea)) {
        encontrarSubArea = subAreaElement;
      }
    }
    assertNotNull("FAILED: visualizarNumeroTiendasPorSubArea Favor revisa que el subarea exista " + subArea, encontrarSubArea);

    assertTrue("FAILED: visualizarNumeroTiendasPorSubArea contains N° Tiendas",
        encontrarSubArea.getText().contains("N° Tiendas"));

    String numeroTiendas = mesaTrabajo.getNumTiendasSubArea(encontrarSubArea).getText();
    assertNotNull("FAILED: visualizarNumeroTiendasPorSubArea numeroMesas VACIO",
        numeroTiendas);
  }

  public void visualizarKpiAvancePorSubArea(String nombreArea, String subArea) throws Throwable {
    assertNotNull("FAILED: visualizarKpiAvancePorSubArea " + nombreArea + " Favor revise que el area posea subareas",
        mesaTrabajo.listSubAreas(nombreArea));
    WebElement encontrarSubArea = null;
    for (WebElement subAreaElement : mesaTrabajo.listSubAreas(nombreArea)) {
      if (subAreaElement.getText().contains(subArea)) {
        encontrarSubArea = subAreaElement;
      }
    }
    assertNotNull("FAILED: visualizarKpiAvancePorSubArea Favor revisa que el subarea exista " + subArea, encontrarSubArea);

    assertTrue("FAILED: visualizarKpiAvancePorSubArea contains KPI Avance",
        encontrarSubArea.getText().contains("KPI Avance"));
  }
  public void visualizarKpiCumplimientoPorSubArea(String nombreArea, String subArea) throws Throwable {
    assertNotNull("FAILED: visualizarKpiCumplimientoPorSubArea " + nombreArea + " Favor revise que el area posea subareas",
        mesaTrabajo.listSubAreas(nombreArea));
    WebElement encontrarSubArea = null;
    for (WebElement subAreaElement : mesaTrabajo.listSubAreas(nombreArea)) {
      if (subAreaElement.getText().contains(subArea)) {
        encontrarSubArea = subAreaElement;
      }
    }
    assertNotNull("FAILED: visualizarKpiCumplimientoPorSubArea Favor revisa que el subarea exista " + subArea, encontrarSubArea);

    assertTrue("FAILED: visualizarKpiCumplimientoPorSubArea contains KPI Cumplimiento en Plazo",
        encontrarSubArea.getText().contains("KPI CUMPLIMIENTO EN PLAZO"));
  }

  public void validarTextoAlPosicionarseSobreNombreMesaTrabajo(String texto, String nombreArea, String subArea) throws Throwable {
    assertNotNull("FAILED: validarTextoAlPosicionarseSobreNombreMesaTrabajo " + nombreArea + " Favor revise que el area posea subareas",
        mesaTrabajo.listSubAreas(nombreArea));
    WebElement encontrarSubArea = null;
    for (WebElement subAreaElement : mesaTrabajo.listSubAreas(nombreArea)) {
      if (subAreaElement.getText().contains(subArea)) {
        encontrarSubArea = subAreaElement;
      }
    }
    assertNotNull("FAILED: validarTextoAlPosicionarseSobreNombreMesaTrabajo Favor revisa que el subarea exista " + subArea,
        encontrarSubArea);
    // Posicionarse sobre el elemento para validar el color
    Actions action = new Actions(driver);
    action.moveToElement(mesaTrabajo.getNombreMesaSubArea(encontrarSubArea))
          .build()
          .perform();
    String color = mesaTrabajo.getNombreMesaSubArea(encontrarSubArea).getCssValue("color");
    String hex = Color.fromString(color).asHex();
    assertEquals(hex, "#000000");
    // TODO: PENDIENTE VALIDAR TEXTO NO ESTAN DISPONIBLES
    /*
    assertTrue("FAILED: validarTextoAlPosicionarseSobreNombreMesaTrabajo contains " + texto,
        mesaTrabajo.getNombreMesaSubArea(encontrarSubArea)
          .getText()
          .contains(texto);
    */
  }

  // TERCER NIVEL

  public void presionarPrimerNombreMesa(String nombreArea, String subArea)  throws Throwable {
    assertNotNull("FAILED: presionarPrimerNombreMesa " + nombreArea + " Favor revise que el area posea subareas",
        mesaTrabajo.listSubAreas(nombreArea));
    WebElement encontrarSubArea = null;
    for (WebElement subAreaElement : mesaTrabajo.listSubAreas(nombreArea)) {
      if (subAreaElement.getText().contains(subArea)) {
        encontrarSubArea = subAreaElement;
      }
    }
    assertNotNull("FAILED: presionarPrimerNombreMesa Favor revisa que el subarea exista " + subArea,
        encontrarSubArea);
    mesaTrabajo.getNombreMesaSubArea(encontrarSubArea).click();
  }

}
