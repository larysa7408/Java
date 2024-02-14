package lesson_20;

import java.util.Arrays;

/*
Task 3

Написать метод по поиску строки в массиве строк. На вход метод принимает массив строк, и строку для поиска.
 */
public class StringSearch {
    public static void main(String[] args) {

        String[] strings = {"Java", "Python", "", "world", "string"};

        int[] findStrings = searchString(strings, "Java", "world");

        System.out.println(Arrays.toString(findStrings));

        boolean isFind = findStrings[0] >=0 && findStrings[1] >= 0;
        System.out.println(isFind);
    }

    public int searchString(String[] strings, String findMe) {
        // Взять первую строку на листике. Сравнить с искомой. Если одинаковые - значит нашел.
        // Если не одинаковые - взять следующую строку. Сравнить.
        // Если ничего не найдено и строк для сравнения не осталось - значит на листике строки, которую ищу - нет.

        for (int i = 0; i < strings.length; i++) {
            // для сравнения строк мы должны использовать метод equals
            if( strings[i].equals(findMe) ) {
                // строка нашлась! возвращаем индекс (или true (в зависимости от решения в начале при составлении сигнатуры метода)
                return i;   // return true;
            }

        }

        // весь массив перебрали, строки не нашли. Возвращаем "отрицательный" результат
        return  -1; // return false;

        // Тестируем. Понимаем, что наш код аварийно завершается при любом появлении null
        //дописываем проверки. Тестируем опять.

    }

    // int{} = {index1, index2}
    public static int[] searchString(String[] strings, String findMe1, String findMe2) {
        int[] result = {-1, -1};
        // перебираем все строки в массиве.
        // сравниваем текущую строку с первой строкой - если нашел, меняю индекс 0 в результирующем массиве
        // туже текущую строку - сравниваю со второй, если совпали -  меняю индекс 1 в результирующем массиве

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(findMe1)) {
                result[0] = i;
            }
            if (strings[i].equals(findMe2)) {
                result[1] = i;
            }
        }

        return result;
    }

        }
