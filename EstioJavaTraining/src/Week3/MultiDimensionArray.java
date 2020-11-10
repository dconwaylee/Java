package Week3;

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
   }
}
