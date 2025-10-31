package ex_05_Ternary_Operator;

public class Lab055_Three_Max {
    public static void main(String[] args) {

        int n1 = 4;
        int n2 = 8;
        int n3 = -12;

        //LBF-Logic building formula
        //step1-
        // find i/o ,O/p data type
        //I/O - int --> n1,n2,n3
        //O/P - Max number or String ,we can message with maximum number
        //Step-2
        //write rough logic and think about
        // n1> n2 && n1 > n3 --> n1 is greater
        //n2 > n3 && n2 > n1 --> n2 is greater
        // if both condition fail then n3 is greater
        //Step 3 - Dry run

        int max = (n1 > n2) ? ((n1 > n3)? n1 : n3) :((n2 > n3) ? n2 : n3) ;
        System.out.printf("max is %d",max);


    }
}
