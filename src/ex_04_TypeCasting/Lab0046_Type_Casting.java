package ex_04_TypeCasting;

public class Lab0046_Type_Casting {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; //Valid syntax >widening >implicit casting > automatically done
        int a1 = (int) b ; // Valid syntax > widening > explicit casting > not required
    }
}
