package library;

import static library.Genre.*;
import static library.Utils.*;

public class Main {
    public static void main(String[] args) {

        Library myLibrary = new Library();
//       books
        Book book1 = new Book("1984", "George Orwell", CLASSIC );
        Book book2 = new Book("Invisible Women", "Caroline Criado-Perez", SCIENCE);
        Book book3 = new Book("A Room of One's Own", "Virginia Woolf", CLASSIC);

//        add books
        myLibrary.add(book1);
        myLibrary.add(book2);
        myLibrary.add(book3);

//        display books
        System.out.println(myLibrary.getBookList());


//        remove books
        tryToRemove(myLibrary, book1);
        tryToRemove(myLibrary, book2);
        tryToRemove(myLibrary, book1);


        Customer customer1 = new Customer();

//        rent
        customer1.rentBook(myLibrary.getBookList(), myLibrary.getRentedBooks(), book1);
        System.out.println("Rented books: " + myLibrary.getRentedBooks());
        System.out.println("Available books" + myLibrary.getBookList());

//        return
        customer1.returnBook(myLibrary.getBookList(), myLibrary.getRentedBooks(), book1);
        System.out.println("Available books" + myLibrary.getBookList());
        System.out.println("Rented books: " + myLibrary.getRentedBooks());
    }

}
