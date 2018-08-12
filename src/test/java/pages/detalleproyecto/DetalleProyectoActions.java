package pages.detalleproyecto;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class DetalleProyectoActions {
  WebDriver driver;

  private DetalleProyectoPage detalleProyectoPage;

  public DetalleProyectoActions(WebDriver driver) {
    this.driver = driver;
    detalleProyectoPage = new DetalleProyectoPage(driver);
  }

  public void validarPaginaDetalleProyecto() throws Throwable {
    assertTrue("FAILED: validarFormularioDetalleMesa revisa que la url contenga: "
        + detalleProyectoPage.getDetalleProyectoTitle(),
        driver.getCurrentUrl().contains(detalleProyectoPage.getDetalleProyectoTitle()));
  }

}
