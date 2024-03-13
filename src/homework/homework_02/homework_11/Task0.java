package homework.homework_02.homework_11;

/*
Написать метод, получающий массив целых чисел и распечатывающий массив в обратном порядке.

{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
Метод «Перегрузить», если в него приходит индекс,
то часть массива слева до этого индекса распечатывается в обычном порядке,начиная с этого индекса
в обратном порядке:
{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
Еще одна перегрузка: метод берет массив и булевый флаг.
Если флаг == true -> печатает массив в обратном порядке.
Если флаг == false -> печатает массив в прямом порядке.
 */
public class Task0 {
    public static void main(String[] args) {
        int[] testArr = {1, 4, 3, 6, 7};

    } // Methods Area

    public static void printReverseArray(int[] array, int index) {
        //1 надо перебрать индексы по возростанию от 0 до index и распечатать все элементы с этими индексами
        //2 надо перебрать индексы по убыванию на индекс до максимального индекса в массиве (длина-1) и распечатать все элементы с этими индексами

        System.out.print("[");
        for (int i = 0; i < index; i++) { //При index = 0 ни разу не выполнится
            System.out.println(array[i] + ((i < array.length - 1) ? "," : ""));

        }

        for (int i = array.length - 1; i >= index; i--) {//при index = array.lenght
            System.out.print(array[i] + ((i > 0) ? ", " : "]\n"));
        }
        System.out.println("]");
    }

    public static void printReverseArray (int[] array) {
        printReverseArray(array, 0);
    }

    public static void printReversaArray(int[] array, boolean flag) {
        if (flag) { //печатает массив в обратном порядке
            printReverseArray(array);
        } else { // прямой порядок
            printReverseArray(array, array.length);
        }
    }
}










