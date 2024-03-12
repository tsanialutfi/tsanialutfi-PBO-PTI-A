import java.util.ArrayList;
import java.util.List;

class BookCategory {
    private String name;
    private String bookCategory;
    private List<Book> books;

    public BookCategory(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }
}