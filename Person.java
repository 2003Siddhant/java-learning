public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println("Hello my name is " + this.name + " and my age is " + this.age);
    }

    public void skills(String[] arr) {
        System.out.println(this.name + " skills are");
        for (String a : arr)
            System.out.println(a);
    }

    public static void main(String[] args) {
        Person o1 = new Person("siddhant", 22);

        o1.print();

        String a[] = { "java", "cpp", "rust", "golang" };

        o1.skills(a);
    }
}
