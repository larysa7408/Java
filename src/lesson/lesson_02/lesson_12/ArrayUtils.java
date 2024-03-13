package lesson.lesson_02.lesson_12;

/*
Выбирается минимальный элемент массива
минимальное значение меняется местами с первым элементом
Вторая итерация - выбирается мин элемент из оставшейся части массива
меняется местами с первым из оставшихся.

 */
public class ArrayUtils {
    public static void main(String[] args) {
        int[] ints = {11, 0, 77, 33, 24, 56, 83, 99, 105, 45, -8, -15};

        int minIndex = minIndexSearch(ints);
        System.out.println(minIndex + "|" + ints[minIndex]);

        printArr(ints);

        sortArray(ints);

        printArr(ints);

        System.out.println(linearSearch(ints, 33));


        System.out.println(binarySearch(ints, 100));

    }


    //
    public static int linearSearch(int[] ints, int value) {
        //
        //
        //
        //нам надо совершить операций

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == value) return i;

        }

        return -1;
    }
 /*
    Делим массив пополам
    Если значение равно искомому - возвращаем индекс.
    Если значение в середине массива больше, чем искомое, значит, если искомое и присутствует в массиве, то оно будет в левой части массива. Значения в правой части можно не проверять
    Если наоборот, значение в середине больше, то искомое может быть только в правой части
    Если оставшуюся часть массива еще можно разделить пополам - возвращаемся в шан номер 1. Делим пополам оставшуюся часть массива
    Если оставшуюся часть уже невозможно разделить - возвращаем -1 - элемент не найден
     */


    public static int binarySearch(int[] array, int searchValue) {

        int starIndex = 0;
        int endIndex = array.length - 1;
        int mildleIndex;
        int counter = 0; //счетчик шагов




        //Проверяем можно ли разделить массив пополам
        while (starIndex <= endIndex) {
            counter++;

            //вычислить индекс середины
            // 0.12->0+(12-0)/2->6|||7..12->7+(12-7)/2->9
            mildleIndex = starIndex + (endIndex - starIndex) / 2;

            //сравниваем на равенство значение "в середине" с искомом
            if (array[mildleIndex] == searchValue) {
                   System.out.println("Элемент найден! Шагов затрачено: " + counter);
                return mildleIndex;
            }

            // надо понять в какой части массива может быть искомое значение
            //отбросить не нужную половину массива
            //сместить индексы (указатели)

            if (array[mildleIndex] > searchValue) {
                //мы должны отбросить правую часть (то, что справа от 'середины')
                endIndex = mildleIndex - 1;

            } else {
                //отбрасывает левую часть
                starIndex = mildleIndex + 1;
            }


        }
        //        System.out.println("Элемент отсутствует. Шагов затрачено: " + counter);
        return -1;

    }


    //Сортировка
    public static void sortArray(int[] array) {

        //Мы запускаем цикл Ищем минимальный элемент Меняем местами с самымы левым
        // Уменьшаем "зону поиска" (смещаем вправо левую границу)

        for (int i = 0; i < array.length; i++) {
            // Находим минимум в текущей части массива
            int minIndex = minIndexSearch(array, i);

            // мне нужно поменять местами значения самого левого и минимального элемента
            // есть индексы. Индекс самого левого элемента i

            int temp = array[i];
            array[i] = array[minIndex];
            array[i] = array[minIndex];// одна операция константная сложность 0(1)
            array[minIndex] = temp;

        }
    }

    // Ищем минимальное значение в части массива. Начиная с индекса startIndex
    public static int minIndexSearch(int[] arr, int startIndex) {
        int min = arr[startIndex];
        int minInex = startIndex;

        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minInex = 1;
            }

        }
        return minInex;

    }

    //метод поиска минимального значения в массиве
    //Будем возвращать индекс минимального элемента
    public static int minIndexSearch(int[] arr) {
        int min = arr[0];
        int minInex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minInex = 1;
            }

        }

        return minInex;
    }

    public static void printArr(int[] arr) {
        System.out.println("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + ((i < arr.length - 1) ? "," : "}\n"));
            System.out.println(arr[i] + ((i < arr.length - 1) ? "," : "}\n"));
        }
        ;

    }
}



