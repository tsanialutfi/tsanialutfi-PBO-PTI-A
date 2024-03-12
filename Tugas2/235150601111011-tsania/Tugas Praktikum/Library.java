import java.util.ArrayList;
import java.util.List;

class Library {
    private List<BookCategory> categories;

    public Library() {
        categories = new ArrayList<>();
        initializeBookCategories();
    }

    public BookCategory getBookCategoryByName(String name) {
        for (BookCategory category : categories) {
            if (category.getName().equalsIgnoreCase(name)) {
                return category;
            }
        }
        return null;
    }

    private void initializeBookCategories() {
        String[] categories = {"Teknologi", "Filosofi", "Fiksi", "Sejarah", "Agama", "Psikologi", "Politik"};
        for (String category : categories) {
            BookCategory bookCategory = new BookCategory(category);
            for (int i = 0; i < 5; i++) {
                String Category = "Kategori " + (i + 1);
                String title = "Buku " + (i + 1);
                String author = "Penulis " + (i + 1);
            }
                
                Book book1 = new Book("Teknologi", "Perkembangan Teknologi", "Asti");
                bookCategory.addBook(book1);
                Book book2 = new Book("Filosofi", "Apa itu Filosofi", "Dewi");
                bookCategory.addBook(book2);
                Book book3 = new Book("Fiksi", "Timun Mas", "Andika");
                bookCategory.addBook(book3);
                Book book4 = new Book("Sejarah", "Sejarah Peradaban", "Diandra");
                bookCategory.addBook(book4);
                Book book5 = new Book("Agama", "Agama Islam", "Ali");
                bookCategory.addBook(book5);
                this.categories.add(bookCategory);
                
        }
    }

    public void displayBooks() {
        for (BookCategory category : categories) {
            System.out.println("Kategori: " + category.getName());
            for (Book book : category.getBooks()) {
                System.out.println("Judul: " + book.getTitle());
                System.out.println("Penulis: " + book.getAuthor());
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        System.out.println("Daftar Buku : ");
        library.displayBooks();
    }
}