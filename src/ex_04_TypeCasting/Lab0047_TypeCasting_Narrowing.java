package ex_04_TypeCasting;

public class Lab0047_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val = 200;
        //byte b = val; // Narrowing > implicit casting > valid ? No
        byte b1 = (byte) val ; // Narrowing > explicit casting > valid ? yes
    }
}
