package oct.ex_11102024_Encapsulation.SuperKeyword.realexp;

public class Baseclass {
    private String browser;

    Baseclass() {
        System.out.println("DC - Baseclass");
    }
    Baseclass(String b){
        System.out.println("CC - Baseclass");
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser,boolean isAuth) {
        if (isAuth){
        this.browser = browser;
    }else {
            System.out.println("Not allowed");
        }
    }

    void openBrowser(){
        System.out.println("Chrome Browser!!");
    }

    void openBrowser(String browsername){
        System.out.println("open Browser!!" +browsername);
    }
    void CloseBrowser(){
        System.out.println("Close Browser");
    }
}
