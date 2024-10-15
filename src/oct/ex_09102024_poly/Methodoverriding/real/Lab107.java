package oct.ex_09102024_poly.Methodoverriding.real;

public class Lab107 {
    public static void main(String[] args) {
    son s = new son();
    s.home();
    Father f = new Father();
    f.home();

    // dynamic Dispatch
        Father object = new son();
        object.home();
    }
}
