package homework_09;
/*Задача 2
Заполните массив 50 случайными числами от 1 до 100.
Программа должна найти и вывести на экран все простые числа.
Посчитайте, сколько таких чисел получилось в массиве.
Простое число - число, которое включает в себя только 1 и себя.
Примеры простых чисел: 2, 3, 5, 7, 11, 13, 17, 19, 23 и т.д.

 */

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();

        int size = 100_00;
        int range = 500_001;

        int[] ints = new int[size];

        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(range);
//            System.out.print(ints[i] + ((i < ints.length - 1) ? ", " : "]\n"));
        }

        long start = System.currentTimeMillis(); // получаем текущее время в миллисекундах

        int countPrime2 = 0;

        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {
            // Простое число -> число, которое делится без остатка только на 1 и само себя.
            // 12 -> 1, 2, 3, 4, 6, 12
            // 13 -> 1, 13

            // 7 -> 2, 3, 4, 5, 6 -> остаток от деления не равный 0 - значит число простое.
            // Если в результате деления на один из делителей я получу остаток равный 0 - значит число составное (не является простым)

            int number = ints[i];
            boolean isPrime = true;

            if (number == 2 || number == 3) {
                isPrime = true;
            }

            if (number != 2 && number % 2 == 0 || number != 3 && number % 3 == 0) {
                isPrime = false;

            }

            // 5..7; 11..13; 17..19.. 23..25.. 29..31

            for (int j = 5; j <= Math.sqrt(number); j = j + 6) { //Math.sqrt(number) - вычисляет квадратный корень числа
                if (number % j == 0 || number % (j + 2) == 0) {
                    isPrime = false;
                    break;// уже найден один делитель. Остальные можно не перебирать. Завершаем внутренний цикл
                }
            }

            if (number <= 1) isPrime = false;

            if (isPrime) {
                System.out.print(number + ", ");
                countPrime2++;
            }
        }

        System.out.println("]");
        System.out.println("Количество простых чисел: " + countPrime2);

        long end = System.currentTimeMillis(); // получаем текущее время в миллисекундах
        System.out.println("Затраченное время: " + (end - start));

        start = System.currentTimeMillis(); // получаем текущее время в миллисекундах

        int countPrime = 0;

        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] <= 1) continue;
            // Простое число -> число, которое делится без остатка только на 1 и само себя .
            // 12 -> 1, 2, 3, 4, 6, 12
            // 13 -> 1, 13

            // 7 -> 2, 3, 4, 5, 6 -> остаток от деления не равный 0 - значит число простое.
            // Если в результате деления на один из делителей я получу остаток равный 0 - значит число составное (не является простым)

            int number = ints[i];
            boolean isPrime = true;

            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (number <= 1) isPrime = false;

            if (isPrime) {
                System.out.print(number + ", ");
                countPrime++;
            }
        }
        System.out.println("]");
        System.out.println("Количество простых чисел: " + countPrime);

        end = System.currentTimeMillis(); // получаем текущее время в миллисекундах
        System.out.println("Затраченное время: " + (end - start));


        /// Вариант 2

// Если у числа есть простые делители (делители на которое оно делится без остатка),
// то эти делители будут найдены в диапазоне от 2 до корня квадратоного из этого числа


    }


}
