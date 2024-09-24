package sept.ex_23092024;

public class Lab0051_switch_2 {
    public static void main(String[] args) {
        //Switch condition
        //days 1 t0o 7  1->Mon,2->tues....,


        // if break is not present in any case then all the conditions will execute untill the break found
        int day = 1;
        switch (day){
            case 1:
                System.out.println("Monday");

            case 2:
                System.out.println("Tuesday");

            case 3:
                System.out.println("Wednesday");

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
