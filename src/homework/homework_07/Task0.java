package homework.homework_07;
/*
Перепишите решение задачи с использованием переключателя вместо if-else:
Необходимо написать программу, где пользователю предлагается ввести число для выбора:
1, 2 или 3, программа должна сказать, какое число ввёл пользователь: 1, 2 или 3
 */
import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1,2 или 3: ");
        int i = scanner.nextInt();
        scanner.close();
        switch (i){
            case 1:
                System.out.println("Вы ввели число 1:");
                break;
            case 2:
                System.out.println("Вы ввели число 2: ");
                break;
            case 3:
                System.out.println("Вы ввели число 3");
                break;
            default:
                System.out.println("Вы ввели число не равное 1, 2 или 3");
        }
        System.out.println("Конец программы");

    }
}
