package oct.ex_11102024_Encapsulation.ecap;

public class Lab109 {
    public static void main(String[] args) {
        VMOLogin vmologin = new VMOLogin("admin","Password123");
        System.out.println(vmologin.Password);
        vmologin.Password = "hacker";
        System.out.println(vmologin.Password);

        GoodVMOlogin vmologin1 = new GoodVMOlogin("admin","password123");
       // System.out.println(vmologin1.password); //we cant access the password because its encapsulated or privated
    }

}
