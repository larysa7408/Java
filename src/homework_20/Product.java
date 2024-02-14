package homework_20;

public class Product {
   String name;
     Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double newPrice) {
        this.price = newPrice;
    }

    public void inStock(){
        System.out.println("Товар: " + name + ", в наличии");
    }

    public void notStock(){
        System.out.println("Упс!!! Товар: "+ name + " к сожалению, нет в наличии");
    }

    public String toString() {
        return "Товар :" + "  " + name + " цена " + price;
    }

}
