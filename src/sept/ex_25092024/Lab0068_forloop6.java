package sept.ex_25092024;

public class Lab0068_forloop6 {
    public static void main(String[] args) {
        final boolean b1 = true;//final is constant ,so b1 value is fixed here not able to change
        for(int i = 0; b1 ; i++){//output is infinite
            System.out.println("Hello");
        }
    }
}
