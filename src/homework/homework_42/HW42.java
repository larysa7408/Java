package homework.homework_42;

import lesson.lesson_42.LibraryBook;
import lesson.lesson_42.LibraryBookRepository;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HW42 {
    public static void main(String[] args) {
        //Task1
        // Есть список целых чисел.
        // Отфильтруйте только чётные числа, собрав их в новом списке.
        List<Integer> numbers = List.of(4, 7, 5, 8, 2, 9, 1);
        List<Integer> result = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(result);

        //Task2
        // Список слов, буквы в словах могут быть в разных регистрах,
        // например: hEllO, JaVa, LAMBDA.
        // Преобразуйте букву регистра таким образом,
        // чтобы все буквы были записаны в регистре регистра и начиналось
        // с больших букв.
        // Пример: [hEllO, JaVa, LAMBDA]->[Hello, Java, Lambda]

        List<String> words = List.of("hEllO, JaVa, LAMBDA");
        System.out.println(words.stream()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase())
                .collect(Collectors.toList()));

        //Task3
        // Используйте список книг на занятиях.
        // Collection<LibraryBook>Изготовьте оригинальные книги для авторов.
        // А также предоставьте список всех издателей, выпустивших эти книги.

        LibraryBookRepository libraryBookRepository = new LibraryBookRepository();
        libraryBookRepository.init();
        Collection<LibraryBook> books = libraryBookRepository.values();
        Set<String> authors = books.stream().map(b -> b.getAuthor()).collect(Collectors.toSet());
        for (String author : authors) {
            System.out.println(author);
            System.out.println(books.stream()
                    .filter(b -> b.getAuthor().equals(author))
                    .map(b -> b.getBookTitle()).collect(Collectors.toList()));
        }
        System.out.println(books.stream().map(b -> b.getPublisher()).collect(Collectors.toSet()));
    }
}
