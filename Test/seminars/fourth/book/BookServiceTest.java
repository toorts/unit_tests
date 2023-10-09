package seminars.fourth.book;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;



class BookServiceTest {

    @Test
    void findBookByIdTest() {
        // Arrange
        BookRepository mockBookRepository = mock(BookRepository.class);
        when(mockBookRepository.findById("3")).thenReturn(new Book("3", "Book3", "Author3"));
        BookService bookService = new BookService(mockBookRepository);

        // Act
        Book res = bookService.findBookById("3");

        // Assert
        assertEquals("Book3", res.getTitle());
        assertEquals("Author3", res.getAuthor());

    }


    @Test
    void findAllBooksTest() {
        // Arrange
        BookRepository mockBookRepository = mock(BookRepository.class);
        when(mockBookRepository.findAll()).thenReturn(List.of(new Book("4", "Book4", "Author4")));
        BookService bookService = new BookService(mockBookRepository);

        // Act
        List<Book> res = bookService.findAllBooks();

        // Assert
        assertEquals(1, res.size());
        assertEquals("Book4", res.get(0).getTitle());
        assertEquals("Author4", res.get(0).getAuthor());
    }

}