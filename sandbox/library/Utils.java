package library;

public class Utils {
    public static void tryToRemove(Library library, Book book) {
        try {
            library.remove(book);
        } catch (BookNotFoundException e){
            System.out.println("Caught a CustomException: " + e.getMessage());
        }
    }
}
