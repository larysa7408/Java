package homework_20;

public class OnlineStore {
    public static void main(String[] args) {
        Product product = new Product("Постельное белье ", 99.99);
        System.out.println(product. toString());
        product.inStock();
        product.notStock();

        System.out.println("=====================");

        Electronics electronics=new Electronics("Пылесос", 1499.00, "Philips DR-19", "Germany");
        System.out.println(electronics.toString());
        electronics.inStock();
        electronics.notStock();

        System.out.println("=====================");

        Clothing clothing = new Clothing("Блузка",29.99, "S", "Red");
        System.out.println(clothing.toString());
        clothing.inStock();
        clothing.notStock();

    }


}
