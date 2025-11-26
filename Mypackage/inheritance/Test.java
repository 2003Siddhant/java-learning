package Mypackage.inheritance;

public class Test {
    public static void main(String[] args) {
        Shape s = new Shape();
        TwoWheller t = new TwoWheller("TEsla", "elon musk");

        s.commute();
        t.commute();

        t.balance();
        t.details();

        Motor m = new Motor();
        m.commute();
        m.details();
    }
}
