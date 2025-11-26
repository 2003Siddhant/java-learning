package Mypackage.Practice;

public class Personrun {
    public static void main(String[] args) {
        Person p = new Person("Roman", 30, 42, 89);
        System.out.println("the details of the person are : " + p);

        p.setname("siddhant");
        p.getname();
        p.setage(25);
        p.getage();
        p.setrollno(50);
        p.getrollno();
        p.setgrade(89);
        p.getgrade();

    }
}
