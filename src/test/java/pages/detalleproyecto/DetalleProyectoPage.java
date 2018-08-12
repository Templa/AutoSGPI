package pages.detalleproyecto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.BasePageAbstract;

public class DetalleProyectoPage extends BasePageAbstract {
  /**
   * FindBy
   * id, css, xpath, name, className, etc.
   */

  private final String detalleProyectoTitle = "/DetalleProyecto.html";


  // Constructor
  public DetalleProyectoPage(WebDriver driver) {
    super(driver);
  }

  //Getters
  public String getDetalleProyectoTitle() {
    return detalleProyectoTitle;
  }
}
