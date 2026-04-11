abstract class LibraryItem {
    protected String title;
    private int id;
    LibraryItem(String title, int id) {
        this.title = title;
        this.id = id;
    }
    public int getId() {
        return id;
    }
    abstract void displayDetails();
}
class Book extends LibraryItem {
    String author;
    Book(String title, int id, String author) {
        super(title, id);
        this.author = author;
    }
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("ID: " + getId());
        System.out.println("Author: " + author);
    }
}
public class Exp1 {
    public static void main(String[] args) {
        Book b = new Book("Java Basics", 101, "Nandhini");
        b.displayDetails();
    }
}