package Week2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class School {


   private static ArrayList<StudentDetails> formGroup = new ArrayList<StudentDetails>();

   School() {

      //This is stub
      //formGroup.add(new StudentDetails("Domonic", 40));
     // formGroup.add(new StudentDetails("Adam", 21));
      newMenu();
   }

   public static void main(String[] args) {

      new School();
   }

   public static void newMenu() {

      boolean isProgramEnded = false;
      Scanner userInput = new Scanner(System.in);

      int choice = 0;

      System.out.println("       Welcome to the Idris school of Java        ");
      System.out.println("--------------------------------------------------");
      System.out.println("     Java Skill Level Loading.... Please Wait     ");
      System.out.println("     [####################...................]    ");
      try {
         TimeUnit.SECONDS.sleep(5);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      System.out.println("     Java Skill Level Loaded  Welcome to Java     ");
      System.out.println("     [#######################################]    ");
      System.out.println();
      try {
         TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      System.out.println("--------------------------------------------------");
      System.out.println("    Please choose one of the following options    ");
      System.out.println("--------------------------------------------------");
      System.out.println("     Option 1 - You want to add a student         ");
      System.out.println("     Option 2 - Display all of the students       ");
      System.out.println("          Option 3 - Expel Student                ");
      System.out.println("          Option 4 - End class for the day        ");
      System.out.println("--------------------------------------------------");
      System.out.println(" Please choice an option, by entering the number  ");

      try {

         choice = userInput.nextInt();
      } catch (InputMismatchException ex) {

         System.out.println("There was an error... Please enter numbers only ");
         String msg = ex.getMessage();
         msg = ex.getClass().getName();
      }

      if (choice == 4) {

         System.out.println("Too much Java today!! Head hurts, me gone gaga!");
         System.exit(0);

      } else {
         while (!isProgramEnded) {
            if (choice == 1) {
               // This is calling the method to add student to the arraylist
               addStudent();
               System.out.println("Option 1 selected");
               newMenu();
            } else if (choice == 2) {
               System.out.println("Option 2 selected");
               showStudents();
               //print out all the learners
               newMenu();
            } else if (choice == 3) {
               expelStudent();
               System.out.println("Option 3 selected");
               newMenu();
            } else {
               System.out.println("Enter a valid choice");
               newMenu();
            }

         }
      }
   }

   public static void addStudent() {


      Scanner addStudent = new Scanner(System.in);

      String studentName;
      Integer studentAge;
      System.out.println("Enter Student Name");
      studentName = addStudent.next();
      System.out.println("Enter Student Age");
      studentAge = addStudent.nextInt();
      System.out.println("You are going to add " + studentName + " as a new student. are you sure?");

      Scanner ansCheck = new Scanner(System.in);

      boolean answer = ansCheck.nextLine().toLowerCase().startsWith("y");
      if (answer) {
         System.out.println("gave yes as answer");
         formGroup.add(new StudentDetails(studentName, studentAge));

      } else {
         System.out.println("Gave No as answer.");
         newMenu();
      }
   }
   //option to add another student yes or no.
   //yes returns the addStudent method
   //no returns to the main menu.

   public static void showStudents() {

      int studentEnNum = 0;

      System.out.println("################################################################################################################");
      System.out.println("__ ____   ____  __  __      __    ___ __  __   ___     ___   __         ___    ____       __  ___  __ __  ___   ");
      System.out.println("|| || \\  || \\ || (( |    (( |  //   ||  ||  // \\   // \\  ||        // \\  ||          || // \\ || || // \\  ");
      System.out.println("|| ||  )) ||_// ||  \\      \\  ((    ||==|| ((   )) ((   )) ||       ((   )) ||==        || ||=|| \\ // ||=||  ");
      System.out.println("|| ||_||  || || || |_))    |_))  \\__ ||  ||  \\_//   \\_//  ||__|     \\_//  ||       |__|| || ||  |V/  || ||  ");
      System.out.println("                                                                                                                ");
      System.out.println("################################################################################################################");
      System.out.println("");
      System.out.println("################################################################################################################");
      System.out.println("############################################Current Headteacher is: ############################################");

      System.out.println("################################################################################################################");
      System.out.println("##########################################Students currently attending##########################################");

      for (int s = 0; s < formGroup.size(); s++) {
         System.out.println(studentEnNum + " Student Name: " + formGroup.get(s).getStudentName() + " Age: " + formGroup.get(s).getStudentAge());
         studentEnNum++;
      }
      System.out.println("################################################################################################################");
   }

   public static void expelStudent() {
      //Display list of learners with index
      int index = 0;

      for(StudentDetails tempstudent : formGroup){
         System.out.println(index++ + " " + tempstudent.getStudentName());
      }
      Scanner deleteIndex = new Scanner(System.in);

      System.out.println("Select the student by number to expel");
      int choice = deleteIndex.nextInt();
      //Integer choice = deleteIndex.nextInt();
      formGroup.remove(choice);

      showStudents();

   }
}