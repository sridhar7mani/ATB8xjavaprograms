package Task.Task_18092024;

public class Task001_Narrowing {
    public static void main(String[] args) {
      //Narrowing Implict
        long a = 8761234;
        long b = 345632;
       // int c = a + b;// Error->java: incompatible types: possible lossy conversion from long to int
       // System.out.println(c);
        //Narrowing Explicit casting
        int c = (int)(a + b);
        System.out.println(c);
    }
}
