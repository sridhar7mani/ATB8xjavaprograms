package oct.ex_14102024_Abstraction.ex1;

public class FIREFOXTC extends BaseClass {

    @Override
    void openBrowser() {
        System.out.println("open the FireFox");
    }

    @Override
    void closeBrowser(String browser) {
        System.out.println("close the FireFox");
    }
}
