package NewsPortal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class News<C, N, A> { // C: Category, N: Name, A: Author
    private C category;
    private N name;
    private A author;
    private LocalDateTime date;

    public News(C category, N name, A author, LocalDateTime date) {
        this.category = category;
        this.name = name;
        this.author = author;
        this.date = date;
    }

    public void displayNews() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedDate = date.format(formatter);

        System.out.println("Category: " + category);
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Date: " + formattedDate);
    }
}
