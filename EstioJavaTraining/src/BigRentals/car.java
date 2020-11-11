package BigRentals;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class car {

   private String Model;
   private boolean IsLeased;
   private LocalDate LeaseStartDate;
   private LocalDate LeaseEndDate;
   private Period defaultLeasePeriod = Period.of(0, 3, 0);

   public car(String Model, boolean IsLeased, LocalDate LeaseStartDate, LocalDate LeaseEndDate) {

      this.Model = Model;
      this.IsLeased = IsLeased;
      this.LeaseStartDate = LeaseStartDate;
      this.LeaseEndDate = LeaseEndDate;
   }

   public String getModel() {
      return Model;
   }

   public void setModel(String modelName) {
      if (Model != "") {

         this.Model = Model;

      } else
         System.out.println("Name of car, can not be empty");
      this.Model = "Some lesser Model";
   }

   public boolean IsLeased() {
      return IsLeased;
   }

   public void setLeaseStartDate(LocalDate LeaseStartDate) {
      if (LeaseStartDate.isAfter(LocalDate.now())) {
         this.LeaseStartDate = LeaseStartDate;
      } else {
         System.out.println("Not possible to set a date in the past \nwell unless you are the doc!");
         this.LeaseStartDate = LocalDate.now();
      }
   }

   public void setLeaseEndDate(LocalDate LeasedEndDate) {
      if (LeasedEndDate.isAfter((this.LeaseEndDate))) {
         this.LeaseEndDate = LeasedEndDate;
      } else {
         System.out.println("This cant be done");
         this.LeaseEndDate = LeasedEndDate.plus(defaultLeasePeriod);
      }
   }

   public String describeModel() {
      String description = null;
      if (this.IsLeased) {

         description = this.Model + " Is currently leased. \n It was leased on " + this.LeaseStartDate + "\n and leased until " + this.LeaseEndDate;

      } else {
         description = this.Model + "Is not currently under lease";
      }
      return description;
   }
}
