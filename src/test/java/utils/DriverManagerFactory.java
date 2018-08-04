package utils;

public class DriverManagerFactory {
  public static DriverManagerAbstract getManager(DriverType type) {
    DriverManagerAbstract driverManager;

    switch (type) {
      case CHROME:
        driverManager = new ChromeDriverManager();
        break;
      default:
        driverManager = new ChromeDriverManager(); // cambiar por navegador default
        break;
    }
    return driverManager;
  } // fin getManager(DriverType type)

  /**
   * @enum clase especial que limita la creación de objetos a los especificados en su clase
   */
  public enum DriverType {
    CHROME,
    FIREFOX,
    IE,
    SAFARI;
  } //fin enum DriverType
}
