package book.introduction_design_pattern.chapter1;

public class BookShelf implements Aggregate {
    private final Book[] books;
    private int last = 0;

    BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    Book getBookAt(int index) {
        return books[index];
    }

    void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
