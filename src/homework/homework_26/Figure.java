package homework.homework_26;
/*
Задача 1.
Создайте абстрактный класс Figure с абстрактными методами
для вычисления площади и периметра.
Реализуйте классы-наследники Circle, Rectangle, и Triangle.
Убедитесь, что все классы правильно вычисляют площадь и периметр.
Создайте массив объектов Figure и вычислите общую площадь
и периметр всех фигур в массиве.
 */

public abstract class Figure {
    
    abstract double calculateArea();
    abstract double calculatePerimeter();
}
