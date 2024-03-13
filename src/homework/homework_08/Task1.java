package homework.homework_08;

/*
Распечатать все числа от 1 до 100, которые делятся на 5 без остатка.
Используем цикл do-while
 */
public class Task1 {
    public static void main(String[] args) {
        int n = 1;
        while (n <= 100) {
            if (n % 5 == 0) {
                System.out.println(n);
                n++;
            }
            System.out.println(n);
            n++;
        }
    }
}

