package homework.homework_02.homework_07;

import java.util.Scanner;

/*
Задача 1 (Использовать оператор переключателя)

Программа запрашивает пользователя ввести число от 1 до 7.
Если число равно 1, выводим на консоль «Понедельник»,
 2 – «Вторник» и так далее. Если 6 или 7 – «Выходной».
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7");
        int userInputDay = scanner.nextInt();
        switch (userInputDay) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Cреда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
            case 6:
            case 7:
                System.out.println("Выходной день");
                break;
            default:
                System.out.println("Ваш ввод не распознан");
        }
    }
}
