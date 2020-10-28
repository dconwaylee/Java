package Week2;

import WarmUp.Student;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class School {


   private static ArrayList<Student> formGroup = new ArrayList<Student>();

   public School(ArrayList formGroup){
   }
   //arraylist for students
   //constructor


   public static void main(String[] args) {

      newMenu();
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
      System.out.println("          Option 2 - Some Option                  ");
      System.out.println("          Option 3 - Another Option               ");
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
               // This is calling to add student to the arraylist
               addStudent();
               System.out.println("Option 1 selected");
               newMenu();
            } else if (choice == 2) {
               System.out.println("Option 2 selected");
               newMenu();
            } else if (choice == 3) {
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

      formGroup.add(new Student(studentName, studentAge));

      //menu to ask the student name
      //menu to ask the student age
      //
   }
} 