package Mypackage.Practice;

public class Person {
    private String name;
    private int age;
    private int roll_no;
    private double grade;

    public Person(String name, int age, int roll_no, double grade) {
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;
        this.grade = grade;
    }

    public void getname() {
        System.out.println("your new name is " + name);
    }

    public void getrollno() {
        System.out.println("your new rollno is " + roll_no);
    }

    public void getage() {
        System.out.println("your new age is " + age);
    }

    public void getgrade() {
        System.out.println("your new grade is " + grade);
    }

    // setter methods
    public void setname(String name) {
        this.name = name;
    }

    public void setage(int age) {
        if (age <= 0)
            System.out.println("invalid age");
        else
            this.age = age;
    }

    public void setrollno(int roll_no) {
        if (roll_no < 0 && roll_no > 100)
            System.out.println("invalid rollno");
        this.roll_no = roll_no;
    }

    public void setgrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", rollno=" + roll_no +
                ", grade=" + grade +
                '}';
    }
}
