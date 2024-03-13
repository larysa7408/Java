package lesson.lesson_02.lesson_22;

public class Cat extends Animal {

    ///переопределение
    @Override
    public void voice() {
        System.out.println("Cat say MEOW!");
    }

    public void eat() {
        System.out.println("Cat eating");
    }
}
