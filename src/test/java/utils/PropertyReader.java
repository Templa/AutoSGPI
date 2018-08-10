package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public abstract class PropertyReader {

  static Properties properties = new Properties();

  // Constructor
  public PropertyReader() {
    initProperties();
  }

  /**
   * Reads and Loads the properties.
   */
  public static void initProperties() {
    try {
      ClassLoader loader = Thread.currentThread().getContextClassLoader();
      InputStream stream = loader.getResourceAsStream("config.properties");
      try {
        properties.load(stream);
        stream.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      // Properites added to System.properties
      System.setProperty("SELENIUM_PORT", properties.getProperty("SELENIUM_PORT"));
      System.setProperty("SELENIUM_HOST", properties.getProperty("SELENIUM_HOST"));
      System.setProperty("URL_SITE", properties.getProperty("URL_SITE"));
      System.setProperty("reportConfigPath", properties.getProperty("reportConfigPath"));
      System.setProperty("ID_SOLICITUD", properties.getProperty("ID_SOLICITUD"));
    } catch (Throwable e) {
      System.out.println("FAILED: initProperties " + e.getMessage());
    }
  }

  /**
   * Get report config path
   */
  public static String getReportConfigPath() {
    String reportConfigPath = properties.getProperty("reportConfigPath");
    if (reportConfigPath != null) {
      return reportConfigPath;
    } else {
      throw new RuntimeException(
          "Report Config Path not specified in the config.properties file for the Key:reportConfigPath");
    }
  }

  /**
   * Get System property by Name
   */
  public static String getPropertyByName(String name) {
    return System.getProperty(name);
  }

  /**
   * Get System environment by Name
   */
  public static String getPropertyEnvByName(String name) {
    return System.getenv(name);
  }

  /**
   * Get Site Home Url
   */
  public static String getSiteUrl() throws Exception {
    String siteUrl = getPropertyByName("URL_SITE");
    return siteUrl;
  }

  /**
   * Get Selenium Url ( HUB )
   */
  static String getSeleniumUrl() throws Exception {
    String host = getSeleniumHost();
    String port = getSeleniumPort();
    String seleniumUrl = "http://" + host + ":" + port + "/wd/hub";
    return seleniumUrl;
  }

  /**
   * Get Selenium Port from property file
   */
  private static String getSeleniumPort() throws Exception {
    String seleniumPort =  getPropertyByName("SELENIUM_PORT");
    if (seleniumPort != null) {
      return seleniumPort.length() > 0 ? seleniumPort : "4444";
    } else {
      return "4444";
    }
  }

  /**
   * Get Selenium Host from property file
   */
  private static String getSeleniumHost() throws Exception {
    String seleniumHost =  getPropertyByName("SELENIUM_HOST");
    if (seleniumHost != null) {
      return seleniumHost.length() > 0 ? seleniumHost : "localhost";
    } else {
      return "localhost";
    }
  }

  // ID SOLICITUDES
  public static void setPropertyIdSolicitud(String value) {
    System.setProperty("ID_SOLICITUD", value);
  }

  public static String getPropertyIdSolicitud() {
    return System.getProperty("ID_SOLICITUD");
  }
}
