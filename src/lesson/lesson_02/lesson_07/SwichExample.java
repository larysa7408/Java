package lesson.lesson_02.lesson_07;

import java.util.Random;

public class SwichExample {
    public static void main(String[] args) {

        int x = 35;

        if (x == 5) {
            System.out.println("if x == 5");
        } else if (x == 7) {
            System.out.println("if x == 7");
        } else {
            System.out.println("else x имеет другое значение");
        }
        //        String name = "Fred";

        switch (x) {
            case 5:
                System.out.println("swich x == 5");
                break;
            case 7:
            case 8:
                System.out.println("swich x == 7 or 8");
                break;
            default:
                System.out.println("swich x имеет другое значение");

        }
        System.out.println("Продолжение программы");

      /*
        У ребенка есть карманные деньги. Допустим сейчас есть 100 денег.
        Ребенок получает  в школе оценки (от 1 до 5)
        За хорошие оценки получает деньги, за плохие отбирают:
        5 -> +20 денег
        4 -> +10
        3 -> не изменяется
        2 -> -20
        1 -> - все деньги

        вывести: У ребенка сейчас ххх денег
         */


        Random random = new Random();
        int note = random.nextInt(5) + 1; //Генерирует случайную оценку от 1 до 5
        int money = 100;

        note = 1;
        double w = 1.0;
        System.out.println("Оценка:" + note);

        // byte, short, char, int
        // Byte, Short, Charter, Integer
        // String (начиная с 7 версии Java)
        // Перечисления Enum


        switch (note) {
            case 5:
                money += 20;
                break;
            case 4:
                money += 10;
                break;
            case 3:
                break;
            case 2:
                money -= 20;
                break;
            case 1:
                money = 0;
                break;
            default:
                System.out.println("Таких оценок не бывает");


        }


        System.out.println("У ребенка сейчас" + money + "денег");
    }


}
