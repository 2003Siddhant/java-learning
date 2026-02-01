package Mypackage.Access_practice;

public class Car1 {
    public String color;
    public String model;
    private int fuellevel;
    private int CostofPurchase;

    Car1(String b, String m, int f, int c) {
        this.color = b;
        this.model = m;
        this.fuellevel = f;
        this.CostofPurchase = c;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{Car");
        sb.append("color='").append(color).append('\'');
        sb.append(",model='").append(model).append('\'');
        sb.append(",fuellevel='").append(fuellevel).append('\'');
        sb.append(",CostofPurchase='").append(CostofPurchase).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
