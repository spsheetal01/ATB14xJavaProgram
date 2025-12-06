package ex_08_Switch_Condition;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class ex069_Switch {
    public static void main(String[] args) {

        // Logic Building Formula

// Step 1 - Number one is using the Scanner class.
// Step 2 number two will be basically figuring out the expression and the day.
// Step 3- We will basically add step 3 as a rough logic.
// Step 4 - 4 is you will write the fix the logic and optimize.
// Step 5 - figure out the edge cases

        //Step1-
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day 1 to 7");
        // int age = scanner.nextInt(); //what if this is not an integer than
        if(scanner.hasNextInt()){  //hasNextInt -gives true /false value

            int day = scanner.nextInt();

            //what if user enter 8 then it will also take that value so for handling this situation we use Switch

            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Enter int number from 1 to 7 only , you Fool!!");

            }

        }else {
            System.out.println("Enter Int you Fool");
        }

//Note - without break it will print all

    }
}
