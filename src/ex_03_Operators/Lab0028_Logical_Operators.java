package ex_03_Operators;

public class Lab0028_Logical_Operators {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(!a); // ! not operator means true false ,false true

        boolean b = true;
        System.out.println(!!b);

        boolean c = true || false; // or operator
        System.out.println(c);

        boolean d = false && true ;
        System.out.println(d);
    }
}
