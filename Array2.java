import java.util.*;

public class Array2 {
    public static void main(String[] args) {
        System.out.println("hello");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        avg(arr);
        sc.close();
    }

    public static void avg(int[] arr) {
        int n = arr.length;

        int sum = 0;
        for (int a : arr)
            sum += a;

        double avg = sum / n;

        System.out.println("the sum is " + sum + " and the avg is " + avg);
    }

    public static void occurence(int[] arr, int x) {

        int cnt = 0;
        for (int a : arr) {
            if (a == x)
                cnt++;
        }

        System.out.println(x + " has occured times: " + cnt);
    }

    public static void mini_maxi(int[] arr) {
        Arrays.sort(arr);

        int mini = arr[0], maxi = arr.length - 1;

        System.out.println("minimum value is " + mini + " and the maximum value is " + maxi);
    }

    public static boolean check(int[] arr) {
        int n = arr.length;

        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[i + 1])
                flag = true;
        }

        return flag;
    }

    public static void reverse(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        System.out.println("reversed arr is " + Arrays.toString(arr));
    }

    public static boolean palindrome(int[] arr) {

        int l = 0, r = arr.length - 1;
        while (l <= r) {
            if (arr[l] != arr[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}