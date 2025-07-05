package Week3_Execrise_1_SpringCoreAndMaven.library.repository;

public class BookRepository {
    public void saveBook(String bookName) {
        System.out.println("Book '" + bookName + "' saved to the repository.");
    }
}
