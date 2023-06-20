import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;
    Library library;

    @Before
    public void setUp() {
        book = new Book("The Third Policeman", "Flann O'Brien", "Eccentric");
        library = new Library(10);
    }








