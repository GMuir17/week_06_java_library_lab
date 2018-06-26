import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> collection;
    private Integer capacity;
    private HashMap genreTotals;

    public Library(Integer capacity) {
        this.collection = new ArrayList<>();
        this.capacity = capacity;
        this.genreTotals = new HashMap<GenreType, Integer>();
    }

    public int bookCount() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        if (bookCount() < this.capacity)
        this.collection.add(book);
    }

    public Book removeBook() {
        return this.collection.remove(0);
    }

    public int genreTotalCount() {
        return genreTotals.size();
    }
}

