package sodimac;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.home.HomeActions;
import pages.solicitudes.SolicitudesActions;
import utils.DriverManagerAbstract;

public class HomeSteps {

  WebDriver driver;
  DriverManagerAbstract driverManager;
  HomeActions homeActions;
  SolicitudesActions solicitudesActions;

  // DI
  public HomeSteps(Hooks hook) {
    this.driver = Hooks.getDriver();
    this.driverManager = hook.getDriverManager();
    homeActions = new HomeActions(driver);
    solicitudesActions = new SolicitudesActions(driver);
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
  public void usuarioVeOpcionEnMenuPrimario(String menuOption) throws Throwable {
    homeActions.validarOpcionEnMenuPrincipal(menuOption);
  }

  @And("^El usuario no ve la opcion \"(.*?)\" en el Menu del lado izquierdo de la pantalla$")
  public void usuarioNoVeOpcionEnMenuPrimario(String menuOption) throws Throwable {
    homeActions.validarOpcionEnMenuPrincipalNoExista(menuOption);
  }

  @And("^En \"(.*?)\" se ve el submenu \"(.*?)\"$")
  public void validarSubMenu(String menuOption, String subMenu) throws Throwable {
    homeActions.validarOpcionEnMenuSecundario(menuOption, subMenu);
  }

  @And("^Ir a Menu \"(.*?)\" y submenu \"(.*?)\"$")
  public void clickSubMenu(String menuOption, String subMenu) throws Throwable {
    homeActions.clickOpcionEnMenuSecundario(menuOption, subMenu);
    solicitudesActions.validarTituloSolicitudes();
  }

/*
 *   @Then("^El sistema muestra el mensaje \"(.*?)\"$")
  public void validarMensajeLogin(String mensaje) throws Throwable {
    loginActions.validarMensajeLogin(mensaje);
  }
 */
}
