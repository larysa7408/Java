package lesson.lesson_05;

public class BooleanExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        boolean boll;
        boll = true; // правда
        boll = false; //ложь

        //Сравнение на равенство ==
        boll = x == y; // // X равен Y. -> утверждение не верно -> false
        System.out.println("x==y->" + boll);

        boll = x == 10;// X равен 10 -> утверждение верно -> true
        System.out.println("x == 10 ->" + boll);

        //сравнение на НЕравенство !=

        boolean bol2 = x != y;// X не равен Y -> утверждение верно -> true
        System.out.println("x != y ->" + bol2);

        bol2 = 10 != x; // 10 не равно X -> 10 не равно 10 -> утверждение не верно -> false
        System.out.println("x != 10 ->" + bol2);

        //   Больше чем >
        boolean bol3 = x > y; // X  больше чем Y ->  10 больше чем 5  -> true
        System.out.println("x > y ->" + bol3);
        bol3 = x > 10; // X  больше чем 10; -> 10 больше чем 10 - > false
        System.out.println("x>10->" + bol3);

        // Больше или равно >=
        boolean bol4 = x >= y; // X  больше или равно Y ->  10 больше или равно 5  -> true
        System.out.println("x >= y -> " + bol4);
        bol4 = x >= 10; //X  больше или равно 10 ->  10 больше или равно 10  -> true
        System.out.println(" x >= 10 ->" + bol4);


        //Меньше чем <
        boolean bol5 = x < y;// X  меньше чем Y ->  10 меньше чем 5  -> false

        //Меньше или равно <=
        bol5 = x <= 10; // X  меньше или равно 10 ->  10 меньше или равно 10  -> true
        System.out.println("x<=10->" + bol5);
        // ! логическое отрицание - меняет значение на противоположное
        boolean bol6 = true;
        System.out.println("true:" + bol6);
        bol6 = !true;
        System.out.println("!true: " + bol6);
        System.out.println("!false:" + false);

        System.out.println("! (4==5) - >" + !(4 == 5)); //  4 равно 5 -> false -> инвертируем !false -> true

        // | - логическое ИЛИ (OR) -> Возвращает true, если хотя бы одна часть выражения true
        // Рим столица Италии ИЛИ Берлин столица Англии -> true ИЛИ false -> true
        // Рим столица Италии ИЛИ Лондон столица Англии -> true ИЛИ true -> true
        // Рим столица Англии ИЛИ Лондон столица Италии -> false ИЛИ false -> false

        boolean bol8 = (2 < 5) | (11 == 10); // true | false -> true
        System.out.println("(2 < 5) | (11 == 10) ->" + bol8);
        bol8 = (2 > 5) | (11 == 10); // false | false -> false
        System.out.println("(2 > 5) | (11 == 10) ->" + bol8);

    }
}
