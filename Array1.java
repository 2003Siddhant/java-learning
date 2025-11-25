import java.util.*;

public class Array1 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++)
            numbers[i] = i;

        // using for each loop
        // for (int num : numbers)
        // System.out.println(num);

        int sum = 0;
        for (int a : numbers) {
            sum += a;
        }
        System.out.println(sum);

        // taking input in array
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        int s2 = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            s2 += arr[i];
        }

        for (int a : arr)
            System.out.println(a);
        System.out.println("the sum is " + s2);
        sc.close();
    }

    public static boolean isfound(int[] arr, int a) {

        for (int b : arr) {
            if (b == a) {
                return true;
            }
        }
        return false;
    }
}
