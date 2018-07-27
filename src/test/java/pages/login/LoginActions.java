package pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.*;

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
    if(loginPage.waitVisibilityOfElement(loginPage.getAlertWarnDiv(), 5)) {
      assertTrue("FAILED: loginPage.getAlertWarnDiv().getText().contains(mensaje)",
          loginPage.getAlertWarnDiv().getText().contains(mensaje));
    } else {
      fail("FAILED: waitVisibilityOfElement loginPage.getAlertWarnDiv()");
    }
  }
}
