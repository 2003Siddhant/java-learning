package Mypackage.challenge;

public class Library {
    public int itemid;
    public String title;
    public String author;

    public int returnitem() {
        return itemid;
    }

    public void checkout() {

    }

    @Override
    public String toString() {
        return "Library{" +
                "itemid='" + itemid + '\'' +
                ", title='" + title + '\'' +
                ", author=" + author +
                '}';
    }
}
