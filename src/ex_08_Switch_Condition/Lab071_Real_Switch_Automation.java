package ex_08_Switch_Condition;

import java.util.Scanner;

public class Lab071_Real_Switch_Automation {
    public static void main(String[] args) {

        //it will use in web automation
        //i will ask user to give an input from browser which he wants to
        //use to i will start automation in that browser

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Browser");
        String Browser = scanner.next();

        switch (Browser){
            case "Chrome":
                System.out.println("Starting the Chrome");
            break;
            case "Edge":
                System.out.println("Starting the Edge");
                break;
            case "Firefox":
                System.out.println("Starting the Firefox");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;



        }
    }
}
