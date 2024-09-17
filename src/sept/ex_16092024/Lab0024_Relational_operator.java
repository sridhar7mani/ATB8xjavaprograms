package sept.ex_16092024;

public class Lab0024_Relational_operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean c = a > b;
        boolean d = a < b;
        System.out.println(c);
        System.out.println(d);

        int age_aarthi = 23;
        int age_sridhar = 31;
        boolean result = age_sridhar > age_aarthi;
        boolean result1 = age_sridhar >= age_aarthi;//age_sridhar > age_aarthi or age_sridhar = age_aarthi
        System.out.println(result);
        System.out.println(result1);
    }
}
