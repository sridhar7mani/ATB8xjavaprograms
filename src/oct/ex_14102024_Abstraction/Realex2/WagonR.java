package oct.ex_14102024_Abstraction.Realex2;


public class WagonR extends Engine{
     void drive(){
         StartEngine();
         StopEngine();
     }
    @Override
    void StartEngine() {
        System.out.println("Starting Car ");
    }

    @Override
    void StopEngine() {
        System.out.println("Stopping Car");

    }
}
