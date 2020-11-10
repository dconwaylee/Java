package Week3;

import java.util.Arrays;
import java.util.Collections;

public class CreatingArray3 {

   public static void main(String[] args) {
//      int[] myInts = new int[10];
//      for (int i = 0; i < myInts.length; i++) {
//
//         myInts[i] = 5 * i;
//         System.out.println(myInts[i] + "");

      int[] numbers = {54, 25, 11, 10, 5};
      int[] reverseNumbers = {54, 25, 11, 10, 5};

      Arrays.sort(numbers);

      for (int j = 0; j < numbers.length; j++) {

         System.out.println(numbers[j] + "");

      }
      ;
      System.out.println(" ");
      for (int j = numbers.length - 1; j >= 0; j--) {

         System.out.println(numbers[j] + "");

      }
      ;
   }
}