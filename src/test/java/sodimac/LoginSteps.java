package sodimac;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import utils.DriverManagerAbstract;

public class LoginSteps {

  WebDriver driver;
  DriverManagerAbstract driverManager;

  // DI
  public LoginSteps(Hooks hook) {
    this.driver = Hooks.getDriver();
    this.driverManager = hook.getDriverManager();
  }

  /*
   * Test Aqui
   */
  @Given("^Ingresar en el Portal SGPI$")
  public void ingresarPortalSGPI() throws Throwable {
	// Logica de test aqui
    throw new PendingException();
  }

  @When("^Ingresar Usuario \"(.*?)\"$")
  public void ingresarUsuario(String usuario) throws Throwable {
	// Logica de test aqui
    throw new PendingException();
  }

  @And("^Ingresar Password \"(.*?)\"$")
  public void ingresarPassword(String password) throws Throwable {
	// Logica de test aqui
    throw new PendingException();
  }

  @And("^Presionar Ingresar$")
  public void presionarIngresar() throws Throwable {
	// Logica de test aqui
    throw new PendingException();
  }

  @Then("^El sistema indicará \"(.*?)\"$")
  public void validarMensajeLogin(String mensaje) throws Throwable {
	// Logica de test aqui
    throw new PendingException();
  }

}
