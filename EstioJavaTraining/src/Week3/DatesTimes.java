package Week3;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.TimeZone;
import java.util.function.ToDoubleBiFunction;


public class DatesTimes {
   public static void main(String[] args) {

      LocalDate today = LocalDate.now();
//      LocalTime time = LocalTime.now();
//      LocalDateTime datetime = LocalDateTime.now();
//
//      System.out.println(today);
//      System.out.println(time);
//      System.out.println(datetime);

      System.out.println("Today is the " + today);
      LocalDate DOB = LocalDate.of(1980, Month.MARCH, 10);

      System.out.println("I was born on the " + DOB);
      System.out.println(DOB.getDayOfWeek());

      LocalTime timeNow =  LocalTime.now();
      LocalTime timeAtNight = LocalTime.of(21,17,29);

      System.out.println(timeNow);
      System.out.println(timeAtNight);

      DateTimeFormatter dfs = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
      DateTimeFormatter dfl = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
      DateTimeFormatter dff = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);

      System.out.println(dfs.format(today));
      System.out.println(dfl.format(today));
      System.out.println(dff.format(today));

      DateTimeFormatter df3 = DateTimeFormatter.ofPattern("dd-MM-yy");

      System.out.println(df3.format(today));

   }
}
