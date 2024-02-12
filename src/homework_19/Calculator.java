package homework_19;
/*
Задача 2
Класс «Калькулятор» создаёт класс Калькулятор,
 который будет выполнять базовые арифметические операции:
 сложение, вычитание, умножение и деление.

Класс должен соблюдать: Статические методы для каждой операции,
 вводящие два аргумента и возвращающие результаты операции
 */


public class Calculator {
    double var1;
    double var2;
    public static double addition(double var1, double var2){
        return var1 + var2;
    }public static double subtraction(double var1, double var2){
        return var1 - var2;
    }public static double multiplication(double var1, double var2){
        return var1 * var2;
    }public static double division(double var1, double var2){
        return var1 / var2;
    }




}
