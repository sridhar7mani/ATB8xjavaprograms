package sept.ex_16092024;


public class Lab0022_concatenation_opera {
    public static void main(String[] args) {
        String first_name = "Sridhar";
        String last_name = "Mani";
        //concatenation operator '+'
        //+ -> int + int ->math(add)
        //+ ->String -> Combine - Concatenation
        System.out.println(first_name + last_name );
        int a = 10;
        int b = 20;
        System.out.println(first_name + last_name + a + b);//first string is there so concatination will take place
        System.out.println(first_name + last_name + (a + b));//if we insert bracket addition will take place
        System.out.println(a + b + first_name + last_name);// here int is first so addition will take place after concetation for string
    }
}
