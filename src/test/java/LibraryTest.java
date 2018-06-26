import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;

    @Before
    public void setUp() {
        library = new Library();
    }

    @Test
    public void collectionStartsAsEmpty() {
        assertEquals(0, library.bookCount());
    }
}


