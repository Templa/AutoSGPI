package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * Class BasePageAbstract PageObjects
 */
public abstract class BasePageAbstract {

  private static WebDriver driver = null;
  private final int pollingMilliseconds = 500;

  public BasePageAbstract(WebDriver driver) {
    PageFactory.initElements(driver, this);
    setDriver(driver);
  }

  public static WebDriver getDriver() {
    return driver;
  }

  public static void setDriver(WebDriver driver) {
    BasePageAbstract.driver = driver;
  }

  /**
   * TODO: Metodos de prueba para manejar tiempos de espera
   * @ExpectedCondition
   * @Integer
   */
  private void waitFor(ExpectedCondition<WebElement> condition, int timeout) throws Throwable {
    WebDriverWait wait = new WebDriverWait(driver, timeout);
    wait.ignoring(StaleElementReferenceException.class).until(condition);
  }

  /**
   * Fluent Wait
   * Ignora NoSuchElementException y StaleElementReferenceException
   * @ExpectedCondition
   * @Integer MILLISECONDS
   * @Integer SECONDS
   */
  private void fluentWaitFor(
      ExpectedCondition<WebElement> condition,
      int polling,
      int timeout) throws Throwable {

    Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
        .pollingEvery(polling, TimeUnit.MILLISECONDS)
        .withTimeout(timeout, TimeUnit.SECONDS)
        .ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
    fluentWait.until(condition);
  }

  //Expected Conditions: elementToBeClickable
  public boolean waitElementToBeClickable(WebElement element, int timeout) throws Throwable {
    try {
      waitFor(
          ExpectedConditions.elementToBeClickable(element),
          timeout
      );
      return true;
    } catch (org.openqa.selenium.TimeoutException e) {
      System.out.println("INFO: TimeoutException El elemento "
          + element.getText()
          + ", no es clickable.  return false");
      return false;
    } catch (Throwable e) {
      System.out.println("INFO: El elemento " + element.getText() + " error. return false" + e);
      return false;
    }
  }

  //Expected Conditions: visibilityOf
  public boolean waitVisibilityOfElement(WebElement element, int timeout) throws Throwable {
    try {
      waitFor(
          ExpectedConditions.visibilityOf(element),
          timeout
      );
      return true;
    } catch (org.openqa.selenium.TimeoutException e) {
      System.out.println("INFO: TimeoutException El elemento " + element.getText() + ", no es visible. return false");
      return false;
    } catch (Throwable e) {
      System.out.println("INFO: El elemento " + element.getText() + " error. return false " + e);
      return false;
    }
  }

  //Expected Conditions: fluent wait visibilityOf
  public boolean fluentWaitVisibilityOfElement(
      WebElement element,
      int timeout) throws Throwable {
    try {
      fluentWaitFor(
          ExpectedConditions.visibilityOf(element),
          pollingMilliseconds, // Valor por default 500
          timeout
      );
      return true;
    } catch (org.openqa.selenium.TimeoutException e) {
      System.out.println("INFO: TimeoutException El elemento " + element.getText() + ", no es visible. return false");
      return false;
    } catch (Throwable e) {
      System.out.println("INFO: fluentWait el elemento " + element.getText() + " error. return false " + e);
      return false;
    }
  }

  public WebElement moveTo(WebElement element)  throws Throwable {
    //El valor 100 en el eje Y es para que el elemento no quede "tapado" por otro elemento
    int elementPosition = element.getLocation().getY() - 100;
    try {
      ((JavascriptExecutor) driver).executeScript("window.scroll(0, arguments[0])", elementPosition);
      Thread.sleep(500);
    } catch (Throwable e) {
      System.out.println("FAILED metodo moveTo(WebElement element): " + e.getMessage());
    }
    return element;
  }

  public void mouseOver(WebElement element) throws InterruptedException {
    Actions action = new Actions(driver);
    action.moveToElement(element).build().perform();
    driver.wait(500);
  }
  
/**
 * This method needs 2 params, one list and the object that you want to find in the list
 * @param listElements
 * @param element
 * @return WebElement
 */
  public WebElement findOneElementInList(List<WebElement> listElements, String element) {
    try {
      if (listElements.size() > 0) {
        for(WebElement findElement : listElements) {
          if(findElement.getText().contains(element)) {
            return findElement;
          }
        }
      return null;
    } else 
      return null;
    } catch (Throwable e) {
      return null;
    }
  }
  
}