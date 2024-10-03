package Task.Task_27092024;

import java.util.Scanner;

public class Task2_sum_of_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to sum up from 1 to :");
        int n = sc.nextInt();
        int sum = 0;
        int i =1;
        while (i<=n){
            sum = sum + i;
            i++;

        }System.out.println("sum of number from 1 to  "+n+ "  is  "+sum);

    }
}
