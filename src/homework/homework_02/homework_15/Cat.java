package homework.homework_02.homework_15;
/*
Задача 1.
Доработать написанный на занятии класс Cat,
дав коту возможность ходить walk() и бегать run().
Во время хождения и бега кот расходует энергию, которую получает, когда ест.
 */

public class Cat {
    String name;
    int energy;

    public Cat(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    void eat() {
        System.out.println("Я ем вкусный паштет");
        energy++;

    }

    void walk() {
        System.out.println("Я хожу");
        energy--;
    }

    void run() {
        while (energy < 70) {
            System.out.println("У меня нет энергии бежать");
            System.out.println(" Моя энергия: " + energy + "Меня нужно покормить");
            eat();
        }
        System.out.println("Я бегу");
        energy -= 50;
    }

    String getName() {
        return "Я кошечка : " + name + " моя энергия: " + energy;
    }
}
