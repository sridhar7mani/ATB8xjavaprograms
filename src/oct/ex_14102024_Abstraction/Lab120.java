package oct.ex_14102024_Abstraction;

public class Lab120 {


    }

    interface I3{
        default void Start(){
            System.out.println("Default Interface have body");
        }
        void Stop();
        void car();

        static void ss(){
            System.out.println("Static also have interface");
        }
    }

    abstract class AA {
        void f1() {
            System.out.println("concrete Method");

        }

        abstract void f2();

        static void f4() {
            System.out.println("Yes");
        }
    }
