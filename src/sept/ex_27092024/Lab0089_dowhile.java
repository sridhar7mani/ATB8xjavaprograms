package sept.ex_27092024;

public class Lab0089_dowhile {
    public static void main(String[] args) {
        int a =0;
        do {
           System.out.println("print"+a);
            a++;
        }
        while(a<0);//this condition will fail
        // as it was a do while so first statement will print

        //same condition in while loop
        /*while (a<0){
            System.out.println("Print" +a);
            a++;
        }*/

    }

}
