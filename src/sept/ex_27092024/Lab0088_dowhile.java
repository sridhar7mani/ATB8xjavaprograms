package sept.ex_27092024;

public class Lab0088_dowhile {
    public static void main(String[] args) {
        //while->int->condition->body->increment/decrement
        //Do while ->int->body->condition->increment/decremenrt
        int a= 0;
        do {
            System.out.println("Print"+a);
            a++;
        }while (a<10);
    }
}
