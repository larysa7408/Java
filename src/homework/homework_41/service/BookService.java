package homework.homework_41.service;

import homework.homework_41.model.Book;
import homework.homework_41.repository.BookRepository;

public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void add(String name) {
        Book book = new Book(name);
        bookRepository.save(book);
    }

    public void update(int id, String name) {
        Book book = bookRepository.findById(id);
        if (book != null) {
            book.setName(name);
            bookRepository.save(book);
        }
    }

    public boolean delete(int id) {
        return bookRepository.delete(id);
    }

    public void print() {
        bookRepository.findAll().forEach(System.out::println);
    }
}
