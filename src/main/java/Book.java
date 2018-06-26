public class Book {

    private String title;
    private GenreType genre;

    public Book(String title, GenreType genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return this.title;
    }

    public GenreType getGenre() {
        return genre;
    }
}
