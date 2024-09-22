package sept.ex_20092024;

public class Lab0047_elseif {
    public static void main(String[] args) {
        // maximum of two number
        int num1 = 10;
        int num2 = 10;
        if (num1>num2){
            System.out.println(num1);
        } else if (num2 > num1)
        {
            System.out.println(num2);
        }
        else {
            System.out.println("Equal");
        }
    }
}
