package Task.Task_25092024;

import java.util.Scanner;

public class Task1_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Table Number to Print :  ");
        int n = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(+i+ "*" +n+ "=" +n*i);

        }
    }
}
