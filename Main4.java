import java.util.*;;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        // if (a > b) {
        // if (a > c)
        // System.out.println(a + " is bigger");
        // else
        // System.out.println(c + " is bigger");
        // } else {
        // if (b > c)
        // System.out.println(b + " is bigger");
        // else
        // System.out.println(c + " is bigger");
        // }

        int n = sc.nextInt();

        while (n > 0) {
            if (n % 2 == 0) {
                System.out.println("siddhant");
            } else
                System.out.println("--|-|-|--");
            n--;
        }
        sc.close();
    }
}
