package Task.Task_20092024;

public class Task1_Ternary_operator_max0f3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 45;
         // max.between a and b
        int max1 = (a > b)? a : b;
        // max between max1 and c
        int max = (max1>c)? max1 : c;

        System.out.println("The maximum value of three number is  "+max);

    }
}
