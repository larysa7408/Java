package homework.homework_41.repository;

import homework.homework_41.model.Book;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BookRepository {
    private final Map<Integer, Book> bookMap = new HashMap<>();

    public Book findById(int id){
        return bookMap.get(id);
    }

    public void save(Book book) {
        bookMap.put(book.getId(), book);
    }

//    public boolean update(int id, String name) {
//        Book updateBook = bookMap.get(id);
//        if (updateBook != null) {
//            updateBook.setName(name);
//            return true;
//        }
//        return false;
//    }

    public boolean delete(int id) {
        return bookMap.remove(id) != null;
    }

    public Collection<Book> findAll() {
        return bookMap.values();
    }
}
