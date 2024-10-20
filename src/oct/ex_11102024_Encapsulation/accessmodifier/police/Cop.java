package oct.ex_11102024_Encapsulation.accessmodifier.police;

public class Cop {
   private int gun;
  private String idCard;

    public Cop(int gun) {
        this.gun = gun;
    }
   protected void CanIShoot(){
        System.out.println("Yes You Can!!");
    }
}
