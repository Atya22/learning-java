package library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Library {
   private ArrayList<Book> bookList = new ArrayList<>();
   private HashMap<Book, LocalDate> rentedBooks = new HashMap<Book, LocalDate>();

    public HashMap<Book, LocalDate> getRentedBooks() {
        return rentedBooks;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void add(Book b){
        bookList.add(b);
    }

    public void remove(Book b) throws BookNotFoundException{
        if (!bookList.contains(b)){
            throw new BookNotFoundException("Book not found: " + b.getName());
        }
        bookList.remove(b);
    }

    @Override
    public String toString() {
        return "library.Library{" +
                "bookList=" + bookList +
                '}';
    }
}
