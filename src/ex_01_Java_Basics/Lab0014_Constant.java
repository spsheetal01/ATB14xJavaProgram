package ex_01_Java_Basics;

public class Lab0014_Constant {
    public static void main(String[] args) {
        int a=10;
        a=11;
        System.out.println(a);

        final int b=99;
//        b=100; java can not assign value to final variable b , Final is keyword for keep the value constant
        System.out.println(b);
    }
}
