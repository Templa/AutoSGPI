package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class Utils {

  private Utils() { }

/**
 * This method generate current time
 * @return String with current time
 */
  public static String getCurrentTime() {
    try {
      final Calendar calendar = Calendar.getInstance();
      final Date date = calendar.getTime();
      final DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
      final String currentDate = dateFormat.format(date);
      return  currentDate != null ? currentDate : null;
    } catch (Throwable e) {
      System.out.println("Failed " + e.getMessage());
      return null;
    }
  }

}