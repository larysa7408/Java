package homework.homework_02.homework_12;

/*
Написать свой метод copyOfArray, дублирующий функциональный метод Arrays.copyOf()
на входе берут массив целых чисел и размер - размер нового массива.
Метод должен создать и распечатать заданный массив в условиях длины. В начало массива должны быть скопированы элементы из входящего массива:
{0, 1, 2, 3, 4 , 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
 */
public class Task3 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6};
        int len = 10;
        copyOfArray(array, len);
    }

    public static void copyOfArray(int[] array, int lenght) {
        System.out.println("Новый массив до" + lenght + "элемента");
        int[] newArray = new int[lenght];
        for (int i = 0; i < lenght && i < array.length; i++) {
            newArray[i] = array[i];
        }
        for (int i = 0; i < lenght; i++) {
            System.out.print(newArray[i]);

        }
        printArray(newArray);
    }

    public static void printArray(int[] ints) {
        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + ((i < ints.length - 1) ? "; " : "]\n"));


        }
    }
}