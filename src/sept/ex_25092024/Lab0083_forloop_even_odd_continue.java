package sept.ex_25092024;

public class Lab0083_forloop_even_odd_continue {
    public static void main(String[] args) {
        for (int i = 0; i <=50 ; i++) {
            if( i%2 ==0){
                System.out.println("Even Number "+i);
                continue;
            }
            System.out.println("Odd Number "+i);


        }
    }
}
