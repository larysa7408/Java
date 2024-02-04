package homework_07;

import java.util.Random;

/*
Задание 2. Реализовать с использованием switch
Ваш ребенок принес оценку за контрольную работу по математике.
В школе 12 бальная система. Запишите в переменную случайное число от 0 до 12.
Вы разрешаете ребенку смотреть телевизор не более 60 минут в день.
(Оставшееся время не может быть больше 1 часа)
На сегодня у него осталось 45 минут. (записать в переменную)
Если оценка от 10 до 12 баллов ->
Скажите ему, как вы рады и добавьте к оставшемуся на сегодня времени 1 час
от 7 до 9 -> Слова похвалы на экран + ко времени 45 минут
от 4 до 6 -> Нейтральные слова + ко времени 15 минут
3 -> Огорчитесь.  Минус 30 минут ко времени;
Оценка меньше -> Трагедия. Сегодня ТВ смотреть запрещено
Выведите на экран оставшееся на сегодня время для просмотра ТВ
P.S. Реализовать с использованием switch
 */
public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int restTime = 45; ////На сегодня у него осталось 45 минут. (записать в переменную)
        int count = 0;

        while (count < 2) { // Будем генерировать две случайные оценки в цикле
            int note = random.nextInt(13); // Запишите в переменную случайное число от 0 до 12.
            System.out.println("Получена оценка:" + note);
            switch (note) {
                case 12:
                case 11:
                case 10:
                    System.out.println("как вы рады");
                    restTime += 60;
                    break;
                case 9:
                case 8:
                case 7:
                    System.out.println("Слова похвалы на экран");
                    restTime += 45;
                    break;
                case 6:
                case 5:
                case 4:
                    System.out.println("Нейтральные слова");
                    restTime+=15;
                    break;
                case 3:
                    System.out.println("Огорчитесь");
                    restTime-=30;
                    break;
                case 2:
                case 1:
                case 0:
                    System.out.println("Трагедия");
                    restTime=0;
                default:
                    System.out.println("Ребенок ты волшебник.Таких оценок не бывает");
            }
            if (restTime>60){
                restTime=60;
            } else if (restTime<0) {
                restTime=0;
            }
            System.out.println("Оставшееся время на сегодня: "+ restTime);
            count++;
        }


    }
}
