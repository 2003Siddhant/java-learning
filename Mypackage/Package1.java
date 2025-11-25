package Mypackage;

public class Package1 {
    public String carname;
    public String model;
    public String brand;
    private double fuellevel;
    private long costofpurchase;

    public Package1(String model, String brand, String carname, double fuellevel, long costofpurchase) {
        this.brand = brand;
        this.model = model;
        this.carname = carname;
        this.fuellevel = fuellevel;
        this.costofpurchase = costofpurchase;
    }

    public void getFuel() {
        System.out.println("the fuel level of car is " + this.fuellevel);
    }

    public void getCost() {
        System.out.println("the cost of car is " + this.costofpurchase);
    }

    @Override
    public String toString() {
        return "Package1{carname='" + carname + "', model='" + model + "', brand='" + brand + "'}";
    }

}
