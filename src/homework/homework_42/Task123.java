package homework.homework_42;
/*
Задание 1
В записях метод, добавляющий список чисел и возвращающий новый,отфильтрованный список.
Используйте несколько предикатов для фильтрации чисел в списке,
где числа должны быть четными, больше 10 и меньше 100.

Задача 2
Создайте функцию цепочки, которая сначала удаляет пробелы из строк,
затем преобразует их в верхний регистр, а в конце считает количество символов в измененной строке.

Задача 3
Напишите BiConsumer, который принимает ключ и значение, а затем печатает их в формате
"ключ=значение".
 */

import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.*;
import java.util.stream.Collectors;

public class Task123 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        Predicate<Integer> predicate1 = integer -> integer % 2 == 0;
        Predicate<Integer> predicate2 = integer -> integer > 10;
        Predicate<Integer> predicate3 = integer -> integer < 100;

        Predicate<Integer> combinedPredicate = predicate1.and(predicate2).and(predicate3);

        List<Integer> integers = List.of(5, 12, 65, 102, 34, 9, 8, 76, 200, 19, 53, 14, 44);
        System.out.println(filterByPredicate(integers, combinedPredicate));

        List<Integer> list = integers
                .stream()
                .filter(combinedPredicate)
                .collect(Collectors.toList());
        System.out.println(list);

//        integers
//                .stream()
//                .filter(predicate1)
//                .filter(predicate2)
//                .filter(predicate3)
//                .collect(Collectors.toList());
    }

    private static List<Integer> filterByPredicate(List<Integer> integers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();

        for (Integer i : integers) {
            if (predicate.test(i)) result.add(i);
        }
        return result;
    }

    private static void task2() {
        String test = "Hello, world!";
        Function<String, String> functionReplaceSpaces = string -> string.replaceAll("", "");
        Function<String, String> functionToUpperCase = String::toUpperCase;
        Function<String, Integer> functionMapStringToLenght = String::length;

        Function<String, Integer> combinedFunction = functionReplaceSpaces.andThen(functionToUpperCase).andThen(functionMapStringToLenght);

        System.out.println(combinedFunction.apply(test));
    }

    private static void task3() {
        // BiConsumer - принимает два аргумента Производит какое то действие ничего не возвращает
        BiConsumer<Integer, String> biConsumer = (key, value) -> System.out.println(key + "=" + value);
        biConsumer.accept(1, "Test");

        // BiPredicate<T,U> принимают два аргумента возвращает логическое значение типа boolean

        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a > b;
        System.out.println(biPredicate.test(10, 20));

        // BiFunction<T,U,P> принимает два аргумента типов T,U возвращает обьект типа R
        BiFunction<String, String, Integer> biFunction = (s1, s2) -> s1.length() + s2.length();
        System.out.println(biFunction.apply("Hello", "World"));

    }
}
