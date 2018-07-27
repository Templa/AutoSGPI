package sodimac;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.login.LoginActions;

import utils.DriverManagerAbstract;

public class LoginSteps {

  WebDriver driver;
  DriverManagerAbstract driverManager;
  LoginActions loginActions;
  // DI
  public LoginSteps(Hooks hook) {
    this.driver = Hooks.getDriver();
    this.driverManager = hook.getDriverManager();
    loginActions = new LoginActions(driver);
  }

  /*
   * Test Aqui
   */
  @Given("^Ingresar en el Portal SGPI$")
  public void ingresarPortalSGPI() throws Throwable {
    loginActions.cargarPagina();
  }

  @When("^Ingresar Usuario \"(.*?)\"$")
  public void ingresarUsuario(String usuario) throws Throwable {
    loginActions.ingresarUsuario(usuario);
  }

  @And("^Ingresar Password \"(.*?)\"$")
  public void ingresarPassword(String password) throws Throwable {
    loginActions.ingresarPass(password);
  }

  @And("^Presionar Ingresar$")
  public void presionarIngresar() throws Throwable {
    loginActions.presionarIngresar();
  }

  @Then("^El sistema muestra el mensaje \"(.*?)\"$")
  public void validarMensajeLogin(String mensaje) throws Throwable {
    loginActions.validarMensajeLogin(mensaje);
  }

}
