package sept.ex_23092024;

public class Lab0055_switch_newsyntax_break {
    public static void main(String[] args) {
        //new syntax for break
        // available in JDK above versions 13.(jdk>13)
        // break/->
        // it is also work for multiple statement or multiple math
        int itemCode = 007;
        switch(itemCode)
        {
            case 001-> System.out.println("It is a laptop");
            case 002 -> System.out.println("It is a desktop");
            case 003,004,005-> System.out.println("It is mobile"); //multiple condition/statement/match
            default -> System.out.println("Hello");
        }
    }
}
