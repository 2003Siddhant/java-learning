public class String3 {
    String name;
    int age;

    String3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        String3 s = new String3("roman", 20);

        System.out.println(s.toString());
    }
}
