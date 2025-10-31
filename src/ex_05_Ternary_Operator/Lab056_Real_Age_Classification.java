package ex_05_Ternary_Operator;

public class Lab056_Real_Age_Classification {

    public static void main(String[] args) {
        String User_Input = args[0]; //68
       // String UP2 = args[1]; //14
        //String UP3 = args[2]; //16

        System.out.println(User_Input);
        //convert string to int

        System.out.println(User_Input instanceof String );

        /*System.out.println(UP2);
        System.out.println(UP3); */

//input - age string
        //convert string to int
        int age = Integer.parseInt(User_Input);

        String Result = (age < 18 ) ? "Minor" :(age < 60) ? "Adult" : "Snr Citizen" ;
        System.out.println(Result);

    }
}
