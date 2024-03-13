package homework.homework_25.runners;
/*
Задача 1. Создать иерархию классов
человек -> спортсмен-любитель -> спортсмен-профи.
У человека есть метод бежать run().
 Обычный человек бежит со скоростью 10 км/час,
 любитель - 15, профи - 25.
 Также у бегунов есть необходимость в отдыхе.
 Человеку нужен отдых после пробежки 15 минут, любителям 10, профи 5.
 В методе бежать - вызвать метод,
 который будет выводить количество минут,
 необходимое для отдыха бегунам.

 */

public class Human {
    private int runSpeed;
    private int restTime;
    private String typeRunner = "Human";

    public Human() {
        this.runSpeed = 10;
        this.restTime = 15;
    }

    public Human(int runSpeed, int restTime) {
        this.runSpeed = runSpeed;
        this.restTime = restTime;
    }

    public void run() {
        System.out.println(typeRunner + " running at speed " + runSpeed);
        rest();
    }

    public void rest() {
        System.out.println(typeRunner + " needs " + restTime + " for relax");
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }

    public int getRestTime() {
        return restTime;
    }

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }

    public String getTypeRunner() {
        return typeRunner;
    }

    public void setTypeRunner(String typeRunner) {
        this.typeRunner = typeRunner;
    }
}
