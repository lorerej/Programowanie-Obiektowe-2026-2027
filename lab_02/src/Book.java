public class Book {
    String title;
    String author;
    int publicationYear;

    public Book() {
        this("unknown", "unknown", 0000);
    }

    public Book(String title, String author) {
        this(title, author, 0000);
    }

    public Book(String title, String author, int publicationYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
    }
}
