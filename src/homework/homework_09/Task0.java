package homework.homework_09;
/*
Задача 0
Заполните массив 20 случайными целыми числами.
 Программа должна вывести на экран массива количество четных чисел
 в массиве и сумму всех четных чисел.
 */

import java.util.Random;

public class Task0 {
    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;
        int countNumber = 0;
        int[] randomInts = new int[20];
        System.out.println("[");
        for (int i = 0; i < randomInts.length; i++) {
            randomInts[i] = random.nextInt(11);
            int currentNumber = randomInts[i];
            System.out.println(currentNumber + ((i < randomInts.length - 1) ? ";" : "]\n"));
            if (currentNumber%2==0){
                countNumber++;
                sum+=randomInts[i];
            }
        }
        System.out.println("Количество четных чисел:"+ countNumber);
        System.out.println("Сумма четных чисел:"+sum);

        }

    }

