package sept.ex_23092024;

public class Lab0052_switch_3 {
    public static void main(String[] args) {
        //Switch condition
        //days 1 t0o 7  1->Mon,2->tues....,


        // if break is not present in any case then all the conditions will execute untill the break found
        // if we remove all the break keyword it will execute all the conditions see below
        int day = 4;
        switch (day){
            case 1:
                System.out.println("Monday");

            case 2:
                System.out.println("Tuesday");

            case 3:
                System.out.println("Wednesday");

            case 4:
                System.out.println("Thursday");

            case 5:
                System.out.println("Friday");

            case 6:
                System.out.println("saturday");

            case 7:
                System.out.println("Sunday");

            default:
                System.out.println("No idea,Whar day is this");


        }
        System.out.println("End of loop");
    }

}
