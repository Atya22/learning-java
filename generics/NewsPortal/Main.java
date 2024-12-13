package NewsPortal;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("John", "Jey");

        News<String, String, Author> news = new News<>(
                "Technology",
                "AI Revolution",
                author,
                LocalDateTime.now()
        );
        news.displayNews();
    }

}
