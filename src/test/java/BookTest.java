import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void setUp() {
        book = new Book("Look To Windward", GenreType.SCIFI);
    }

    @Test
    public void hasTitle() {
        assertEquals("Look To Windward", book.getTitle());
    }

    @Test
    public void hasGenre(){
        assertEquals(GenreType.SCIFI,book.getGenre());
    }
}
