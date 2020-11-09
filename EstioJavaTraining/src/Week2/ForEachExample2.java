package Week2;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample2 {

 public static void main(String[] args) {

  //make a list to store number
  //Find the sum of all numbers in the list

  List<Integer> numbers = new ArrayList<Integer>();

  numbers.add(1);
  numbers.add(2);
  numbers.add(3);
  numbers.add(4);
  numbers.add(5);


  double sum = 0;
  for (int i : numbers) {
   sum += i;
  }
  System.out.println(sum);


  //Simple single row list
  String[] names = {"Domonic", "Shelly", "Matt", "Will"};
  System.out.println(names.length);

  for (int x = 0; x < names.length; x++) {
   System.out.println(names[x]);
  }
 }
}
