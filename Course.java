public class Course {
    String name;
    int duration;

    Course() {
        this("unknown", 0);
    }

    Course(String name) {
        this(name, 123);
    }

    Course(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public void print() {
        System.out.println("course is " + this.name + " ( " + this.duration + " months");
    }

    public static void main(String[] args) {
        Course c1 = new Course("Golang", 10);
        Course c2 = new Course("Golang");
        Course c3 = new Course();

        c1.print();
        c2.print();
        c3.print();
    }
}
