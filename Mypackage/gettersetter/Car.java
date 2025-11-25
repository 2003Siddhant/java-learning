package Mypackage.gettersetter;

public class Car {
    private String brand;
    private String model;
    private double currfuel;
    private long cost;

    public Car(String brand, String model, double fuel, long cost) {
        this.brand = brand;
        this.model = model;
        this.currfuel = fuel;
        this.cost = cost;
    }

    public void getCost() {
        System.out.println("the cost of car is " + this.cost);
    }

    public void getModelname() {
        System.out.println("modle name is " + this.model);
    }

    public void getBrand() {
        System.out.println("the brand name of car is " + this.brand);
    }

    public void getCurrFuel() {
        System.out.println("the current fuel of car is " + this.currfuel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", currfuel=" + currfuel +
                ", cost=" + cost +
                '}';
    }

}
