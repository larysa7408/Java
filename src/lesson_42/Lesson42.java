package lesson_42;

import javax.swing.text.html.HTMLDocument;
import java.util.Collection;
import java.util.Iterator;

public class Lesson42 {
    public static void main(String[] args) {
        LibraryBookRepository repository = new LibraryBookRepository();
        repository.init();
        Collection<LibraryBook> books = repository.values();
        books.forEach(System.out::println);

        //classic
        long count = 0;
        Iterator<LibraryBook> iterator = books.iterator();
        while (iterator.hasNext()) {
            LibraryBook book = iterator.next();
            if (book.getGenre().equals("Poetry")) {
                count++;
            }
        }

//        for (LibraryBook book : books) {
//            if (book.getGenre().equals("Poetry")) {
//                System.out.println(book);
//            }
//        }
        System.out.println(count);

        //using stream
        count = books.stream()
                .filter(book -> book.getGenre().equals("Poetry"))// лямбда выражения
                .count();
        System.out.println(count);
    }
}

