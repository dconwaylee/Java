package BigRentals;

import BigRentals.*;

import java.time.LocalDate;

public class CarLease {

   car Toyota;
   car Tesla;
   car Nissan;

   public static void main(String[] args) {
      new CarLease();
   }

   public void displayCurrentFleet() {
      System.out.println(Toyota.describeModel());
      System.out.println(Tesla.describeModel());
      System.out.println(Nissan.describeModel());
   }

   private void setupInitialModels() {
      Toyota = new car("GR Supra", false, LocalDate.now(), LocalDate.now().plusDays(120));
      Tesla = new car("Model x - P100D", false, LocalDate.now(), LocalDate.now().plusDays(120));
      Nissan = new car("GT-R", false, LocalDate.now(), LocalDate.now().plusDays(120));
      displayCurrentFleet();
   }
}