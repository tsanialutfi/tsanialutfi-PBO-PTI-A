import java.util.ArrayList;

class Book {
    private String category;
    private String title;
    private String author;

    public Book(String title, String author) {
        this.category = category;
        this.title = title;
        this.author = author;
    }   
    
    public String getCategory(){
        return category;
     }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}