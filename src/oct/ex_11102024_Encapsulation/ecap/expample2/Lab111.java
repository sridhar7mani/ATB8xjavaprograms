package oct.ex_11102024_Encapsulation.ecap.expample2;

public class Lab111 {
    public static void main(String[] args) {
        ICICIBank sri = new ICICIBank(100,"sri");

        //Admin
        boolean are_you_admin = true;
        ICICIBank sri2 = new ICICIBank(1000,"sri2");
        sri2.setBal(10000,true);
        System.out.println(sri2.getName());
        System.out.println(sri2.getBal());

        sri.setBal(5000,false);
        System.out.println(sri.getBal());

    }
}
