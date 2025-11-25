public class Movie {
    String title;
    String[] actors;

    Movie(String title, String[] actors) {
        this.title = title;
        this.actors = actors;
    }

    void cast() {
        System.out.println("the movie is " + this.title + " with actors");

        for (String s : actors)
            System.out.println("- " + s);
    }

    public static void main(String[] args) {
        String[] a = { "john", "salman", "tom", "dwayne" };

        Movie m = new Movie("Jurassic", a);

        m.cast();
    }
}
