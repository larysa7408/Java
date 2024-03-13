package lesson.lesson_02.lesson_11;

public class MethodsWithReturnValues {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        sumNumbers(x, y);

        int sum = sumNumbersWithReturn(x, y);
        System.out.println("sum:" + sum);
        System.out.println(sumNumbersWithReturn(10, 45));

        int[] testArray = {11, 55, 34, 65, 43};
        int findMe = 100;

        boolean isExist = isDigitInArray(testArray, findMe);
        System.out.println("is digit in Array?->" + isExist);


    }// Methods area

//Написать метод который определяет присуствует ли число в массиве
//тип возвращаемого значения boolean
//Если число есть возвращаем true если нет  false

    public static boolean isDigitInArray(int[] numbers, int searchMe) {

        //1.Перебрать значение в массив
        //2.Сравнить текущий элемент в искомым значением
        //3.Если равны - вернуть из метода true
        //4.А если ни одно из значений не равно то вернуть false


        for (int i = 0; i < numbers.length; i++) {
            //11,55,34,65,43 |||ищем 100
            if (numbers[i] == searchMe) {
                return true;
            }
        }
            System.out.println("Перебрали все значения.Совпадений не найдено");
            return false;
        }


        public static void sumNumbers ( int i, int k){
            int result = i + k;

            System.out.println(result);
        }

        public static int sumNumbersWithReturn ( int i, int k){
            int result = i + k;
            return result;


        }


}

