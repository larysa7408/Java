package homework_07;

import java.util.Scanner;

/* Задача 5 Программа запрашивает у пользователя слово «привет».
 Если пользователь вводит правильное слово —
 программа распечатывает на экране благодарность и завершает работу.
  Если вводится не верное слово — программа просит ввести слово еще раз.
  До тех пор, пока не будет введено запрашиваемое слово

 *опционально - посчитайте количество измерений,
 которые потребовались пользователю для подачи дополнительного
 слова Почанию - выведите число величин на экран

 */
public class Task5 {
    public static void main(String[] args) {

        int count = 10;
        while (count < 5) {
            System.out.println("Тело While loop");
        }

        count = 4;
        do {
            System.out.println("Тело цикла Do-While");
            count++;
        } while (count < 10);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово Hello");
        String hello=scanner.nextLine();
                while(!hello.equalsIgnoreCase("hello")){
                    System.out.println("введите слово hello (из цикла)");
                    hello=scanner.nextLine();
                }
        System.out.println("Спасибо! Дo свидания!");



    }


}
