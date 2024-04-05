package homework.homework_32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * AIT-TR, cohort 42.1, Java Basic, HW #32
 *
 * @author Larysa Petrova
 * @version 26-Apr-2
 */
//Задача 1. Написать метод, который меняет два элемента массива местами
// (массив может сохранять элементы любого ссылочного типа)
//Задача 2. Написать метод, преобразующий массив в ArrayList
// (массив может сохранять элементы любого ссылочного типа)
public class HomeWork32 {
    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7};
        String[] strArray = {"one", "two", "three", "four", "five", "six", "seven"};
        swapElements(1, 5, intArray);
        System.out.println(Arrays.toString(intArray));
        swapElements(1, 5, intArray);
        System.out.println(Arrays.toString(strArray));

        System.out.println("===========");

        System.out.println(arrayToList(intArray));
        System.out.println(arrayToList(strArray));
    }

    //Задача 1.
    static <T> void swapElements(int idxOne, int idxTwo, T[] array) {
        T tmp = array[idxOne];
        array[idxOne] = array[idxTwo];
        array[idxTwo] = tmp;

    }

    //Задача 2.
    static <T> List<T> arrayToList(T[] array) {
        List<T> result = new ArrayList<>();
        for (T item : array) {
            result.add(item);
        }
        return result;
    }
}
