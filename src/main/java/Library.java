import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private int libraryBookCapacity;

    public Library(int libraryBookCapacity) {
        this.books = new ArrayList<>();
        this.libraryBookCapacity = libraryBookCapacity;
    }

    public int getLibraryBookCount() {
        return books.size();
    }

    public void addBookToLibrary(Book book) {
        if (isLibraryStockFull()) {
            System.out.println("sorry, the library book stock is full so you're not able to add any more books");
            return;
        }

        books.add(book);
        System.out.println("yay, the following book has been added to your library catalogue: " + book.getBookTitle());
    }


    public boolean isBookInStock(Book book) {
        return books.contains(book);
    }

    public boolean isLibraryStockFull() {
        return books.size() >= libraryBookCapacity;
    }
}
