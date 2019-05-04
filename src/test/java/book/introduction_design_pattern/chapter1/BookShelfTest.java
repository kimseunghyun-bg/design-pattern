package book.introduction_design_pattern.chapter1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BookShelfTest {
    private BookShelf bookShelf;

    @Before
    public void setUp() {
        bookShelf = new BookShelf();
    }

    @After
    public void tearDown() {
        bookShelf = null;
    }

    @Test
    public void bookShelf() {
        // given
        int expectedLength = 0;
        // when
        bookShelf = new BookShelf();
        int actualLength = bookShelf.getLength();
        // then
        assertThat(actualLength, is(expectedLength));
    }

    @Test
    public void getBookAt() {
        // given
        Book expected = Mockito.mock(Book.class);
        bookShelf.appendBook(Mockito.mock(Book.class));
        bookShelf.appendBook(expected);
        bookShelf.appendBook(Mockito.mock(Book.class));
        // when
        Book actual = bookShelf.getBookAt(1);
        // then
        assertThat(actual, is(expected));
    }

    @Test
    public void appendBook() {
        // given
        Book expectedBook = Mockito.mock(Book.class);
        int expectedLength = 1;
        // when
        bookShelf.appendBook(expectedBook);
        Book actualBook = bookShelf.getBookAt(0);
        int actualLength = bookShelf.getLength();
        // then
        assertThat(actualBook, is(expectedBook));
        assertThat(actualLength, is(expectedLength));
    }

    @Test
    public void getLength() {
        // given
        int expected = 2;
        bookShelf.appendBook(Mockito.mock(Book.class));
        bookShelf.appendBook(Mockito.mock(Book.class));
        // when
        int actual = bookShelf.getLength();
        // then
        assertThat(actual, is(expected));
    }

    @Test
    public void iterator() {
        // given
        // when
        Iterator actual = bookShelf.iterator();
        // then
        assertThat(actual, instanceOf(BookShelfIterator.class));
    }
}