package oct.ex_11102024_Encapsulation.ecap;

public class Lab110 {
    public static void main(String[] args) {
        GoodVMOlogin vmologin1 = new GoodVMOlogin("admin","password129");
        // System.out.println(vmologin1.password); //we cant access the password because its encapsulated or privated
        System.out.println(vmologin1.getPassword());
        //check admin
        boolean isAdmin = false;
        vmologin1.setPassword("admin123",isAdmin);
        System.out.println(vmologin1.getPassword());
        System.out.println(vmologin1.getUsername());
        vmologin1.setPassword("admin122",isAdmin);

    }
}
