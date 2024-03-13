package homework.homework_02.homework_08;

import java.util.Arrays;
import java.util.Random;

/*Task 03
Дан массив целых чисел. *Выберите произвольную длину. Заполните случайными значениями.

Вывести на экран:

минимальное значение, хранящееся в массиве
максимальное
среднее арифметическое всех значений в массиве
 */
public class Task3_4 {
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(15) + 1;
        System.out.println("size: " + size);


        int[] array = new int[size];


        int i = 0;
        System.out.print("[");
        while (i < array.length) {
            array[i] = random.nextInt(101);
            System.out.print(array[i] + ((i < array.length - 1) ? "; " : ""));
            i++;
        }
        System.out.println("]");

        int min = array[0];
        int max = array[0];

        int sum = 0;

        i = 0;
        while (i < array.length) {
            sum += array[i];

            if (max < array[i]) max = array[i];
            if (min > array[i]) min = array[i];
            i++;
        }

        System.out.println("Min: " + min);
        System.out.println("MAx: " + max);
        System.out.println("Average: " + ((double) sum / array.length));


        int minAr = array[0];
        int minIndex = 0;

        int maxAr = array[0];
        int maxIndex = 0;

        i = 1;
        while (i < array.length) {

            if (maxAr < array[i]) {
                maxAr = array[i];
                maxIndex = i;
            }

            if (minAr > array[i]) {
                minAr = array[i];
                minIndex = i;
            }

            i++;
        }

        System.out.println("max: " + maxAr + " index: " + maxIndex);
        System.out.println("min: " + minAr + " index: " + minIndex);

        array[minIndex] = maxAr;
        array[maxIndex] = minAr;

        i = 0;
        System.out.print("[");
        while (i < array.length) {
            System.out.print(array[i] + ((i < array.length - 1) ? "; " : ""));
            i++;
        }
        System.out.println("]");

    }




    /* ~Task 04
        Дан массив целых чисел. Поменять местами элемент с максимальным и минимальным значением
        Пример:
        { 5, 6, -25, 0, 31, -15 }  ->  { 5, 6, 31, 0, -25, -15}
         */
    public static class Task4 {
        public static void main(String[] args) {
            Random random = new Random();
            int[] arr = new int[]{5, 6, -25, 0, 31, -15};
            int max = arr[0];
            int min = arr[0];
            int maxInd = 31;
            int minInd = -25;
            for (int i = 0; i < arr.length; i++) {
                if (max > arr[i]) {
                    maxInd = i;
                    max = arr[i];
                }
                if (min < arr[i]) {
                    minInd = i;
                    min = arr[i];
                }
            }
    // переставляем элементы
            int temp = arr[minInd];
            arr[minInd] = arr[maxInd];
            arr[maxInd] = temp;
            Arrays.stream(arr).forEach(e -> System.out.println(e)); // вывод массива


        }
    }
}
