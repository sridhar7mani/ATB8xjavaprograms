package Task.Task_25092024;

import java.util.Scanner;

public class Task2_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to Find Factorial : ");
        int n = sc.nextInt();
        int fact =1;
        for (int i = 1; i <= n; i++) {
            fact =fact*i;
            
        }
        System.out.println("Factorial of "+n+"is:" +fact);
    }
}
