import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void setUp() {
        borrower = new Borrower();
        library = new Library(10);
        book = new Book("Consider Phlebas", GenreType.SCIFI);
    }

    @Test
    public void privateCollectionStartsEmpty() {
        assertEquals(0, borrower.borrowersBookCount());
    }

    @Test
    public void canRemoveBookFromLibraryAndAddToPrivateCollection() {
        library.addBook(book);
        borrower.takeBook(library);
        assertEquals(1, borrower.borrowersBookCount());
    }
}
