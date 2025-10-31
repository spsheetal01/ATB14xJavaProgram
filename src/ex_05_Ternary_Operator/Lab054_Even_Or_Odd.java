package ex_05_Ternary_Operator;
// check the even or odd using ternary

public class Lab054_Even_Or_Odd {
    public static void main(String[] args) {
        //Step -1 Input, Output > data type
        int num = 13;

        //step -2 -
        //num%==2 , output - even or odd

        String Result = (num%2 == 0) ? "Even" : "Odd";
        System.out.println(Result);
    }
}
