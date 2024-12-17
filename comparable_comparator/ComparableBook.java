import Library.Genre;

public class ComparableBook implements Comparable <ComparableBook> {
    private String name;
    private String author;
    private String genre;

    public ComparableBook(String name, String author, String genre) {
        this.name = name;
        this.author = author;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "ComparableBook{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

    @Override
    public int compareTo(ComparableBook book) {
        return this.getAuthor().compareTo(book.getAuthor());
    }
}
