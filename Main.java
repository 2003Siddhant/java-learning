import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // String s = "siddhant";

        // for (int i = 0; i < 5; i++) {
        // System.out.println(s);
        // }

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        System.out.println("welvcme to " + name + " kg coding");

        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("sum of 2 numbers are " + (a + b));

        sc.close();

    }
}