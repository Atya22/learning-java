package library;

public class Book {
    private String name;
    private String author;
    private Genre genre;

    public Book(String name, String author, Genre genre) {
        this.name = name;
        this.author = author;
        this.genre = genre;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book: " +
                "name = '" + name + '\'' +
                ", author = '" + author + '\'' +
                ", genre = " + genre;
    }
}
