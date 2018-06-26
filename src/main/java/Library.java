import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private Integer capacity;

    public Library(Integer capacity) {
        this.collection = new ArrayList<>();
        this.capacity = capacity;
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
}

