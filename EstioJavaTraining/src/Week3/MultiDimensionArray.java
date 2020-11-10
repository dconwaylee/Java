package Week3;

import java.util.ArrayList;

public class MultiDimensionArray {

   public static void main(String[] args) {

      int[][] multiD = new int[3][2];
      System.out.println("-Table Array-");
      for (int i = 0; i < multiD.length; i++) {

         for (int j = 0; j < multiD[i].length; j++) {
            System.out.print("-");
            System.out.print(multiD[i][j] + " ");

         }
         System.out.println("-");
      }
      System.out.println("------------");


      //Enhanced loop to do the array
      //this is far more elegant & certainly saves
      //on white space & code overhead.
      for (int[] inner : multiD) {
         for (int num : inner) System.out.print(num + " ");
         System.out.println();
      }

      ArrayList<String> FastNFurious = new ArrayList<>();
      FastNFurious.add("Brian");
      FastNFurious.add("Dom");
      FastNFurious.add("Letty");
      FastNFurious.add("Tim");


      System.out.println(FastNFurious.remove(2) + " Looses her memory, removed from the team!");
      System.out.println(FastNFurious);
      System.out.println(FastNFurious.set(3, "Jessie") + "'s name was wrong on the script");
      System.out.println(FastNFurious.size());
      //System.out.println(FastNFurious.isEmpty()); // This is causing me errors

   }
}
