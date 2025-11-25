public class Book {
    String title;
    String author;
    int isbn;

    static int totbooks;

    Book(String title, String author, int isbn) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    public void borrow(int a) {
        System.out.println("you have borrowed " + a + " books");
        totbooks -= a;
        System.out.println("heello");
    }

    public void return_book(int a) {
        // System.out.println("hey please return the book that you have borrowed ");
        if (a > totbooks)
            System.out.println("not enough books are available");
        totbooks += a;
        System.out.println("you have returned " + a + " books");
    }

    public void total() {
        System.out.println("total books are " + totbooks);
    }

    public static void main(String[] args) {
        Book b = new Book("hamlet", "shakespear", 1);

        totbooks = 10;
        b.borrow(5);
        b.total();
        b.return_book(3);
        b.total();
        b.return_book(2);
        b.total();
    }
}
