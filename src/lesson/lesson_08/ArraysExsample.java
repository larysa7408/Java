package lesson.lesson_08;

import java.util.Random;

public class ArraysExsample {
    public static void main(String[] args) {
        //Объявление массива
        int[] array;//
        int numbers[];//// альтернативные способ. НЕ рекомендуемые к использованию

        //Инициализация массива
        array = new int[5]; //Массив, как объект, создается в памяти.
        //!!! При инициализации мы обязаны указать размер массива
        // 5 - размер массива (количество ячеек)

        String[] strings = new String[7]; //// Объявление и инициализация массива
        //1 Мы создали переменную которая будет хранить ссылку на массив строк (в Stack)
        //2 Мы создали обьект в памяти (в Heap)
        //3 Каждую ячейку массива мы заполнили значениями "по умолчанию"

        //Значения по умолчанию:
        //для всех числовых типов (в том числе char) это будет 0 (0.0)
        // Для boolean - false
        //для всех ссылочных типов - значение null (null - ничего)

        //Явная инициализация массива

        int[] digits = new int[]{56, -98, 14, 1004, 1443};
        String[] strings1 = {"Str", "hello", "Java", "JS", "Orange"};
        int bum = 15;

        //  Доступ к значениям в ячейках массива осуществляется по индексам:

        int value = digits[0]; // в переменную value было записано значение ячейки с индексом (номером) 0;
        System.out.println("value:" + value);
        System.out.println("В ячейке под номером 2 в массиве strings1 хранится: " + strings1[2]);
        System.out.println("В ячейке под номером 2 в массиве strings1 хранится: " + (digits[3] / 2 - 15));
        System.out.println("Мы можем производить с полученным значением допустимые типом данных операций: " + (digits[3] / 2 - 15));

        System.out.println(digits);
        //размер массива
        int arrayLength = digits.length;
        int i = 0;
        while (i < arrayLength) {
            System.out.println(digits[i] + ",");
            i++;
        }
        System.out.println();
        // Изменение значения в ячейке массива
        digits[2] = 5000;

        i = 0;
        while (i < digits.length) {
            System.out.println(digits[i] + ",");
            i++;
        }
        System.out.println();
        System.out.println("array[2]:) + array[2]"); // проверяем значения в ячейках, массивов, заполненных значениями пол умолчанию
        System.out.println("strings [5]:" + strings[5]);// попытка вызова у null каких-либо методов вызовет исключение (аварийное завершение программы)
        strings[5] = "Pascal"; // изменяем значение в ячейке с индексом 5
        System.out.println("strings[5]: " + strings[5]);  // попытка вызова у null каких-либо методов вызовет исключение (аварийное завершение программы)


        // Создайте массив из 10 элементов и заполните его случайными числами (0..100);
        Random random = new Random();
        int[] nums = new int[10];

        int k = 0;
        System.out.println("]");

        k=1;
        int min = nums[0];
        while (k<nums.length){
            if (nums[k]<min){
                min = nums[k];
            }
            k++;
            }
        System.out.println("Min:" + min);

        }

    // Найти минимальное значение в массиве и вывести его в консоль



}



