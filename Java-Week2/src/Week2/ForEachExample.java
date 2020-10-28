package Week2;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

 public static void main(String[] args) {

  //List of List<String>, store 5 and print 5
  List<String> names = new ArrayList<String>();

  names.add("Domonic");
  names.add("Idris");
  names.add("Shelly");
  names.add("Adam");
  names.add("Josh");

  for (String name : names) {
   System.out.println(name + " Is in position " + names.indexOf(names));
  }
 }
}