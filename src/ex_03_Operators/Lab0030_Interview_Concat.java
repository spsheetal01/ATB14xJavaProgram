package ex_03_Operators;

public class Lab0030_Interview_Concat {
    public static void main(String[] args) {

        //what should be print 1st?

        String First_name = "Sheetal";
        String Last_name = "Panwar";

        int a = 20;
        int b = 20;

       // System.out.println(First_name+Last_name+a+b);
        System.out.println(First_name+Last_name+(a+b));
        //it behave as concatenation
        System.out.println(a+b+First_name+Last_name);

    }
}
