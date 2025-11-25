import java.util.*;

public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double get_circumference() {
        return 2 * radius * Math.PI;
    }

    double get_area() {
        return Math.PI * Math.pow(2, radius);
    }

    @Override
    public String toString() {
        return "Circle info: " + radius + " circuumference is " + get_circumference() + " area of circle is "
                + get_area();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        Circle c = new Circle(r);
        System.out.println(c);

        sc.close();

    }
}
