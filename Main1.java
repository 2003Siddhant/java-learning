import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        String first = "john";
        String last = "harry";
        System.out.println("My first name is " + first + " and last name is " + last);

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int age = sc.nextInt();

        if (age >= 18) {
            if (age > 20 && age < 30) {
                System.out.println("your age is perfect to vote");
            } else
                System.out.println("youre also good to vote");
        } else
            System.out.println("you cant vote");

        sc.close();
    }
}
