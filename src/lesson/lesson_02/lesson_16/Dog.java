package lesson.lesson_02.lesson_16;

public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    void eat() {
        System.out.println("Я ем вкусную косточку");
        weight++; //набрала вес
    }

    void run() {
        // Проверяем - позволяет ли вес собаке бегать сейчас
        // если нет - отправить ее поесть.
        // После еды - проверить пункт 1.
        // цикл?

        while (weight < 3) {
            System.out.println("Сорян! Я слишком худая и голодная! Бужать не могу...");
            System.out.println("Мой вес:" + weight + "Надо покушать");
            eat();
        }


        System.out.println("Я бегу!");
        weight -= 2;// побегала скинула вес
    }

    String whoAmI() { //высчитываем имя и вес
        return "I am dog: " + this.name + "my weight" + weight;
    }

}
