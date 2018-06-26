import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void setUp() {
        book = new Book("Look To Windward");
    }

    @Test
    public void hasTitle() {
        assertEquals("Look To Windward", book.getTitle());
    }
}
