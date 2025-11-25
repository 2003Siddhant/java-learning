package Mypackage.gettersetter;

public class Carrun {
    public static void main(String[] args) {
        Car c = new Car("tesla", "S-class", 15.4, 100000);
        System.out.println(c);

        c.getCost();
        c.getBrand();
        c.getCurrFuel();
    }

}
