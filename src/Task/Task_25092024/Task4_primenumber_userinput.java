package Task.Task_25092024;

import java.util.Scanner;

public class Task4_primenumber_userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = sc.nextInt();
        int count =0;
        for (int i = 2; i <=n/2 ; i++) {
            if(n%i==0){
                count =1;
            }
            
        }if(count == 0) {
            System.out.println("The Number is Prime");}
        else{
            System.out.println("Not a prime number");
        }

    }
}
