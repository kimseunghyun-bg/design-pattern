package book.introduction_design_pattern.chapter1;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertThat;

public class BookTest {
    @Test
    public void getName() {
        // given
        String expected = "iterator";
        Book book = new Book("iterator");
        // when
        String actual = book.getName();
        // then
        assertThat(actual, is(expected));
    }
}