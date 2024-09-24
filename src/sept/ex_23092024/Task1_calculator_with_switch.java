package sept.ex_23092024;

public class Task1_calculator_with_switch {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 5;
        char op = '%';
        switch (op){
            case '+':
                System.out.println("Addition of given numbers is " + (num1 + num2));
                break;
            case '-':
                System.out.println("Subtraction of given numbers is " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication of given numbers is " + (num1 * num2));
                break;
            case '/':
                System.out.println("Division of given numbers is " + (num1 / num2));
                break;
            case '%':
                System.out.println("Modulus of given numbers is " + (num1 % num2));
                break;

        }
    }
}
