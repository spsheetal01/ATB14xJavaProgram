package ex_06_Increment_Decrement;

public class Lab060_Increment_ex {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);

        // ERT
        // Line no | a | exp
        // 5 | 10 | NA
        // 6 | 10 | 12 -- >22
    }
}
