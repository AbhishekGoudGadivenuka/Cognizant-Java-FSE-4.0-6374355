package Week3_Execrise_2_SpringCoreAndMaven.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class LibraryManagementApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    system.out.println("LibraryApp");
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.addBook("Clean Code");
    }
}
