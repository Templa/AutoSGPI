package pages.home;

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
    boolean flag = false;
    try {
      if (homePage.getAsideMenuList().size() > 0) {
        for(WebElement element : homePage.getAsideMenuList()) {
          if(element.getText().contains(menuOption)) {
            flag = true;
          }
        }
        // Aqui valido si encuentro el elemento en el menu
        assertTrue("FAILED", flag);
      } else {
        fail("FAILED: NO EXISTEN AVISOS EN EL MENU PRINCIPAL");
      }
    } catch (Throwable e) {
      fail("FAILED: deleteAdFavorito: " + e.getMessage());
    }
  }
  
}
