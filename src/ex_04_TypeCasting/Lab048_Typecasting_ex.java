package ex_04_TypeCasting;

public class Lab048_Typecasting_ex {
    public static void main(String[] args) {
        long phone = 9876543210L;
        //short s = phone; // widening to narrowing not possible > Narrowing-implicit
        short s= (short) phone; //Narrowing explicit
        System.out.println(s);
    }
}
