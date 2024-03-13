package lesson.lesson_02.lesson_22;

public class Hamster extends Animal {
    @Override //аннотация
    public void voice() {
        System.out.println("Hamster say  Hrum-Hrum");
    }

    public void voice(String string) {
        System.out.println("Hamster say: " + string);
    }

    @Override
    public String toString() {
        return "Hamster";
    }
}
