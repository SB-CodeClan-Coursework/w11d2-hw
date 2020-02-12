import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book;
    private Library library;

    @Before
    public void before() {
         book = new Book("Java: A New Begining",
                 "France McToffington",
                 "Horror");
         library = new Library();
    }

    @Test
    public void bookshelfStartsEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void addBookToBookshelf(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cannotAddBookIfBookShelfIsFull(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(4, library.bookCount());
    }



}
