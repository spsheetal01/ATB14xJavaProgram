package ex_08_Switch_Condition;
//without break
public class Lab077_JDK13Above {
    public static void main(String[] args) {
        int ItemCode = 001;
        switch (ItemCode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");
        }
    }
}
