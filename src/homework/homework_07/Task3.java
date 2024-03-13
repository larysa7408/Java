package homework.homework_07;
/*
Задача 3 Распечатать 10 строк:
 «Задача1». «Задача2». … «Задание10». использовать цикл while
 */
public class Task3 {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 10){
            System.out.println("Task:" + count);
            count++;
        }
    }
}
