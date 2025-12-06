package ex_08_Switch_Condition;

public class Lab079_Interview {
    public static void main(String[] args) {
        int a =11;
        switch (-1){
            default:
                System.out.println("Default");
            case -1:
                System.out.println("10");
                break;
            case 9:
                System.out.println("9");
                break;

                //o/p - should be 10 instead of default becoz -1 match with 10
        }
    }
}
