package ex_05_Ternary_Operator;

public class Lab052_TO_question {
    public static void main(String[] args) {
        int age = 21;
        //Nested ternary
        //Result = condition1 ? expression1 :(Condition2 ? expression2 : expression3);
        String Result = (age >18) ? (age >25 ? "you can drink" : "you can go to Goa but you can not drink"): "No";
        System.out.println(Result);
    }
}
