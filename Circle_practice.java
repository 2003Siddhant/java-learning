import java.util.Scanner;

public class Circle_practice {
    double radius;

    Circle_practice(double r) {
        this.radius = r;
    }

    void circumference() {
        double c = 2 * 3.14 * radius;
        System.out.println("the circumference of circle is " + c);
    }

    void area() {
        double a = 3.14 * radius * radius;
        System.out.println("the area of this circle is " + a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();

        Circle_practice c = new Circle_practice(r);
        c.circumference();
        c.area();

        sc.close();
    }
}
