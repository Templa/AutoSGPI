package pages.login;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.BasePageAbstract;
import utils.PropertyReader;

public class LoginPage extends BasePageAbstract {
  /**
   * FindBy
   * id, css, xpath, name, className, etc.
   */

  private URL urlSite;
  
  private final String title = "Sistema de Gestión de Proyecto e Infraestructura";

  @FindBy(id = "user")
  private WebElement usuarioField;
  
  @FindBy(id = "pass")
  private WebElement passField;
  
  @FindBy(id = "login")
  private WebElement loginButton;
  
  @FindBy(xpath ="//div[@id = 'alert-warn']")
  private WebElement alertWarnDiv;

  // Constructor
  public LoginPage(WebDriver driver) {
    super(driver);
  }

  // Getters
  public URL getUrlSite() {
	  try {
		  urlSite  = new URL(PropertyReader.getSiteUrl());
	  } catch (Exception e) {
		e.printStackTrace();
	}
    return urlSite;
  }
	
  public String getTitle() {
	return title;
  }

  public WebElement getUsuarioField() {
    return usuarioField;
  }

  public WebElement getPassField() {
	  return passField;
  }

  public WebElement getLoginButton() {
    return loginButton;
  }

  public WebElement getAlertWarnDiv() {
    return alertWarnDiv;
  }

}
