import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

// ARRANGE
// ASSERT
// ACT
// choose between assertEquals, assertTrue, assertFalse as i think they're relevant ones I could use for this
public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    private Book book4;

    private Book book5;

    @Before
    public void setUp() {
        library = new Library(4);
        book1 = new Book("The Third Policeman", "Flann O'Brien", "eccentric humour");
        book2 = new Book("In Cold Blood", "Truman Capote", "thriller");
        book3 = new Book("A Brave New World", "Aldous Huxley", "sci-fi");
        book4 = new Book("The Time Machine", "H.G. Wells", "sci-fi");
        book5 = new Book("1984: Dystopian Society", "George Orwell", "dystopian sci-fi");

    }

    // test for AddBookToLibrary()
    @Test
    public void testAddBookToLibrary() {
        library.addBookToLibrary(book1);

        assertEquals(1, library.getLibraryBookCount());
        assertTrue(library.isBookInStock(book1));
    }

    // test for getLibraryBookCount()
    @Test
    public void testGetLibraryBookCount() {
        assertEquals(0, library.getLibraryBookCount());
        // library starts with 0
        library.addBookToLibrary(book1);
        assertEquals(1, library.getLibraryBookCount());
        // when one book is added changes to 1
    }

    // test for if checkIfLibraryStockIsFull)
    @Test
    public void testCheckIfLibraryStockIsFull() {
        Library library = new Library(5);

        // add books to fill the library so it's more than 5, over what's allowed
        library.addBookToLibrary(book1);
        library.addBookToLibrary(book2);
        library.addBookToLibrary(book3);
        library.addBookToLibrary(book4);
        library.addBookToLibrary(book5);
        library.addBookToLibrary(book1);

        // book added
        boolean result = library.isLibraryStockFull();


        assertTrue("sorry, library stock is full so no more books can be added", result);
    }
}
