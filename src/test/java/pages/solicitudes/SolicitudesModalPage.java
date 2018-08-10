package pages.solicitudes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.BasePageAbstract;

public class SolicitudesModalPage extends BasePageAbstract {

  @FindBy(xpath = "/html[1]/body[@class='app sidebar-mini rtl  pace-done stop-scrolling']/div[@class='sweet-alert showSweetAlert visible']")
  private WebElement sweetAlert;

  @FindBy(xpath = "/html[1]/body/div[@class='sweet-alert showSweetAlert visible']/h2")
  private WebElement sweetAlertTitle;

  @FindBy(xpath = "/html[1]/body/div[@class='sweet-alert showSweetAlert visible']/p[1]")
  private WebElement sweetAlertIdSolicitud;

  @FindBy(xpath = "/html[1]/body/div[@class='sweet-alert showSweetAlert visible']/div[@class='sa-button-container']/div/button[@class='confirm']")
  private WebElement sweetAlertConfirmButtom;

  public SolicitudesModalPage(WebDriver driver) {
    super(driver);
  }

  // Getters
  public WebElement getSweetAlert() {
    return sweetAlert;
  }

  public WebElement getSweetAlertTitle() {
    return sweetAlertTitle;
  }

  public WebElement getSweetAlertIdSolicitud() {
    return sweetAlertIdSolicitud;
  }

  public WebElement getSweetAlertConfirmButtom() {
    return sweetAlertConfirmButtom;
  }

}
