package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;

import java.util.List;

public class HomeActions {
  WebDriver driver;
  private HomePage homePage;
  
  public HomeActions(WebDriver driver) {
    this.driver = driver;
    homePage = new HomePage(driver);
  }
    
  
  public void isDashboard() throws Throwable {
    String sitioActual = driver.getCurrentUrl();
    assertTrue("FAILED: isDashboard",
        sitioActual.contains(homePage.getDashboardSite()));
  }
  
  public void validarRol(String rol) throws Throwable {
    String userDesignation =  homePage.getUserDesignationText().getText();
    assertTrue("FAILED: validarRol", userDesignation.contains(rol));
  }
  
  public void presionarBotonHamburguesaDashboard() throws Throwable {
    homePage.getHamburguesaButton().click();
  }
  
  public void validarOpcionEnMenuPrincipal(String menuOption) throws Throwable {
    WebElement elementoEncontradoMenuPrincipal;
    elementoEncontradoMenuPrincipal = homePage.findOneElementInList(homePage.getAsideMenuList(), menuOption);
    assertNotNull("FAILED: elementoEncontradoMenuPrincipal es NULL", elementoEncontradoMenuPrincipal);
    elementoEncontradoMenuPrincipal.click();
  }
  
  public void validarOpcionEnMenuSecundario(String menuOption, String subMenu) throws Throwable {

    WebElement elementoEncontradoMenuPrincipal = null;
    elementoEncontradoMenuPrincipal = homePage.findOneElementInList(homePage.getAsideMenuList(), menuOption);
    assertNotNull("FAILED: elementoEncontradoMenuPrincipal es NULL", elementoEncontradoMenuPrincipal);

    List<WebElement> subMenuList = elementoEncontradoMenuPrincipal.findElements(By.xpath("//ul/li/a[@class='treeview-item']"));
    WebElement elementoEncontradoMenuSecundario = null;
    elementoEncontradoMenuSecundario = homePage.findOneElementInList(subMenuList, subMenu);
    assertNotNull("FAILED: elementoEncontradoMenuSecundario es NULL", elementoEncontradoMenuSecundario);
  }
}
