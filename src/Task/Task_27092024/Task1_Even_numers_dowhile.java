package Task.Task_27092024;

import java.util.Scanner;

public class Task1_Even_numers_dowhile {
    public static void main(String[] args) {
        int x=1,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number : ");
        n = sc.nextInt();

        do
        {
            if(x%2==0)
            {
            System.out.println(x);
            }
            x++;
        }while (x<=n);
    }
}
