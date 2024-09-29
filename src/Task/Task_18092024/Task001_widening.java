package Task.Task_18092024;

public class Task001_widening {
    public static void main(String[] args) {
        byte a = 100;
        short b = 15000;
        //long c = a + b; // widening _implict casting
        long c = (long)(a + b);//widening _explicit casting
        System.out.println(c);


        long s = 98564321l;
        float m = s;//widening _implicit casting
        float k = (float)s;//Widening _explicit casting
        System.out.println(m);
        System.out.println(k);

    }
}
