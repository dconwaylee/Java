package Week2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MathGame {
    public static void main(String[] args) {

        Scanner scannerChoice = new Scanner(System.in);

        System.out.println("Welcome to basic number & operators");
        System.out.println("Please choose one of the following options");
        System.out.println("Option 1 - You want to add those numbers");
        System.out.println("Option 2 - You want to take away those numbers");
        System.out.println("Option 3 - You want to multiply, go forth...");
        System.out.println("Option 4 - Divide the numbers, just like opinions...");
        System.out.println("Option 5 - Oh, damn this ain't my thing, I'm out");
        System.out.println();
        System.out.println("Please choice an option, by entering the number...");
        begining:
       try

            {

                int optionChoice = scannerChoice.nextInt();

                if (scannerChoice.hasNextInt())
                    optionChoice = scannerChoice.nextInt();

                while (optionChoice < -1 || optionChoice > 5) {
                    if (scannerChoice.hasNextInt())
                        optionChoice = scannerChoice.nextInt();
                }

                switch (optionChoice) {
                    case 1:
                        Scanner scanAdd = new Scanner(System.in);
                        boolean addAgain = true;
                        while (addAgain) {

                            System.out.print("Enter first number: ");
                            int num1 = scanAdd.nextInt();

                            System.out.print("Enter second number: ");
                            int num2 = scanAdd.nextInt();

                            int output = num1 + num2;
                            System.out.println("First Number: " + num1 + " ADD " + " Second Number: " + num2 + " = ");
                            System.out.println("Addition Result : " + output);
                            System.out.println("Play Addition again? True or False?");
                            if (scanAdd.nextBoolean()) {
                                addAgain = true;
                            } else {
                                break begining;
                            }
                        }
                        break begining;

                    case 2:
                        Scanner scanSubtract = new Scanner(System.in);
                        boolean takeAgain = true;
                        while (takeAgain) {

                            System.out.print("Enter first number: ");
                            int num1 = scanSubtract.nextInt();

                            System.out.print("Enter second number: ");
                            int num2 = scanSubtract.nextInt();

                            int output = num1 - num2;
                            System.out.println("First Number: " + num1 + " MINUS " + " Second Number: " + num2 + " = ");
                            System.out.println("Subtract Result : " + output);
                            System.out.println("Play Subtraction again? True or False?");
                            if (scanSubtract.nextBoolean()) {
                                takeAgain = true;
                            } else {
                                break begining;
                            }
                        }
                        break begining;

                    case 3:
                        Scanner scanMultiply = new Scanner(System.in);
                        boolean multiplyAgain = true;
                        while (multiplyAgain) {

                            System.out.print("Enter first number: ");
                            int num1 = scanMultiply.nextInt();

                            System.out.print("Enter second number: ");
                            int num2 = scanMultiply.nextInt();

                            int output = num1 * num2;
                            System.out.println("First Number: " + num1 + " MULTIPLY " + "Second Number: " + num2 + " = ");
                            System.out.println("Multiplication Result : " + output);
                            System.out.println("Play Multiplication again? True or False?");
                            if (scanMultiply.nextBoolean()) {
                                multiplyAgain = true;
                            } else {
                                break begining;
                            }
                        }
                        break begining;

                    case 4:
                        Scanner scanDivide = new Scanner(System.in);
                        boolean divideAgain = true;
                        while (divideAgain) {

                            System.out.print("Enter first number: ");
                            float num1 = scanDivide.nextFloat();

                            System.out.print("Enter second number: ");
                            float num2 = scanDivide.nextFloat();

                            float output = num1 / num2;
                            System.out.println("First Number: " + num1 + " DIVIDE " + "Second Number: " + num2 + " = ");
                            System.out.println("Division Result : " + output);
                            System.out.println("Play Division again? True or False?");
                            if (scanDivide.nextBoolean()) {
                                divideAgain = true;
                            } else {
                                break begining;
                            }
                        }
                        break begining;

                    case 5:
                        System.out.println("Game Over!... Please insert more credits to play again");
                        break begining;
                }
            }
       catch(
            InputMismatchException ex)

            {
                System.out.println("There was an error... Please enter numbers only ");
                String msg = ex.getMessage();
                if (msg == null) {
                    msg = ex.getClass().getName();
                    break begining;
                }
            }



        }

    }