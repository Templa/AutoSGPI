package pages.mesatrabajo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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

}
