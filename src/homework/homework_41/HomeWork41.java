package homework.homework_41;

import homework.homework_41.controller.BookController;
import homework.homework_41.repository.BookRepository;
import homework.homework_41.service.BookService;

public class HomeWork41 {
    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepository();
        BookService bookService = new BookService(bookRepository);
        BookController bookController=new BookController(bookService);
        bookController.run();

    }
}
