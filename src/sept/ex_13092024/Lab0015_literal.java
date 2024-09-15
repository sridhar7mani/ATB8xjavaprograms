package sept.ex_13092024;

public class Lab0015_literal {
    public static void main(String[] args) {
        //boolean literal
        boolean is_married = true;

        //interger literal
        int age =31;
        //Binary literal
        int binary_num = 0b1010;
        //octal litral base of 8
        int octal = 0101;
        //hexa decimal literal base of 16
        int hexa = 0xface;

        //char literal
        // single char
        char c1 = 'A';
        char c2 = 'b';
        char c3 = '@';

        //Escape literal
        char new_line ='\n';
        char tab_line ='\t';
        char back_space ='\b';
        char car_r ='\r';

        System.out.println("sridhar" + new_line + "Mani");
        System.out.println("sridhar" + tab_line + "Mani");
        System.out.println("sridhar" + back_space + "Mani");
        System.out.println("sridhar" + car_r + "Mani");

        char c4 = '\u1f60';//unicode
        System.out.println(c4);






    }
}
