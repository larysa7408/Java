package homework_19;

/*
Задание 1
Класс «Счётчик» Разработайте класс Счётчик,
который позволяет создавать объекты-счётчики с уменьшением и важным значением счётчика.
В классе должно быть:
Поле valueдля текущего хранения значения счётчика.
Методы increment(), decrement()увеличивающие и уменьшающие значение счетчика.
Метод getValue() для получения текущих значений счётчика.
 */
public class Counter {
    private int value;

    public Counter() { //текущее хранение значения счетчика
        this.value = 20;
    }

    public void increment() {//увеличение
        this.value++;
    }

    public void decrement() { //уменьшение
        this.value--;
    }

    public int getValue() {//Получение текущих значений счетчика
        return value;
    }
}
