package homework.homework_43;
/**
 * AIT-TR, cohort 42.1, Java Basic, HW #18
 *
 * @author Larysa Petrova
 * @version 28-Apr-24
 */

import lesson.lesson_43.MyRuntimeException;

/**
 * Напишите метод calculateArray(),
 * на вход которого подаётся двумерный строковый массив размером 4х4.
 * При подаче массива другого размера необходимо бросить исключение
 * MyArraySizeException.
 * Далее метод должен пройтись по всем элементам массива,
 * преобразовать в int и просуммировать.
 * Если в каком-то элементе массива преобразование не удалось
 * (например, в ячейке лежит символ или текст вместо числа),
 * должно быть брошено исключение MyArrayDataException с детализацией,
 * в какой именно ячейке лежат неверные данные.
 * В методе main() вызвать полученный метод,
 * обработать возможные исключения MyArraySizeException и MyArrayDataException
 * и вывести результат расчета
 * (сумму элементов, при условии что подали на вход корректный массив).
 * Заметка: Для преобразования строки к числу используйте
 * статический метод класса Integer:
 * Integer.parseInt(сюда_подать_строку);
 * Заметка: Если Java не сможет преобразовать входную строку
 * (в строке число криво написано), то будет сгенерировано исключение
 * NumberFormatException.
 */

public class PracticalTask {
    public static void main(String[] args) {
        //test1: normal
        String[][] array1 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};
        try {
            int normalResult = calculateArray(array1);
            System.out.println("Test->1:" + normalResult);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Error->1 : " + e.getMessage());
        }

        //test2: bad size
        String[][] array2 = {
                {"1", "2", "3", "4"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};
        try {
            int normalResult2 = calculateArray(array2);
            System.out.println("Test->2 :" + normalResult2);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Error->2 : " + e.getMessage());
        }
        //test3: bad data
        String[][] array3 = {
                {"1", "2", "b", "4"},
                {"5", "a", "7", "8"},
                {"9", "10", "11", "c"},
                {"d", "14", "15", "16"}};
        try {
            int normalResult3 = calculateArray(array3);
            System.out.println("Test->3 :" + normalResult3);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Error->3 : " + e.getMessage());
        }

    }

    static int calculateArray(String[][] matrix) throws MyArraySizeException, MyArrayDataException {
        int sumMatrix = 0;
        // check matrix size by row
        if (matrix.length != 4) {
            throw new MyRuntimeException("matrix.length != 4");
        }
        for (int row = 0; row < matrix.length; row++) {
            String[] rowMatrix = matrix[row];
            if (rowMatrix.length != 4) {
                throw new MyRuntimeException("matrix.row[" + row + "] > != 4");

            }
        }
        // calculate matrix
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                String element = matrix[row][column];
                //convert String too int
                //increment sumMatrix
                try {
                    sumMatrix += Integer.valueOf(element);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("row: " + row + ", column: " + column + ",bad element: " + element);
                }
            }
        }
        return sumMatrix;
    }
}

