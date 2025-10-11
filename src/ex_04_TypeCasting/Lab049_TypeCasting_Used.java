package ex_04_TypeCasting;

public class Lab049_TypeCasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.4f;
        //int total1 = course+GST; // Narrowing implicit not possible
        int total = course +(int) GST ; //Narrowing explicit >possible
        System.out.println(total);

        float total2 = course+GST; //widening > auto implicit
    }
}
