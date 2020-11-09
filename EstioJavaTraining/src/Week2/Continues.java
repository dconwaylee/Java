package Week2;

import java.util.Scanner;

public class Continues {

   public static void main(String[] args) {


      Scanner whichNum = new Scanner(System.in);

      System.out.println("Enter a number to find out");
      int wn = whichNum.nextInt();

      System.out.println("\nDivided by 3: ");
      for (int i = 1; i < wn; i++) {
         if (i % 3 == 0)
            System.out.print(i + ", ");
         continue;
      }
      System.out.println("\n");

      Object a, b, c;

   }
}