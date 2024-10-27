package oct.ex_14102024_Abstraction.Interface;

public class interfac {
    public static void main(String[] args) {
        P p = new P();
        p.f1();
    }
}
   class P implements I{

       @Override
       public void f1() {
           System.out.println("Created P");
       }

       @Override
       public void f2() {

       }
   }



    interface I{
        void f1();
        void f2();
    }

