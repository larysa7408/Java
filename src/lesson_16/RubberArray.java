package lesson_16;

public class RubberArray {
    int[] array;
    int cursor;// присвоено значение по умолчанию 0

    public RubberArray() {
        array = new int[10];

    }

    void add(int number) {
        //Добавлять значение в наш массив

        //Проверка. есть ли место в нашем внутреннем массиве?

        if (cursor > array.length * 0.9) {
            expandArray();// метод расширяющий наш массив
        }
        array[cursor] = number;
        cursor++;
    }


    void expandArray() {
        System.out.println("Расширяем массив! ===============" + cursor);
        // 1. создать новый массив бОльшего размера
        // 2. Переписать значения из старого массива в новый
        // 3. Перебросить ссылку

        int[] newArray = new int[array.length + 2]; //создаю новый массив, в 2 раза больше предыдущего

        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];//Переписать значения из старого массива в новый

        }
        array = newArray;//// 3. Перебросить ссылку. Переменная array теперь хранит ссылку на "новый" массив
        System.out.println("Расширение массива завершено ============");

    }

    public String toString() {
        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + ((i < cursor - 1) ? "," : "]");

        }
        return result;
    }

    //void add(int number, int number2){
    void add(int... ints) {
        //ints -я могу с ним обращаться точно также как с ссылкой на массив
        for (int i = 0; i < ints.length; i++) {
            add(ints[i]);
        }
    }
}
/*
1 Диномическое изменение размера массива
2 Добавлять в массив элементы
3 Добавлять в массив сразу несколько элементов
4 Вывод в консоль значений массива
 */