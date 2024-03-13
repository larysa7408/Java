package homework.homework_23;
/*
Задача 1. Задание повышенной сложности. Спроектировать классы для создания системы складского учета. Предусмотрите такие операции, как поступление товара на склад, заказ и отгрузка товара со склада. Подсказка: как минимум, потребуются классы, моделирующие:

товар на складеProduct
приход товараToWarehouse
заказ товараOrder
отгрузка товараFromWarehouse
изготовление складаManager
 */


public class Product {
    private int id;
    private String name;
    private double price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +  name + ", " + price + '}';
    }
}
