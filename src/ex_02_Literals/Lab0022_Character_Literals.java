package ex_02_Literals;

public class Lab0022_Character_Literals {
    public static void main(String[] args) {
        char c1 = 'A'; //A to Z ,a to z , !@$%^&*()_+ -- -it is valid
        //char c = "b"; //this is bunch of string char
        char c2 = 'b';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = ' '; //blank space

        //Escape sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

//        System.out.println("sheetalPanwar");
//        System.out.println("Sheetal"+new_line+"Panwar");
//        System.out.println("Sheetal\nPanwar");
        System.out.println("test\tliteral\tchar");
        System.out.println("test\bphase1");
        System.out.println("test\rtesting");
        System.out.println("------");
    }
}
