import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;
    Library library;


    @Before
    public void setUp() {
        book = new Book("The Third Policeman", "Flann O'Brien", "eccentric humour");
        library = new Library(10);
    }

    @Test
    public void checkGetBookTitle() {
        assertEquals("The Third Policeman", book.getBookTitle());
    }

    @Test
    public void checkGetBookAuthor() {
        // Assert
        assertEquals("Flann O'Brien", book.getBookAuthor());
    }

    @Test
    public void checkGetBookGenre() {
        // Assert
        assertEquals("Flann O'Brien", book.getBookGenre());
    }




}








