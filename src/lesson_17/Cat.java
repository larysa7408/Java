package lesson_17;

public class Cat {
    // Все поля класса должны быть закрыты от прямого доступа из вне
    // помечены модификатором доступа private
    private String test;
    private String name;
    private int age;
    private int weight;


    public Cat(String test, String name, int age, int weight) {
        this.test = test;
        setName(name);
        setAge(age);
        this.weight = weight;
    }

    public void sayMeow() {
        System.out.println("Meow!!! " + name);
    }

    // Геттеры и сеттеры. Это методы возвращающие или изменяющие поля класса

    public String getName() { // геттер для поля Name
        return this.name;
    }

    public int getAge() {
        return age;
    }

    // Сеттеры
    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Некорректное значение возраста");
        } else {
            this.age = age;
        }
    }

    public void setName(String name) {

        if (name != null) {
            this.name = name;
            sayHello();
        } else {
            this.name = "default";
        }
    }

    private void sayHello() {
        System.out.println("Hello");
    }

}
