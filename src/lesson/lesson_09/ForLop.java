package lesson.lesson_09;

import java.util.Random;

public class ForLop {
    public static void main(String[] args) {
        // for (<иннициализация>; <блок проверок>; <изменения счетчиков>) {
        //тело цикла

        //Распечатать числа от 0тдо 10

        int k = 0;
        while (k < 10) {
            //тело цикла
            //что то делать
            k++;
        }
        System.out.println("k->" + k);

        for (int i = 0; i < 10; i++) {
            //тело цикла
            System.out.println(i); // Область видимости i - только внутри тела цикла и блоков цикла i., проверок инициализации всех типов
        }

        //1. Выполняется блок инициализации. Один раз в самом начале
        //2. Делается проверка / проверки в блоке условий
        //3. Если проверка true - выполняется тело цикла ( если false - выходим из цикла - тело НЕ выполняется
        //4. По окончании выполнения тела цикла переходим в блок изменений
        //5. Проверка условий Если true выполняем тело И так по кругу

        // Ни один из блоко не является обязательным он может быть пустым
        // for (; ; ) { // Бесконечный цикл
        //     System.out.println("Hello");
        //  }

        int j = 15;

        for (j = 0; j < 20; j++) {
            System.out.println(j + "");
        }
        System.out.println();
        System.out.println("j за циклом" + j);

        for (int i = j - 5; i < 20; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
        for (int i = 0; i >= 0; i = i + 1000) { //Цикл завершится при перевыполнении типа int (мы получим отрицательное значение)
            System.out.println(i);
        }

        for (String str = "Hello"; str.length() < 10; str += "$") {// в блоках инициализации и проверок вполне могут быть не числа
            System.out.println(str);
        }
        // мы можем инициализировать несколько переменных. Проверять составные условия.
        // Изменять несколько переменных в блоке изменений

        int k1 = 0;
        // какие-то строки кода
        k1 = 15;

        for (int a = 0, f = 1; k1 >= 0 && f < 10; k1--, a = ++a + k1, f++) {
            System.out.println(k1 + " : " + a + ":" + f);
        }
        System.out.println();

        //Задача
        // создать массив случайной длины (от 5 до 15) целых случайных чисел
        // Заполнить массив случайными числами в диапозоне от -50 до 50;

        Random random = new Random();
        int[] ints = new int[random.nextInt(11) + 5];
        System.out.println("размер массива: " + ints.length);

        System.out.print("[");

        // LT - fori + tab - создается заготовка цикла

        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(101) - 50; //  (0..100) - 50 -> -50 .. 50
            System.out.print(ints[i] + ((i < ints.length - 1) ? ", " : "]\n"));
        }




    }

}