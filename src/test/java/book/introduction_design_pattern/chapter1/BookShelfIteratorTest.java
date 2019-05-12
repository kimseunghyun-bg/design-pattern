package book.introduction_design_pattern.chapter1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BookShelfIteratorTest {
    private BookShelf bookShelf;
    private Iterator bookShelfIterator;

    @Before
    public void setUp() {
        bookShelf = new BookShelf(10);

        bookShelfIterator = new BookShelfIterator(bookShelf);
    }

    @After
    public void tearDown() {
        bookShelfIterator = null;
    }

    @Test
    public void bookShelfIteratorTest() {
        // given
        // when
        Iterator actualIterator = new BookShelf(10).iterator();
        // then
        assertThat(actualIterator, instanceOf(BookShelfIterator.class));
    }

    @Test
    public void hasNext() {
        // given
        bookShelf.appendBook(Mockito.mock(Book.class));
        // when
        boolean actual = bookShelfIterator.hasNext();
        // then
        assertThat(actual, is(true));
    }

    @Test
    public void next() {
        // given
        Book expected = Mockito.mock(Book.class);
        bookShelf.appendBook(expected);
        // when
        Book actual = (Book) bookShelfIterator.next();
        // then
        assertThat(actual, is(expected));
    }
}