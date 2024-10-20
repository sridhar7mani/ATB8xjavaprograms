package oct.ex_11102024_Encapsulation.SuperKeyword.realexp;

public class TestCase1 extends Baseclass{
    TestCase1(){
        super();//call Default Constructor
        this.setBrowser("Edge",true);
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        super.setBrowser(browser, isAuth);
    }
}
