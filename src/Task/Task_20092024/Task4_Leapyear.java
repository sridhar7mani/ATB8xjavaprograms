package Task.Task_20092024;

public class Task4_Leapyear {
    public static void main(String[] args) {
        int year = 2024;
        if(((year % 4 ==0) && (year % 100!=0)) || (year % 400 ==0)){

            System.out.println("The given year is LEAP YEAR");
        }
        else {
            System.out.println("It is NOT a LEAP YEAR");
    }
    }
}
