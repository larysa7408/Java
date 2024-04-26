package lesson.lesson_42;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

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

        List<LibraryBook> list = books.stream()
                .filter(book -> book.getAuthor().equals("Ivan Franko"))// лямбда выражения
                .collect(Collectors.toList());
        list.forEach(System.out::println);

        List<String> list1 = books.stream()
                .filter(book -> book.getAuthor().equals("Ivan Franko"))
                .map(b ->b.getBookTitle())
                .collect(Collectors.toList());

        list.forEach(System.out::println);
    }
}

