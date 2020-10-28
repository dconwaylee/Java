package Week2;

public class ForLoops {


 public static void main(String[] args) {

  int x;
  for (x = 1; x <= 10; x++) {

   if (x > 1 && x < 10) {
    System.out.print(x + ", ");
   } else {
    System.out.print(x + ". ");
   }
  }
 }
}