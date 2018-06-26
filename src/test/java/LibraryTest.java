import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void setUp() {
        library = new Library(2);
    }

    @Test
    public void collectionStartsAsEmpty() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void addBookToCollection(){
       library.addBook(book);
       assertEquals(1, library.bookCount());
    }

    @Test
    public void checkCapacityFull(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void canRemoveBook() {
        library.addBook(book);
        library.removeBook();
        assertEquals(0, library.bookCount());
    }

}



