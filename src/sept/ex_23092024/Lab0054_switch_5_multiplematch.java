package sept.ex_23092024;



public class Lab0054_switch_5_multiplematch {
    public static void main(String[] args) {

        int itemcode = 001;
        switch (itemcode){
            case 001,002,003:
                System.out.println("All of them are electronic gadget");
                break;
            case 004,005:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
                break;

        }
    }
}
