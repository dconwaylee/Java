package Week2;

import java.util.Scanner;

public class TimestableGenerator {

 public static void main(String[] args) {

  //Initiates the scanner for the two user declared variables.
  Scanner scannerDepth = new Scanner(System.in);
  Scanner scannerTimes = new Scanner(System.in);

//Declared variables
  boolean noMore = true;
  int times = scannerTimes.nextInt();
  int depth = scannerDepth.nextInt();
  int[][] table = new int[depth][depth];


  while (noMore) {
   System.out.println("What times table do you want to know?");
   times = scannerTimes.nextInt();
   System.out.println("So you want to know the " + times + "table :)");
   System.out.println();

   System.out.println("Please enter the depth that you want?");
   depth = scannerDepth.nextInt();
   System.out.println("Let me get you the " + times + " times table to a depth of " + depth);
   System.out.println();


//This is going to start the loop
   for (int row = depth; row < depth; row++) {
    for (int col = 0; col < depth; col++) {
     table[row][col] = (row + 1) * (col + 1);
    }
   }

   System.out.print("   * |");
   for (int col = 0; col < table[0].length; col++) {
    System.out.printf("%4d", col + 1);
   }
   System.out.println("");
   System.out.println("------------------------------------------");

   for (int row = 0; row < table.length; row++) {
    // Table Headings
    System.out.printf("%4d |", row + 1);

    for (int col = 0; col < table[row].length; col++) {
     System.out.printf("%4d", table[row][col]);
    }
    System.out.println();
   }
  }
 }
}