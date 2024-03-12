import java.util.ArrayList;

class Book {
    private String category;
    private String title;
    private String author;

    public Book(String category, String title, String author) {
        this.category = category;
        this.title = title;
        this.author = author;
    }   

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}