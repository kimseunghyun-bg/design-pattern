package book.introduction_design_pattern.chapter1;

public class BookShelfIterator implements Iterator {
    private final BookShelf bookShelf;
    private int index;

    BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Object next() {
        return bookShelf.getBookAt(index++);
    }
}
