public class Car {
    int no_of_wheels;
    float maxspeed;
    float currentfuel;
    int no_of_seats;

    public void drive() {
        System.out.println("car is driving");
    }

    public void add_fuel(float f) {
        currentfuel += f;
    }

    public void get_curr_fuel() {
        System.out.println("your current fuel is " + currentfuel);
    }

    public static void main(String[] args) {
        Car car = new Car();

        car.no_of_seats = 4;
        car.maxspeed = 60.5f;
        car.currentfuel = 20.4f;
        car.no_of_wheels = 10;

        car.drive();
        car.get_curr_fuel();
        car.add_fuel(5.6f);
        System.out.println("after adding new fuel");
        car.get_curr_fuel();
        car.drive();
    }
}
