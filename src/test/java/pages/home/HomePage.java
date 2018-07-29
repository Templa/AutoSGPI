package pages.home;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.BasePageAbstract;

public class HomePage extends BasePageAbstract {
  /**
   * FindBy
   * id, css, xpath, name, className, etc.
   */
  
  private final String dashboardSite = "/dashboard";

  @FindBy(xpath = "//*[@id=\"contenedorNav\"]/aside/div/div/p[2]")
  private WebElement userDesignationText;
  
  @FindBy(xpath = "//*[@id=\"contenedorNav\"]/aside/ul/li")
  private List<WebElement> asideMenuList;
  
  @FindBy(css = "#contenedorNav > header > a.app-sidebar__toggle")
  private WebElement hamburguesaButton;
  
  @FindBy(xpath = "//a[@data-original-title = 'Logout']")
  private WebElement logoutButton;

  // Constructor
  public HomePage(WebDriver driver) {
    super(driver);
  }
  
  //Getters
  public String getDashboardSite() {
    return dashboardSite;
  }

  public WebElement getUserDesignationText() {
    return userDesignationText;
  }

  public List<WebElement> getAsideMenuList() {
    return asideMenuList;
  }

  public WebElement getHamburguesaButton() {
    return hamburguesaButton;
  }

  public WebElement getLogoutButton() {
    return logoutButton;
  }

}
