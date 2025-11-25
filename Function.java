import java.util.*;

// if we use static keyword  then we can directly ccall the function .
// if we dont use it then we need to make an object of that class and then call it.
public class Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int f = sc.nextInt();
        sc.nextLine();
        String x = sc.nextLine();

        boolean p = isPrime(a);
        if (p == true)
            System.out.println(a + " is a prime");
        else
            System.out.println(a + " is not prime");

        String c = reverse(s);
        System.out.println("after reversing string becomes " + c);

        System.out.println("factorial of this number is " + factorial(f));

        boolean t = palindrome(x);

        if (t == true)
            System.out.println(x + " is a palindrome");
        else
            System.out.println(x + " is not a palindrome");

        sc.close();
    }

    public static boolean isPrime(int a) {
        for (int i = 2; i < a; i++) {
            if ((a % i) == 0)
                return false;
        }
        return true;
    }

    public static String reverse(String s) {

        // strings are immutable in java so we cant change there characters
        // so we first convert them into array of characters and then do swapping and
        // then convert back them to string
        char[] arr = s.toCharArray();
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return new String(arr);
    }

    public static int factorial(int n) {
        int ans = 1;
        while (n > 0) {
            ans = ans * n;
            n--;
        }
        return ans;
    }

    public static boolean palindrome(String s) {
        char arr[] = s.toCharArray();

        int l = 0, r = arr.length - 1;
        while (l <= r) {
            if (arr[l] == arr[r]) {
                l++;
                r--;
            } else
                return false;
        }
        return true;
    }

    public static int oddsum(int a) {
        int sum = 0;
        if (a % 2 == 0)
            a--;
        while (a > 0) {
            if ((a % 2) == 1)
                sum += a;
            a -= 2;
        }
        return sum;
    }

    public static int sum_digit(int a) {
        int sum = 0;

        while (a > 0) {
            int rem = a % 10;
            sum += rem;
            a /= 10;
        }
        return sum;
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

}
