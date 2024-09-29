package Task.Task_25092024;

import java.util.Scanner;

public class Task3_count_of_vowels_consent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        int vowels = 0;
        int conso = 0;

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if(ch == 'a'||ch == 'e'||ch == 'i'||ch == '0'|| ch == 'u') {
                vowels++;
            }else{
                conso++;

            }

            
        }
        System.out.println("Vowels:" +vowels);
        System.out.println("consonant:" +conso);
    }
}
