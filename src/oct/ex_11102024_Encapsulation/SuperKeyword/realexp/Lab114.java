package oct.ex_11102024_Encapsulation.SuperKeyword.realexp;

public class Lab114 {
    public static void main(String[] args) {
        Baseclass t1 = new TestCase1(); //Dynamic Dispatch
        t1.openBrowser();
        t1.openBrowser("edge");
        t1.CloseBrowser();

    }
}
