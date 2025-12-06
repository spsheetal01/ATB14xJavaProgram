package ex_07_If_Condition;

public class Lab064_If {
    public static void main(String[] args) {

        String User_input = args[0]; //take user input from command line
        System.out.println(User_input);
        //now converted into integer
        int age = Integer.parseInt(User_input);
        System.out.println(age);

        if (age > 65) {
            System.out.println("Yes you can vote");
        }
            else {
                System.out.println("You can not vote");
            }
        }


}
