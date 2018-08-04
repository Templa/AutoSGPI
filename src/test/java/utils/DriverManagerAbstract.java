package utils;

import org.openqa.selenium.WebDriver;

public abstract class DriverManagerAbstract {
  protected abstract void startService();

  protected abstract void stopService();

  protected abstract void createDriver() throws Exception;

  protected static WebDriver driver;
  protected final int secondsToWait = 1000; // wait for AJAX

  /**
   * Quit Driver
   */
  public void quitDriver() {
    if (null != driver) {
      driver.close();
      driver.quit();
      driver = null;
    }
  }

  /**
   * Get Local Driver
   */
  public WebDriver getDriver() throws Exception {
    if (null != driver) {
      return driver;
    } else {
      startService();
      createDriver();
      driver.navigate().to(PropertyReader.getSiteUrl());
      return driver;
    }
  }

  /**
   * Get Remote Driver
   */
  public WebDriver getRemoteDriver() throws Exception {
    if (null != driver) {
      return driver;
    } else {
      createDriver();
      driver.navigate().to(PropertyReader.getSiteUrl());
      return driver;
    }
  }

}
