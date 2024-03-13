package homework.homework_02.homework_22.homework22;

public class Cat extends Animal {
    protected int age;

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    public void meow() {
        System.out.println(name + " Meow!!!");
    }

    @Override
    public void sleep() {
        System.out.println(name + " Sleep");
    }
}
