package lesson.lesson_02.lesson_19;

import java.util.Arrays;
import java.util.Random;

public class ArrayUse {
    public static void main(String[] args) {
        //Класс Arrays - набор статических методов для операций над массивамиv
        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        //toString - возвращает представление массива в виде строки
        String stringArray = Arrays.toString(ints);
        System.out.println(stringArray);
        System.out.println(Arrays.toString(ints));

        // copyOf()
        // Создает новый массив, указанной длинны.
        // При этом копирует элементы из указанного массива

        int[] newInts = Arrays.copyOf(ints, 9);
        System.out.println(Arrays.toString(newInts));

        //скопировать диапазон значение из старого массива
        int[] intsRange = Arrays.copyOfRange(ints, 2, 7);// индекс от - включительно, до - не включительно
        System.out.println("intsRange:" + Arrays.toString(intsRange));

        //fill - Метод заполняющий массив значениями

        int[] fillArray = new int[10];
        Random random = new Random();
        Arrays.fill(fillArray, 10);
        System.out.println("fillArray: " + Arrays.toString(fillArray));

        int[] number = {1, 2, 3, 4};
        int[] digits = {1, 2, 3, 4};


        System.out.println(number.equals(digits));//false
        System.out.println(number == digits);//false

     //Arrays.equals - сравнивает два массива по значениям элементов
        System.out.println(Arrays.equals(number, digits));// true
        //deepToString - позволяет получать строковое представление многомерных массивов

        int[][] matrix = new int[3][4];
        System.out.println(Arrays.deepToString(matrix));

        // Сортировка, поиск, System.arraycopy


    }
}
