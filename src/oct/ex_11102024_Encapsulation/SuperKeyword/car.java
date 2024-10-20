package oct.ex_11102024_Encapsulation.SuperKeyword;

public class car extends vehicle{
    private int maxSpeed = 280;

    car(){
        //super();
        super(10);
        System.out.println("Default constructor");
        System.out.println(this.maxSpeed);
        System.out.println(super.maxSpeed);
    }

}
