package homework18;

public class Animal {
    public static final String ANIMALS = "African animals";
    private String name;
    private int age;
    private static int quantity;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        quantity++;
    }

    public String getName() {
        return name;
    }

    public static int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void sayHello() {
        System.out.println("Hello from African Animals!");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
