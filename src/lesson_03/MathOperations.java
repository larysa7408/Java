package lesson_03;

public class MathOperations {
    public static void main(String[] args) {

        int var1 = 20;
        int var2 = 7;

        int result;

        //сложение
        result = var1 + var2; // результат вычеслений выражения в правой части присваевается в переменную в левую часть присвоения
        System.out.println("result " + result);
        result = 15 + 6;
        System.out.println("result " + result);
        int result2 = var1 + var2; // обьявление и инициализация результатом вычисления

        // вычитание
        result = var1 - var2;
        System.out.println("result -: " + result);

// умножение
        result = var1 * var2;
        System.out.println("multResult:" + result);

// / - целочисленное деление
        //20 / 7 -> 2 целые и в остатке 6;
        result = var1 / var2;
        System.out.println("devResult:" + result);

        // % остаток от деления
        result = var1 % var2;
        System.out.println("restResult:" + result);

        System.out.println("Целочисленное деление 4 / 2:" + (4 / 2)); //2
        System.out.println("Остаток от деления 4 % 2:" + (4 % 2)); //0

        System.out.println((5 / 10));
        System.out.println((5 % 10));


// 28 / 10 -> 2 целая и 8 в остатке -> 2 * 10 + 8


        System.out.println("=================================\n");


// / операция деления
        double doubleVar = 20.0d; // явно указано что число записано в формате double
        double doubleSeven = 7.0; // все числа, записанные в нашем коде с "." считаются числами в формате double


        double doubleResult = doubleVar / doubleSeven;
        System.out.println("doubleResult dev =" + doubleResult);

//Форматированный вывод

        // %d -шаблон для цифры (целочисленное)
        // %f - шаблон для числа с плавающей точкой
        // %.2f - вывести число с плавающей точкой. Отобразить ровно 2 знака после запятой

        int a = 20;
        int b = 7;
        int intResult = a / b;
        System.out.println("Результат деления" + a + " на " + b + " равен  = " + intResult);
        System.out.printf("Результат деления %d на %d  равен  = %d\n", a, b, intResult);
// \n -> перевода каретки (курсора) на новую строку

        System.out.println("Что нибудь!");
        // Форматированный вывод. Мы используем шаблон вывода и список значений которые будут поставленны в этот шаблон

        System.out.printf("Округленный вывод результата деления %.2f\n", doubleResult);
        System.out.printf("Округленный вывод результата деления %.2f\n", 2.855);
        System.out.printf("Округленный вывод результата деления %.5f\n", 2.1);

//IEEE 754

        //проблемы с double
        double x = 0.1;
        double y = 0.2;
        double z = x + y; // 0.3
        System.out.printf(" z =" + z); // z = 0.3000000000004
        x = 1.0;
        y = 4.0;
        z = x / y; //0.3333333333333
        System.out.println(z);


    }
}
