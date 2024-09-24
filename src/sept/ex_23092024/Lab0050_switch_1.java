package sept.ex_23092024;

public class Lab0050_switch_1 {
    public static void main(String[] args) {
        //Switch condition
        //days 1 t0o 7  1->Mon,2->tues....,
        int day = 5;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No idea,Whar day is this");
                break;

        }
    }
}
