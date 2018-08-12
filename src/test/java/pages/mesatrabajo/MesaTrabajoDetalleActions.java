package pages.mesatrabajo;

import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class MesaTrabajoDetalleActions {
  WebDriver driver;
  private MesaTrabajoPage mesaTrabajo;
  private MesaTrabajoDetallePage mesaTrabajoDetallePage;

  public MesaTrabajoDetalleActions(WebDriver driver) {
    this.driver = driver;
    mesaTrabajo = new MesaTrabajoPage(driver);
    mesaTrabajoDetallePage = new MesaTrabajoDetallePage(driver);
  }

  public void validarFormularioDetalleMesa() throws Throwable {
    assertTrue("FAILED: validarFormularioDetalleMesa revisa que la url contenga: "
        + mesaTrabajoDetallePage.getDetalleMesaTrabajo(),
        driver.getCurrentUrl().contains(mesaTrabajoDetallePage.getDetalleMesaTrabajo()));
  }


  public void validarSeccionSuperiorMesaAreaTipo() throws Throwable {
    final String nombreMesa = "Nombre Mesa:";
    final String area = "Area:";
    final String tipo = "Tipo:";
    assertTrue("FAILED: validarSeccionSuperiorMesaAreaTipo revisa el campo tenga el contenido: " + nombreMesa,
        mesaTrabajoDetallePage.getCabeceraColumnaA().getText().contains(nombreMesa));
    assertTrue("FAILED: validarSeccionSuperiorMesaAreaTipo revisa el campo tenga el contenido: " + area,
        mesaTrabajoDetallePage.getCabeceraColumnaA().getText().contains(area));
    assertTrue("FAILED: validarSeccionSuperiorMesaAreaTipo revisa el campo tenga el contenido: " + tipo,
        mesaTrabajoDetallePage.getCabeceraColumnaA().getText().contains(tipo));

    assertNotNull("FAILED: validarSeccionSuperiorMesaAreaTipo contenido para el campo nombreMesa: VACIO",
        mesaTrabajoDetallePage.getContenidoCabeceraColumnaAnombreMesa1().getText());
    assertNotNull("FAILED: validarSeccionSuperiorMesaAreaTipo contenido para el campo area: VACIO",
        mesaTrabajoDetallePage.getContenidoCabeceraColumnaAarea().getText());
    assertNotNull("FAILED: validarSeccionSuperiorMesaAreaTipo contenido para el campo tipo: VACIO",
        mesaTrabajoDetallePage.getContenidoCabeceraColumnaAtipo().getText());
  }

  public void validarSeccionSuperiorDerechaNumSolKpis() throws Throwable {
    final String numSolicitudes = "N° Solicitudes";
    final String kpiAvance = "KPI Avance";
    final String kpiCumplimiento = "KPI Cumplimiento en Plazo";
    assertTrue("FAILED: validarSeccionSuperiorDerechaNumSolKpis revisa el campo tenga el contenido: " + numSolicitudes,
        mesaTrabajoDetallePage.getTituloCabeceraColumnaB().getText().contains(numSolicitudes));
    assertTrue("FAILED: validarSeccionSuperiorDerechaNumSolKpis revisa el campo tenga el contenido: " + kpiAvance,
        mesaTrabajoDetallePage.getKpiAvanceCabeceraColumnaB().getText().contains(kpiAvance));
    assertTrue("FAILED: validarSeccionSuperiorDerechaNumSolKpis revisa el campo tenga el contenido: " + kpiCumplimiento,
        mesaTrabajoDetallePage.getKpiCumplimientoCabeceraColumnaB().getText().contains(kpiCumplimiento));

    assertNotNull("FAILED: validarSeccionSuperiorDerechaNumSolKpis contenido para el campo numSolicitudes: VACIO",
        mesaTrabajoDetallePage.getNumSolicitudesCabeceraColumnaB().getText());
  }

  public void validarTituloSecCentralIntegrantesMesa(String titulo) throws Throwable {
    assertEquals("FAILED: validarTituloSecCentralIntegrantesMesa el titulo es diferente a: " + titulo,
        mesaTrabajoDetallePage.getTituloCuerpoColumna1().getText(), titulo);
  }

  public void validarContenidoSecCentralColumNombreAreaRolAvanceCapacidad() throws Throwable {
    final String nombre = "Nombre";
    final String area = "Area";
    final String rol = "Rol";
    final String avance = "Avance Real/Plan";
    final String capacidad = "Capacidad";

    assertNotNull("FAILED: validarContenidoSecCentralColumNombreAreaRolAvanceCapacidad revisa el nombre de la columna " + nombre,
        mesaTrabajoDetallePage.findOneElementInListWithTextContent(mesaTrabajoDetallePage.getTitulosTablaCuerpoColumna1(), nombre));
    assertNotNull("FAILED: validarContenidoSecCentralColumNombreAreaRolAvanceCapacidad revisa el nombre de la columna " + area,
        mesaTrabajoDetallePage.findOneElementInListWithTextContent(mesaTrabajoDetallePage.getTitulosTablaCuerpoColumna1(), area));
    assertNotNull("FAILED: validarContenidoSecCentralColumNombreAreaRolAvanceCapacidad revisa el nombre de la columna " + rol,
        mesaTrabajoDetallePage.findOneElementInListWithTextContent(mesaTrabajoDetallePage.getTitulosTablaCuerpoColumna1(), rol));
    assertNotNull("FAILED: validarContenidoSecCentralColumNombreAreaRolAvanceCapacidad revisa el nombre de la columna " + avance,
        mesaTrabajoDetallePage.findOneElementInListWithTextContent(mesaTrabajoDetallePage.getTitulosTablaCuerpoColumna1(), avance));
    assertNotNull("FAILED: validarContenidoSecCentralColumNombreAreaRolAvanceCapacidad revisa el nombre de la columna " + capacidad,
        mesaTrabajoDetallePage.findOneElementInListWithTextContent(mesaTrabajoDetallePage.getTitulosTablaCuerpoColumna1(), capacidad));

    assertNotNull("FAILED: validarContenidoSecCentralColumNombreAreaRolAvanceCapacidad contenido VACIO",
        mesaTrabajoDetallePage.getContenidoTablaCuerpoColumna1());
  }

  public void validarTituloSeccionInferiorTiendas(String titulo) throws Throwable {
    assertEquals("FAILED: validarTituloSeccionInferiorTiendas el titulo es diferente a: " + titulo,
        mesaTrabajoDetallePage.getTituloCuerpoColumna2().getText(), titulo);
  }

  public void validarContenidoSeccionInferiorTiendas() throws Throwable {
    final String nombre = "Nombre";
    final String solicitudes = "Solicitudes";
    final String capacidad = "Capacidad";
    assertNotNull("FAILED: validarContenidoSeccionInferiorTiendas revisa el nombre de la columna " + nombre,
        mesaTrabajoDetallePage.findOneElementInListWithTextContent(mesaTrabajoDetallePage.getTitulosTablaCuerpoColumna2(), nombre));
    assertNotNull("FAILED: validarContenidoSeccionInferiorTiendas revisa el nombre de la columna " + solicitudes,
        mesaTrabajoDetallePage.findOneElementInListWithTextContent(mesaTrabajoDetallePage.getTitulosTablaCuerpoColumna2(), solicitudes));
    assertNotNull("FAILED: validarContenidoSeccionInferiorTiendas revisa el nombre de la columna " + capacidad,
        mesaTrabajoDetallePage.findOneElementInListWithTextContent(mesaTrabajoDetallePage.getTitulosTablaCuerpoColumna2(), capacidad));

    assertNotNull("FAILED: validarContenidoSeccionInferiorTiendas contenido VACIO",
        mesaTrabajoDetallePage.getContenidoTablaCuerpoColumna2());
  }

  public void validarTituloSeccionCentralSolicitudes(String titulo) throws Throwable {
    assertEquals("FAILED: validarTituloSeccionCentralSolicitudes el titulo es diferente a: " + titulo,
        mesaTrabajoDetallePage.getTituloCuerpoColumnaB().getText(), titulo);
  }

  public void validarContenidoSeccionCentralSolicitudes() throws Throwable {
    final String solicitud = "Solicitud";
    final String sucursal = "Sucursal";
    final String solicitante = "Solicitante";
    final String estado = "Estado";

    assertNotNull("FAILED: validarContenidoSeccionCentralSolicitudes revisa el nombre de la columna " + solicitud,
        mesaTrabajoDetallePage.findOneElementInListWithTextContent(mesaTrabajoDetallePage.getTitulosTablaCuerpoColumnaB(), solicitud));
    assertNotNull("FAILED: validarContenidoSeccionCentralSolicitudes revisa el nombre de la columna " + sucursal,
        mesaTrabajoDetallePage.findOneElementInListWithTextContent(mesaTrabajoDetallePage.getTitulosTablaCuerpoColumnaB(), sucursal));
    assertNotNull("FAILED: validarContenidoSeccionCentralSolicitudes revisa el nombre de la columna " + solicitante,
        mesaTrabajoDetallePage.findOneElementInListWithTextContent(mesaTrabajoDetallePage.getTitulosTablaCuerpoColumnaB(), solicitante));
    assertNotNull("FAILED: validarContenidoSeccionCentralSolicitudes revisa el nombre de la columna " + estado,
        mesaTrabajoDetallePage.findOneElementInListWithTextContent(mesaTrabajoDetallePage.getTitulosTablaCuerpoColumnaB(), estado));

    assertNotNull("FAILED: validarContenidoSeccionCentralSolicitudes contenido VACIO",
        mesaTrabajoDetallePage.getContenidoTablaCuerpoColumnaB());
  }

}
