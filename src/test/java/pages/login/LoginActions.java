package pages.login;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.openqa.selenium.WebDriver;

public class LoginActions {
  WebDriver driver;
  private LoginPage loginPage;

  public LoginActions(WebDriver driver) {
    this.driver = driver;
    loginPage = new LoginPage(driver);
  }

  public void cargarPagina() {
    driver.navigate().to(loginPage.getUrlSite());
    assertEquals("FAILED: cargarPagina", loginPage.getTitle(), driver.getTitle());
  }

  public void ingresarUsuario(String usuario) {
    loginPage.getUsuarioField().clear();
    loginPage.getUsuarioField().sendKeys(usuario);
  }

  public void ingresarPass(String password) {
    loginPage.getPassField().clear();
    loginPage.getPassField().sendKeys(password);
  }

  public void presionarIngresar() {
    loginPage.getLoginButton().click();
  }

  public void validarMensajeLogin(String mensaje) throws Throwable {
    final int tiempoSeg = 5;
    if (loginPage.waitVisibilityOfElement(loginPage.getAlertWarnDiv(), tiempoSeg)) {
      assertTrue("FAILED: loginPage.getAlertWarnDiv().getText().contains(mensaje)",
          loginPage.getAlertWarnDiv().getText().contains(mensaje));
    } else {
      fail("FAILED: waitVisibilityOfElement loginPage.getAlertWarnDiv()");
    }
  }
}
