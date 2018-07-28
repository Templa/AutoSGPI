package sodimac;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.home.HomeActions;

import utils.DriverManagerAbstract;

public class HomeSteps {

  WebDriver driver;
  DriverManagerAbstract driverManager;
  HomeActions homeActions;
  // DI
  public HomeSteps(Hooks hook) {
    this.driver = Hooks.getDriver();
    this.driverManager = hook.getDriverManager();
    homeActions = new HomeActions(driver);
  }

  /*
   * Test Aqui
   */
  
  @And("^El usuario ve la pagina de Dashboard$")
  public void usuarioVePaginaDashboard() throws Throwable {
    homeActions.isDashboard();
  }
  
  @Then("^El usuario ve su rol \"(.*?)\"$")
  public void usuarioVeRolEnMenu(String rol) throws Throwable {
    homeActions.validarRol(rol);
  }

  @And("^Presionar icono Hamburguesa$")
  public void presionarIconoHamburguesaDashboard() throws Throwable {
    homeActions.presionarBotonHamburguesaDashboard();
  }

  @And("^El usuario ve la opcion \"(.*?)\" en el Menu del lado izquierdo de la pantalla$")
  public void Notificaciones(String menuOption) throws Throwable {
    homeActions.validarOpcionEnMenuPrincipal(menuOption);
  }

  @And("^En la opcion \"(.*?)\" se ve el submenu \"(.*?)\"$")
  public void validarSubMenu(String menuOption, String subMenu) throws Throwable {
    homeActions.validarOpcionEnMenuSecundario(menuOption, subMenu);
  }
  
  
/*
 *   @Then("^El sistema muestra el mensaje \"(.*?)\"$")
  public void validarMensajeLogin(String mensaje) throws Throwable {
    loginActions.validarMensajeLogin(mensaje);
  }
 */
}
