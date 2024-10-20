package oct.ex_11102024_Encapsulation.ecap.expample2;

public class ICICIBank {
    private String name;
    private long bal;

    public ICICIBank(long bal, String name) {
        this.bal = bal;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal,boolean isOwner) {
        if(isOwner) {
            this.bal = bal;
            System.out.println("Allowed");
        }else {
            System.out.println("Not Allowed");
        }
    }
}
