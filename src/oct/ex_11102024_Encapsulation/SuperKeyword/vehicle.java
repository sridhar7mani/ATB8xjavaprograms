package oct.ex_11102024_Encapsulation.SuperKeyword;

public class vehicle {
    public int maxSpeed = 180;

     vehicle() {
         System.out.println("DC vehicle");
     }
    vehicle(int a){
        System.out.println("PC vehicle");
    }

    void message(){
        System.out.println("Hello Vehicle");
    }

    void message(int a){
        System.out.println("Hlo vehicle");
    }
}
