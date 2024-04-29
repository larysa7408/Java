package lesson.lesson_42;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        //Stream API - это поток данных который представляет с собой последовательность элементов
        // Этот поток предоставляет возможность поочередно получать элементы данных для обработки
        // Стримы чаще всего создаются на основе какой нибудь коллекции
        // инструмент позволяющий обрабатывать наборы данных в декларатированом стиле
        // (ДС)- это последовательный вызов каких нибудь методов
        // Основной идеей в стриме яв-ся преобразование последовательности каких нибудь элементов коллекций массивов
        // через набор операций

        // Промежуточные операции - кот каким то образом преобразуют один поток в другой поток
        //Например производят какую нибудь фильтрацию сортировку в другой поток
        // Может быть фильтрация данных изменение данных преобразование данных

        //Терминальные операции запускают обработку элемента потока
        //Сохранение результатов обработки данных

        //!!! Источник данных -> Stream(поток) -> Промежуточный метод  !их может быть несколько -> !!Только один Терминальный метод

        // У потока есть одна особедонность
        //Потоки не изменяют изначальные данные


        // Промежуточные методы
        /*
        filter (Predicate<T>) - отфильтровывает элементы соответствующие данному предикату
        sorted() сортирует элементы
        map(Function<T,R> mapper) преобразует элементы потока с использованием маппера
        peek(Consumer<T> action) выполняет действия ждя каждого элемента потока

        Терминальные методы
                        collect(Collector<T,A,R> collector);Преобразует поток в какую то структуру данных Например в коллекцию
        */
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();

    } // main

    private static void task6() {
        //получить список имен которые короче 5 символов

    }

    private static void task5() {
        //Получить список имен кошек чей вес больше 4
        List<Cat>cats=getListCats();

        //1 оставить кошек чей вес больше 4
        //2 Преобразовать кошек в имена
        //3 Собрать поток в список

        List<String>catNames=cats
                .stream()
                .filter(cat -> cat.getWeight()>4)
                //.map(cat -> cat.getName())
                .map(Cat::getName)
                .collect(Collectors.toList());
        System.out.println(catNames);
    }

    private static void task4() {
        //получить список имен всех кошек
        List<Cat> cats = getListCats();

        Stream<String> stringStream = cats
                .stream()
                .map(cat -> cat.getName());

        List<String> catNames = cats
                .stream() // создаем поток
                .map(Cat::getName) // преобразуем Stream<Cat> -> Stream<String>
                .collect(Collectors.toList()); //собираем в список

        System.out.println(catNames);

    }

    private static void task3() {
        List<Cat> cats = getListCats();
        //фильтрация по длине имени
        //Список котов чье имя длинее 4 х символов

        Stream<Cat> catStream = cats
                .stream()
                .filter(cat -> cat.getName().length() > 4);

        // Пока не запущен терминальный метод промежуточные методы не выполняются
        //Lazy Evaluation
        List<Cat> catList = catStream.collect(Collectors.toList());

        System.out.println("End task3 method");
    }

    private static void task2() {
        List<Cat> cats = getListCats();
        //получить список кошек больше 4х кг
        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        List<Cat> fatCats = catStream.collect(Collectors.toList());

        System.out.println(fatCats);
    }

    private static List<Cat> getListCats() {
        return List.of(
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "white"),
                new Cat("Tiger", 3, "grey"),
                new Cat("Panda", 4, "black")
        );
    }

    private static void task1() {
        List<Integer> integers = List.of(-1, 12, 0, 4, 1, -15, 24, 0);
        // хотим получить список положительных чисел
        // список должен быть отсортирован в порядке возрастания

        List<Integer> result = new ArrayList<>();
        for (Integer integer : integers) {
            if (integer > 0) result.add(integer);
        }
        Collections.sort(result);
        System.out.println(result);

        //У всех коллекций есть метод стрим создающий поток на основе элементов коллекций
        List<Integer> resultStream = integers.stream()//создаю поток на основе коллекции
                .filter(integer -> integer > 0) //фильтрация элементов
                .sorted()  // сортировка в естественном порядке
                .collect(Collectors.toList());// Терминальный метод преобразует элементы потока в список
        System.out.println(resultStream);
    }
}
