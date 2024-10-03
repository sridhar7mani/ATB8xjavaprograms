package sept.ex_30092024;

import com.sun.source.tree.BinaryTree;

public class Lab0091_functions_type2 {
    public static void main(String[] args) {
//2.Without parameter and with return type
        String name = function_type2();
        System.out.println(name);

        int age = function_2();
        System.out.println(age);
    }

    public static String function_type2() {
        System.out.println("2.Without parameter and with return type");
        return "sridhar";
    }


        public static int function_2() {
            System.out.println("2.Without parameter and with return type");
            return  31;
        }



}
