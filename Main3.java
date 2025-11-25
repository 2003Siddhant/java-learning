import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        System.out.println(" diff is " + (a + b) + " the product is " + (a * b) + " the division is " + (a / b)
                + " the modulo is " + (a % b));

        System.out.println("the perimeter of rectangle is " + (a + b + c + d));

        int base = sc.nextInt(), height = sc.nextInt();
        System.out.println("area of triangle is " + (base * height) / 2);

        int principal = sc.nextInt(), time = sc.nextInt(), interest = sc.nextInt();
        System.out.println("simple interest is " + (principal * time * interest) / 100);

        System.out.println("compound interest is " + (principal * (1 + interest / 100)) * time);

        sc.close();
    }
}
