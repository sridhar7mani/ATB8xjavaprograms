package sept.ex_25092024;

public class Lab0080_forloop_continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                continue;//do nothing and go to next iteration
            }
            System.out.println("After");
        }
    }
}