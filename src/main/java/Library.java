import com.sun.tools.javac.jvm.Gen;

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
        addBookToHashMap(book);
    }

    public Book removeBook() {
        return this.collection.remove(0);
    }

    public int genreTotalCount() {
        return genreTotals.size();
    }

    public void addBookToHashMap(Book book) {
        GenreType bookGenre = book.getGenre();
        this.genreTotals.put(bookGenre, 1);
    }


    public HashMap<GenreType, Integer> numberOfBooksByGenre() {
        HashMap<GenreType, Integer> genreTotals = new HashMap<>();
        for ( Book book : this.collection){
            if (genreTotals.containsKey(book.getGenre())) {
                Integer total = genreTotals.get(book.getGenre());
                total += 1;
                genreTotals.put(book.getGenre(), total);
            } else {
                genreTotals.put(book.getGenre(), 1);
            }
        }
        return genreTotals;
    }


}

