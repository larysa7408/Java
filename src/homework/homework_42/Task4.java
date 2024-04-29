package homework.homework_42;
/*
Задача 4
Дан список строк. Воспользуйтесь Stream API,
отфильтруйте строки, которые начинаются с определенной буквы
(например, «A»),
удалите дубликаты и отсортируйте их в алфавитном порядке.
 */

import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Abcde".startsWith("Abc"));
        // System.out.println("Abcde".endsWith("de"));

        List<String> list = List.of(
                "Вода", "Водка", "Вилы", "Вилка", "Вино", "Аджика", "Сало", "Мясо", "Пульт", "Дом", "Сад");

        task4(list,"A");
    }

    private static void task4(List<String> strings, String startWith) {
        List<String> strings1 = strings
                .stream()
                .filter(string -> string.startsWith(startWith)) // начинается на строку
                //.filter(string -> string.endsWith("A")) // Заканчивается на строку
                .distinct()//удаляет дубликаты с методом equals()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(strings1);


    }
}
