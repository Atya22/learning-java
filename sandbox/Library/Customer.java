package library;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.HashMap;

public class Customer {
    public Customer() {
    }

    public void rentBook(ArrayList<Book> l, HashMap<Book, LocalDate> m, Book b){
        LocalDate rentDate = LocalDate.now();
        m.put(b,rentDate);
        l.remove(b);
        System.out.println("The book: " + b.getName() + " " + b.getAuthor() +
                " is successful rented. Rent date: " +  rentDate);
    }

    public void returnBook(ArrayList<Book> l, HashMap<Book, LocalDate> m, Book b){
        LocalDate returnDate = LocalDate.now();
        l.add(b);
        m.remove(b);
        System.out.println("The book: " + b.getName() + " " + b.getAuthor() +
                " is returned. Return date: " +  returnDate);
    }

    @Override
    public String toString() {
        return "Customer{}";
    }
}
