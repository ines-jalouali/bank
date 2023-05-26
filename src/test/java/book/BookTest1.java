package book;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class BookTest1 {


    @SuppressWarnings("deprecation")
	private static Stream<Book> books() {
        return Stream.of(
            new Book("The Catcher in the Rye", "J.D. Salinger", new Date(1951, 6, 16)),
            new Book("To Kill a Mockingbird", "Harper Lee", new Date(1960, 6, 11)),
            new Book("1984", "George Orwell", new Date(1949, 6, 8))
        );
    }

    @ParameterizedTest
    @MethodSource("books")
    void getTitle_ShouldReturnBookTitle(Book book) {
        String expected = book.getTitle();
        String actual = book.getTitle();
        assertEquals(expected, actual);
    }
}
