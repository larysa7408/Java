package lesson.lesson_16;

public class MainRuberArray {
    public static void main(String[] args) {
        RubberArray ra = new RubberArray(); // Создаем экземпляр нашего класса называем ra

        System.out.println(ra.toString());// // у нас доступны методы можем распечатать текущее состояние МАССИВА
        ra.add(15); // и можно распечать методы которые у нас есть  допустим добавили 15 -10 100
        ra.add(-10);
        ra.add(100);// пока добавляем  10 элементов все работает нормально

        for (int i = 0; i < 10; i++) {//Цикл for  как только мы добавим и на каждой операции в наш массив число будем добавлять (i)
            ra.add(i);//в цикле перебираем числа (i = 0; i < 10) числа от 0 до 9 и пытаемся засунуть их в массив ЕСЛИ добавим в индекс массив числа 10 выйдет ошибка
            System.out.println(ra.toString());// и еще раз распечатываем и смотрим что выведет в консоль

        }

        ra.add(100, 15, 17, -5, 24);
        System.out.println(ra.toString());





    }



}
