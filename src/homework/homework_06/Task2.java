package homework.homework_06;

import java.util.Random;

/* Задача 1
        Запишите в 4 переменные случайные числа от 0 до 100.
        Вы делаете все 4 на экране
        Программа должна определить наибольшее из этих четырех чисел
        Результат на экране

         */
public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int var1 = random.nextInt(101); // 0..100 включительно
        int var2 = random.nextInt(101); // 0..100 включительно
        int var3 = random.nextInt(101); // 0..100 включительно
        int var4 = random.nextInt(101); // 0..100 включительно

        System.out.println(var1 + " | " + var2 + " | " + var3 + " | " + var4);

        int max = var1;

        if (max < var2) {
            max = var2;
        }
        if (max < var3) {
            max = var3;
        }
        if (max < var4) {
            max = var4;
        }

        System.out.println("Max:" + max);


    }
}
