package Mypackage.inheritance;

public class Test {
    public static void main(String[] args) {
        Shape s = new Shape();
        TwoWheller t = new TwoWheller("TEsla", "elon musk");

        System.out.println(s.hashCode());
        System.out.println(s.toString());
        System.out.println(s.getClass());

        s.commute();
        t.commute();

        t.balance();
        t.details();

        Motor m = new Motor();
        m.commute();
        m.details();
    }
}
