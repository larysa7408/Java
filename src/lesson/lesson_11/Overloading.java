package lesson.lesson_11;

import java.util.Random;

public class Overloading {
    public static void main(String[] args) {
        System.out.println("Min untt value: " + Integer.MIN_VALUE);
        System.out.println("Max int value: " + Integer.MAX_VALUE);

        printNumber(10);

        // Сигнатура метода
        // Совокупность названия метода и его параметров. Последовательность параметров важна


//        printNumber(5, 12);

        printNumber(6, "ABC");

        printNumber("ABC", 6);

        // printNumber(1, 2, 3); такой сигнатуры нет (название + три инта в параметрах -> Ошибка компиляции)

        int[] ints = new int[10];

        printArray(ints);

        fillArray(ints);

        printArray(ints);

        fillArray(ints, 10000);

        printArray(ints);

        // Написать перегруженный метод fillArray, которой заполняет массив случайными числами в диапазоне от 0 до N (передаем в параметры метода)


    } // Methods

    public static void printArray(int[] ints) {
        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + ((i < ints.length - 1) ? "; " : "]\n")); //

//            System.out.print(ints[i]); // Альтернатива тернарному оператору. Выполняет тоже самое
//
//            if (i < ints.length - 1) {
//                System.out.print("; ");
//            } else {
//                System.out.print("]\n");
//            }

        }
    }

    public static void fillArray(int[] ints, int bound) {
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(bound + 1);
        }
    }

    public static void fillArray(int[] ints) {
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(1001); // 0..1000
        }
    }

    static void printNumber(String string, int digit) {
        System.out.println("Hello");
    }

    public static void printNumber(int num, String str) {
        for (int i = 1; i <= num; i++) {
            System.out.print(i + str + " ");
        }
        System.out.println();
    }

    public static void printNumber(int start, int end) {
        System.out.println("Мы в методе два int-а");
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printNumber(int number) {
        System.out.println("Мы в методе один int");
        printNumber(1, number);
        sayHello();

//        for (int i = 1; i <= number ; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
    }

    public static void sayHello() {
        System.out.println("Hello");

    }


}








