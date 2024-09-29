package Task.Task_23092024;

public class Task3_km_m_and_c_f {
    public static void main(String[] args) {
        int  km = 2;
        double feh = 96.0;
        int choice = 2;
        int result1;
        double result2;
        switch (choice){
            case 1:
                 result1 = km*1000;//km to m conversion
                System.out.println(result1 + "m");
                break;
            case 2:
                result2 = ((feh-32)*5/9);
                System.out.println(result2 + "celsius");
                break;
            default:
                System.out.println("Not valid");
                break;
        }
    }
}
