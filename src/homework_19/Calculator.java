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

    public static double addition(double var1, double var2){
        return var1 + var2;
    }public static double subtraction(double var1, double var2){
        return var1 - var2;
    }public static double multiplication(double var1, double var2){
        return var1 * var2;
    }public static double division(double var1, double var2){
        return var1 / var2;
    }
   public static double divide(double var1, double var2){
        if (var1==0)return Integer.MIN_VALUE;
        return var1/var2;
   }



}
