import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;

    @Before
    public void setUp() {
        borrower = new Borrower();
    }

    @Test
    public void privateCollectionStartsEmpty() {
        assertEquals(0, borrower.borrowersBookCount());
    }
}
