package book.introduction_design_pattern.chapter1;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate {
    private final List<Book> books;
    private int last = 0;

    BookShelf() {
        this.books = new ArrayList<>();
    }

    Book getBookAt(int index) {
        return books.get(index);
    }

    void appendBook(Book book) {
        this.books.add(book);
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
