package Week3_Execrise_2_SpringCoreAndMaven.library.service;

public class BookService {
    private BookRepository bookRepository;

    // Setter for Dependency Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String bookName) {
        System.out.println("BookService:- Adding book - " + bookName);
        bookRepository.saveBook(bookName);
    }
}
