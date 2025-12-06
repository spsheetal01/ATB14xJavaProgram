package ex_08_Switch_Condition;

public class Lab078_JDK13 {
    public static void main(String[] args) {
        int ItemCode = 006;
        switch (ItemCode){
            case 001,002,003:
                System.out.println("Electronic gadget");
                break;
            case 004,005,006:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
        }
    }
}
