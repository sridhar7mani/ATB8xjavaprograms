package sept.ex_30092024;
//With parameters and with return  type
public class Lab0093_function_type4 {
    public static void main(String[] args) {
        int result = function_type4(7,8);
        System.out.println(result);


    }
    public static int function_type4(int a,int b){
        System.out.println("With parameters and with return type");
        return a+b;
    }
}
