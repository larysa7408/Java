package lesson_09;

public class BreakContinue {
    public static void main(String[] args) {

        // continue, break
        // оператор continue при его вызове завершает текущую итерацию цикла и переходит к следующей

        // Перебирать  числа от 1 до 10
        for (int i = 1; i < 11; i++) {
            System.out.println("до if: " + i);

            if (i == 4) continue; // после вызова завершается итерация, переходим в блок изменений переменныч


            System.out.println("после if: " + i);

            if (i == 8) break; // полностью завершается выполнение всего цикла. Переход в строчку 27 кода

            System.out.println("после break: " + i);

        } // тело цикла

        System.out.println("После цикла");

        // напечать все все четный числа от 1 до 20
        for (int i = 1; i <= 20; i++) {

            if (i % 2 != 0) continue;
            System.out.println(i);
            // Большой блок
        }
    }
}
