import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> privateCollection;

    public Borrower() {
        this.privateCollection = new ArrayList<>();
    }

    public int borrowersBookCount() {
        return privateCollection.size();
    }

    public void takeBook(Library library) {
        Book borrowedBook = library.removeBook();
        this.privateCollection.add(borrowedBook);
    }
}
