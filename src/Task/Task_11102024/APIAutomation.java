package Task.Task_11102024;

public class APIAutomation {
    public  static void main (String[] args){

        BaseTestAPI obj=new TestCaseAPI(); // Dynamic Dispatch
        obj.setId(1);
        obj.setName("Sri",true);
    }
}
