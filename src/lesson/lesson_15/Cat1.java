package lesson.lesson_15;

public class Cat1 {
    String name;
    String color;
    int age;
    int volume;
    int food;


    public Cat1(String name, String color, int age, int volume) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.volume = volume;

    }

    public Cat1() {

    }

    public void voice() {
        System.out.println("Meow!");
    }

    public void eat(int food) {
        System.out.println("Я кушаю");
        this.food = food;
      volume++;
    }

    public double satiated() {
        return (double) food / volume * 100;
    }


}
