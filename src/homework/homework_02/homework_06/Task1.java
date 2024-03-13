package homework.homework_02.homework_06;

import java.util.Scanner;

/* Задача 0
Необходимо написать программу, где пользователю предлагается ввести число для выбора:
1, 2 или 3, программа должна сказать, какое число ввёл пользователь: 1, 2 или 3
      */
public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1,2 или 3: ");
        int i = scanner.nextInt();
        if (i == 1) {
            System.out.println("Вы ввели число 1:");
        } else if (i == 2) {
            System.out.println("Вы ввели число 2: ");
        } else if (i == 3) {
            System.out.println("Вы ввели число 3");
        } else {
            System.out.println("Вы ввели число не равное 1, 2 или 3");
        }
        System.out.println("Конец программы");
    }
}
