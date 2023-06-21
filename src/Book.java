import java.util.Comparator;

public class Book implements Comparable<Book> {

    @Override
    public int compareTo(Book o1) {
        return this.getBookName().compareTo(o1.getBookName());
    }

    private String bookName;
    private int pageBook;
    private String authorName;
    private int releaseDate;

    public Book(String bookName, int pageBook, String authorName, int releaseDate) {
        this.bookName = bookName;
        this.pageBook = pageBook;
        this.authorName = authorName;
        this.releaseDate = releaseDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageBook() {
        return pageBook;
    }

    public void setPageBook(int pageBook) {
        this.pageBook = pageBook;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
}
