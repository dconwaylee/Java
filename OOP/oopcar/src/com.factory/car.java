import java.util.Scanner;

public class car{

public static void main (final String[] args) {

}

// attributes
String model;
String bodystyle;
String enginesize;
String trimlevel;

// methods

public void DescribeCar() {



     System.out.println("Whats the model?");
     final Scanner kb = new Scanner(System.in);
     model = kb.toString();
     
     System.out.println("What body style?");
     bodystyle = kb.toString();

     System.out.println("What is the engine size?");
     enginesize = kb.toString();

     System.out.println("What is the engine size?");
     trimlevel = kb.toString();
       
        System.out.printf("Model: %s, Body Style: %s, Engine Size: %l, Trim Level %s.", model, bodystyle, enginesize, trimlevel);
    }
}