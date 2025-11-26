package Mypackage.inheritance;

public class TwoWheller extends Shape {

    public String brand;
    public String owner;

    TwoWheller() {
        no_of_tires = 3;
    }

    TwoWheller(String brand, String owner) {
        this.brand = brand;
        this.owner = owner;
    }

    public void balance() {
        System.out.println("im out of the balance");
    }

    public void details() {
        System.out.println("name of the two wheller is " + brand + " and its owner is " + owner);
    }
}
