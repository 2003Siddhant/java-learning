public class Main5 {
    public boolean check(int a) {
        if (a % 2 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Main5 m = new Main5();
        // boolean a = m.check(2384);

        // if (a == true)
        // System.out.println("value is even");
        // else
        // System.out.println("value is odd");

        for (int i = 0; i < 5; i++) {
            m.print();
        }
    }

    public void print() {
        System.out.println("hello siddhant");
    }

}
