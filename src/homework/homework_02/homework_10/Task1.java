package homework.homework_02.homework_10;
/*
Написать метод, принимающий на вход целое число.
Метод должен вывести на экран 2 в степени этоЧисло

класс Math для нахождения степени числа использовать нельзя ;)
 */

public class Task1 {
    public static void main(String[] args) {
        powTwo(-10);

    } //


    public static void powTwo(int pow) {

        // мы должны обработать входящие значения
        // Если степень пришла отрицательная? 2 ^ (-n) = 1 / (2^n)
        // если пришел 0?

        int absPow = (pow > 0) ? pow : pow * -1;

        // Что делает наш тернарный оператор
//        if (pow > 0 ) {
//            absPow = pow;
//        } else  {
//            absPow = pow * -1;
//        }

        long result = 1;

        for (int i = 0; i < absPow; i++) { // если степень равна 0 -> цикл ни разу не выполнится. И результат останется равным 1
            result *= 2;
        }

        if (pow >= 0) {
            System.out.println(result);
        } else {
            System.out.printf("1/%d\n", result);
            System.out.println((double) 1 / result);
            System.out.printf("%.6f\n", (double) 1 / result);
        }

    }
}
