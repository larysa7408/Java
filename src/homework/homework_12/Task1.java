package homework.homework_12;

/* Задание 1

Написать метод, добавляющий во входную строку массива.
Метод должен вернуть массив, состоящий из самого короткого и самого длинного исходного массива.
Метод concat() возвращает новый массив
 */
public class Task1 {
    public static void main(String[] args) {
        String[] stringsArray = {"Gucci", "Prada", "Chanel", "ilvi", "LA", "DG"};
        String[]result=minAndMaxWords(stringsArray);
        System.out.println("Минимальное слово: " + result[0]);
        System.out.println("Максимальное слово: " + result[1]);

        System.out.println(" ============ Without null ==============");
        String[] res = arraySmallestAndLongestStrings(stringsArray);
        printArray(res);


        System.out.println(" \n============ testArray = null ==============");

        String[] testArray = null;
        res = arraySmallestAndLongestStrings(testArray);
        printArray(res);

        System.out.println(" \n============ null in array ==============");


        testArray = new String[]{"One", "Java", "Python", null, "butterfly", "JS"};
        res = arraySmallestAndLongestStrings(testArray);
        printArray(res);

        System.out.println(" \n============ first null in array ==============");


        testArray = new String[]{null, null, null, null, null, null, null, "JS"};
        testArray = new String[]{null, "One", "Java", "Python", null, "butterfly", "JS"};
        res = arraySmallestAndLongestStrings(testArray);
        printArray(res);

        System.out.println(" \n============ ALL null in array ==============");
        testArray = new String[]{null, null, null, null, null, null, null};
        res = arraySmallestAndLongestStrings(testArray);
        printArray(res);


    }

    public static String[] minAndMaxWords(String[] stringsArray) {
        String[] minAndMaxWordsArray = new String[2];
        int min = 0;
        int max = 0;
        for (int i = 0; i < stringsArray.length; i++) {
            if (stringsArray[i].length() < stringsArray[min].length() & stringsArray[i].length() != 0) {
                min = i;
            }

        }
        for (int i = 0; i < stringsArray.length; i++) {
            if (stringsArray[i].length() > stringsArray[max].length()) {
                max = i;
            }
            minAndMaxWordsArray[0] = stringsArray[min];
            minAndMaxWordsArray[1] = stringsArray[max];


        }

        return minAndMaxWordsArray;

    }

    public static String[] arraySmallestAndLongestStrings(String[] strings) {

        // 0. Проверить cсылку strings на null (а существует ли объект массива)
        // 1. Надо найти строку наим и наибольшей длинный.
        // 2. Создать массив из 2-х строк. Записать туда найденные строки и вернуть

        // Проблема null
        /*
        1. Если у нас нет null. Ссылка на массив - ок, все элементы в массиве - не null
        Алгоритм будет корректно работать
        2. Если ссылка на массив = null -> Мы возвращаем новый массив, заполненный значениями по умолчанию (null) {null, null}
        3. Если в массиве присутствуют элементы со значением null - нам надо обработать эту ситуацию.
        Иначе, при попытке получить длину такого элемента мы получим NPE
        Решение - создаем отдельный метод. Перебираем наш массив - как только находим НЕ null значение - присваиваем его в мин и макс строку
        4. Отдельный случай, требующий внимания - null в 0 элементе массива.
         */
        if (strings == null) {
            return new String[2]; // {null, null}
        }


        String minLen = findNotNullValue(strings);
        String maxLen = minLen;

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null && minLen != null && minLen.length() > strings[i].length()) {
                minLen = strings[i];
            }

            if (strings[i] != null && maxLen != null && maxLen.length() < strings[i].length()) {
                maxLen = strings[i];
            }
        }

        return new String[]{minLen, maxLen};
    }

    private static String findNotNullValue(String[] strings) {

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                return strings[i];
            }
        }
        return null;
    }

    public static void printArray(String[] strings) {
        System.out.print("[");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ((i < strings.length - 1) ? "; " : "]\n"));

        }
    }
}