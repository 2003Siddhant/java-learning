import java.util.Scanner;

public class Person_practice {
    String name;
    int age;

    Person_practice(String n, int a) {
        this.name = n;
        this.age = a;
    }

    void print() {
        System.out.println("name of the person is " + name + " and his age is " + age);
    }

    void skills(String[] arr) {
        System.out.println(name + " skills are: ");
        for (String it : arr)
            System.out.println("-> " + it);
    }

    public static void main(String[] args) {
        Person_practice p = new Person_practice("roman", 23);
        p.print();

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();

        String[] skill = new String[a];
        for (int i = 0; i < a; i++)
            skill[i] = sc.nextLine();

        p.skills(skill);

        sc.close();
    }
}
