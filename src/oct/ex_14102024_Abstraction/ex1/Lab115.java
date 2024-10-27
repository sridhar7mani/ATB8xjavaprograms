package oct.ex_14102024_Abstraction.ex1;

public class Lab115 {
    public static void main(String[] args) {
        CHROMETC c = new CHROMETC();
        c.openBrowser();
        c.closeBrowser("chrome");
        c.takeScreenshot();
        c.NoBodyKnowWhereIamPresent();


        FIREFOXTC f = new FIREFOXTC();
        f.openBrowser();
        f.closeBrowser("Firefox");

    }
}
