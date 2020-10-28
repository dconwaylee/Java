package Week2;

public class Timestable {

 public static void main(String[] args) {

  int[][] data = new int[10][10];

  data = timesTable(10, 10);

  System.out.println("                   10 times table                  ");
  System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
  System.out.println("                                                   ");

  for (int row = 0; row < data.length; row++) {
   for (int column = 0; column < data[row].length; column++) {
    if (row < 11) {
     System.out.printf(" %2d |", data[row][column]);
    } else {
     System.out.printf("%2d ", data[row][column]);
    }
   }
   System.out.println();
  }
 }

 public static int[][] timesTable(int r, int c) {
  int[][] yes = new int[r][c];
  for (int row = 0; row < yes.length; row++) {
   for (int column = 0; column < yes[row].length; column++) {
    yes[row][column] = (row + 1) * (column + 1);
   }

  }
  return yes;
 }
}