package Mypackage.inheritance;

public class Motor extends TwoWheller {

    Motor() {
        no_of_tires = 5;
        brand = "BMW";
        owner = "Siddhant";
    }

    public void info() {
        System.out.println("it has multiple motor and owners");
    }
}
