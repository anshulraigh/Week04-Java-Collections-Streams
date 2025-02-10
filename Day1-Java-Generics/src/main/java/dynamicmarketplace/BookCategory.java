package dynamicmarketplace;

public class BookCategory {
    private String genre;

    public BookCategory(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "BookCategory{genre='" + genre + "'}";
    }
}
