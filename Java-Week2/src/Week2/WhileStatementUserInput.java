package Week2;

import java.util.Scanner;

public class WhileStatementUserInput {

    public static void main(String[] args) {

        int counter = 0;

        Scanner myScanner = new Scanner (System.in);

    boolean runAgain = true;
        while(counter < 11) {
            String input = myScanner.nextLine();
            System.out.print("Please enter stop command to stop or just press enter to continue: ");

            if(input.contains("stop")) {
                break;
            }
            System.out.println(counter++);
        }
    }
}