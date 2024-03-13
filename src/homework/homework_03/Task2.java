package homework.homework_03;
/* Задача 2
Пусть цена товара A обычно составляет 1000 Euro, и товара B составляет 500 Euro.
Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.
Выведите на экран переменную, которая соответствует стоимости суммы A+B со скидкой.
Отдельно выведите на экран сумму скидки от этой покупки (в деньгах).
 */
public class Task2 {
    public static void main(String[] args) {

        double priceA = 1000;
        double priceB = 500;
        int discount = 10;

        //скидка в деньгах
        double discountMoney = (priceA + priceB) * discount / 100;
        System.out.println("discountMoney: " + discountMoney);

        //два варианта
        double priceWithDiscount = (priceA + priceB) - discountMoney;
        System.out.println("priceWithDiscount: " + priceWithDiscount);

        priceWithDiscount = (priceA + priceB) * (100 - discount) / 100;
        System.out.println("Цена товаров со скидкой: " + priceWithDiscount + " Евро");

    }
}
