package oct.ex_14102024_Abstraction.ex1;

public class CHROMETC extends BaseClass {
    @Override
    void openBrowser() {
        System.out.println("open the chrome");
    }

    @Override
    void closeBrowser(String browser) {
        System.out.println("close the chrome");
    }
}
