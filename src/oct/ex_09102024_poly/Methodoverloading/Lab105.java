package oct.ex_09102024_poly.Methodoverloading;

public class Lab105 {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();
       int result = m.add(3,7);
        System.out.println(result);
        String name = m.add("sridhar", "mani");
        System.out.println(name);
    }
}
