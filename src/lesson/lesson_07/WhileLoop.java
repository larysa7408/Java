package lesson.lesson_07;

public class WhileLoop {
    public static void main(String[] args) {

         /*
        while (condition) {
            //тело цикла
        }
       */

        //   while (true) { // бесконечный цикл
        System.out.println("Hello!");

        // Вывести на экран цифры от 0 до 10
        int i = 0;
        while (i < 10) {
            System.out.println("i = " + i);
            i++; // увеличиваться на 1
        }
        System.out.println(" Конец цикла while");

        // ПРИМЕР

        String str = "Петя привет";
        int idx = 0;

        while (idx < str.length()) {
            System.out.println(str.charAt(idx) + " ");
            idx++;
        }
        System.out.println();

        // распечатать все четные числа от 0 до 21:

        // 1. Перебрать числа от 1 до 21 с шагом 1
        // 2. Является ли текущее число четным. Если да - распечатать

        int i1 = 1;
        while (i1 <= 21) {
            if (i1 % 2 == 0) {
                System.out.println(i1);
            }
            i1 ++;
        }


    }
}
