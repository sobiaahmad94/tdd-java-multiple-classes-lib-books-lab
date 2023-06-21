public class Book {
    private String title;
    private String author;
    private String genre;

    public Book(String titleParam, String authorParam, String genreParam) {
        this.title = titleParam;
        this.author = authorParam;
        this.genre = genreParam;
    }

    // getBookTitle func
    public String getBookTitle() {
        return title;
    }

    // getBookAuthor func
    public String getBookAuthor() {
        return author;
    }

    // getBookGenre func
    public String getBookGenre() {
        return genre;
    }

}
