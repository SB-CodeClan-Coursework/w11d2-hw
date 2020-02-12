import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookshelf;
    private int capacity;

    public Library(){
        this.bookshelf = new ArrayList<Book>();
        this.capacity = 4;
    }

    public int bookCount() {
        return bookshelf.size();
    }

    public void addBook(Book book) {
        if (bookshelf.size() < this.capacity)
        {bookshelf.add(book);}
    }
}
