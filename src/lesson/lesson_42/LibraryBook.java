package lesson.lesson_42;

public class LibraryBook {
    private String author;
    private String bookTitle;
    private String genre;
    private String publisher;
    private Integer id;
    private boolean isInLibrary;
    private Integer borrowedTo;
    private static int idCounter;

    public LibraryBook(String author, String bookTitle, String genre, String publisher) {
        this.author = author;
        this.bookTitle = bookTitle;
        this.genre = genre;
        this.publisher = publisher;
        this.id = ++idCounter;
        this.isInLibrary = true;
        this.borrowedTo = -1;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public Integer getId() {
        return this.id;
    }

    public int getBorrowedTo()  {
        return borrowedTo;
    }

    public boolean isInLibrary() {
        return isInLibrary;
    }

    public void setInLibrary() {
        this.isInLibrary = true;
        this.borrowedTo = -1;
    }

    public void setNotInLibrary(int borrowedTo) {
        this.isInLibrary = false;
        this.borrowedTo = borrowedTo;
    }
    public Object getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + this.author + '\'' +
                ", bookTitle='" + this.bookTitle + '\'' +
                ", genre='" + this.genre + '\'' +
                ", publisher='" + this.publisher + '\'' +
                ", catalogNumber=" + this.id +
                ", isInLibrary=" + this.isInLibrary +
                '}';
    }


}
