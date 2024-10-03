package oct.ex_02102024;

public class ATBstudent {
    Long mobNum;
    String address;
    String Name;
    String course;
    boolean isMale;

    public void displaydetails() {
        System.out.println("Name: " + Name);
        System.out.println("Mobile Number: " + mobNum);
        System.out.println("Address: " + address);
        System.out.println("Course: " + course);
        System.out.println("Gender: " + (isMale ? "Male" : "Female"));
        System.out.println();
    }


    public static void main(String[] args) {
        ATBstudent student1 = new ATBstudent();
        student1.mobNum = 987654321l;
        student1.address = "chennai";
        student1.Name = "Raj";
        student1.course = "Automation";
        student1.isMale = true;

        ATBstudent student2 = new ATBstudent();
        student2.mobNum = 8877766777l;
        student2.address = "Hyderabad";
        student2.Name = "sri";
        student2.course = "Automation";
        student2.isMale = true;

        ATBstudent student3 = new ATBstudent();
        student3.mobNum = 8764561233l;
        student3.address = "maharshtra";
        student3.Name = "Sai";
        student3.course = "Manual";
        student3.isMale = true;


        ATBstudent student4 = new ATBstudent();
        student4.mobNum = 7766445571l;
        student4.address = "chennai";
        student4.Name = "Sumitra";
        student4.course = "Automation";
        student4.isMale = false;

        ATBstudent student5 = new ATBstudent();
        student5.mobNum = 876594321l;
        student5.address = "Delhi";
        student5.Name = "Rajesh";
        student5.course = "Automation";
        student5.isMale = true;

        student1.displaydetails();
        student2.displaydetails();
        student3.displaydetails();
        student4.displaydetails();
        student5.displaydetails();

    }
}