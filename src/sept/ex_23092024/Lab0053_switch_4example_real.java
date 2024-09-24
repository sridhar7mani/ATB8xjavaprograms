package sept.ex_23092024;

public class Lab0053_switch_4example_real {
    public static void main(String[] args) {
        //web automation
        //I will ask user which browser you want to run the code.
        //chrome -> execute chrome
        //firefox -> execute firefox
        //edge -> execute edge

        String browser ="chrome";
        switch(browser){
            case "chrome":
                System.out.println("Starting the chrome browser");
                //further code to start the chrome
                // webdriver driver = new chrome();//selenium code
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                //further code to start the firefox
                // webdriver driver = new firefox();//selenium code
                break;
            case "edge":
                System.out.println("Starting the edge browser");
                //further code to start the edge
                // webdriver driver = new edge();//selenium code
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;


        }
    }
}
