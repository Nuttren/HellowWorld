import java.util.Objects;

public class Book {
    private String bookName;
    private int bookAge;

   private Author author;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookAge == book.bookAge && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, bookAge, author);
    }

    public Book (String bookName, Author author, int bookAge) {
        this.bookName = bookName;
        this.author = author;
        this.bookAge = bookAge;
    }

    public String getBookName () {
        return this.bookName;
    }

    public int getBookAge () {
        return this.bookAge;
    }


    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookAge(int bookAge) {
        this.bookAge = bookAge;
    }

    @Override
    public String toString () {
        return "Название книги: " + bookName + ", " + author + "" + ", год выпуска книги: " + bookAge;
    }
}
