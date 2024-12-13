package NewsPortal;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("John", "Jey");

        Category category = new Category("Technology");

        News<Category, String, Author> news = new News<>(
                category,
                "AI Revolution",
                author,
                LocalDateTime.now()
        );
        news.displayNews();
    }

}
