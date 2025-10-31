package ex_06_Increment_Decrement;

public class Lab061_Increment_ex2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);

        //ERT
        // ++a ---A = 11
        // ++a -- b = 12  >> 11+12 = 23
        // a = 12
    }
}
