package Week3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;
import java.util.function.DoubleBinaryOperator;

public class DatesTimes {
   public static void main(String[] args) {

//      LocalDate today = LocalDate.now();
//      LocalTime time = LocalTime.now();
//      LocalDateTime datetime = LocalDateTime.now();
//
//      System.out.println(today);
//      System.out.println(time);
//      System.out.println(datetime);

      System.out.println("Today is the " + today);
      LocalDate DOB = LocalDate.of(1980, Month.MARCH,10);

      System.out.println("I was born on the " + DOB);
      System.out.println(DOB.getDayOfWeek());


   }

}
