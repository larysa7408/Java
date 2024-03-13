package homework.homework_07;

/*
Задание 4 Распечатать только 7 чисел от 1 до 100,
 которые выросли на 5 без остатка. использовать цикл while
 */
public class Task4 {
    public static void main(String[] args) {
        int i = 1;
        int countNumber = 0;
        while (i <= 100) {
            if (i % 5 == 0) {
                System.out.println(i);
                countNumber++;
            }
        System.out.println(i);
        i++;
        }

    }
}
