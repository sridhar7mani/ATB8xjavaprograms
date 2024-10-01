package Task_27092024;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number to find x number of even numbers ");
        int n = sc.nextInt();
        int count =1;
       int number =2;
        do {
            System.out.println(number);
            number = number + 2;
            count++;
        }while (count<=n);
    }
}
