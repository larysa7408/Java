package homework_14;

/*
Задание 1
Написать метод swap, добавляющий во входной массив целых чисел и два индекса.
Метод должен поменять местами значения, хранящиеся в этих индексах.

{0, 1, 2, 3, 4, 5, 6} -> swap(arr, 1, 5} -> {0, 5, 2, 3, 4, 1, 6}
Если индексы за массивом?

Метод перегрузки для работы с массивами строк.
 */
public class Task1 {
    public static void main(String[] args) {

        int[] testArr = {0, 1, 2, 3, 4, 5, 6};
        printArr(testArr);
        swap(testArr, 1, 7);
        printArr(testArr);


        test();
    }


    public static void swap(int[] ints, int idx1, int idx2) {

        if (ints == null || idx1 < 0 || idx1 >= ints.length || idx2 < 0 || idx2 >= ints.length) return;
        // оператор return мгновенно прекращает работу метода.
        // после его вызова в void методе - дальнейший код не выполняется

        int temp = ints[idx1];
        ints[idx1] = ints[idx2];
        ints[idx2] = temp;
    }

    public static void test() {

        if (true) return;
        System.out.println("Test");
    }

    public static void printArr (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }




}
