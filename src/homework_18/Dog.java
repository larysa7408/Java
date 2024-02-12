package homework_18;

/*
Задача 0
 Написать класс Собака. каждая собака обязательно должна иметь имя и высоту прыжка
Должна уметь прыгать и должна уметь тренироваться.
При каждой тренировке высота прыжка увеличивается максимум на 10 сантиметров.
Максимальная высота прыжка, которую может натренировать собака, не может быть больше,
чем двукратная высота первоначального прыжка. Также должен быть метод взять барьер.
 В качестве метода используйте высоту барьера.
Если собака в состоянии преодолеть этот барьер - прыгнет.
Если собака не в состоянии, необходимо проверить помощь в тренировках
(будет ли хорошая собака в состоянии в состоянии взять барьер).
Если да -> идем тренироваться -> барьер возьмем
 */
public class Dog {
    //task1
    private String name;
    private double jumpHeight;

    public Dog(String name, double jumpHeight) {

        this.name = name;
        this.jumpHeight = jumpHeight;
    }

    public void jump(double obstacleHeight) {
        if (obstacleHeight <= jumpHeight) {
            System.out.println(name + " перепрыгнул барьер высотой " + obstacleHeight + "m");
        } else {
            System.out.println(name + " не смог перепрыгнуть барьер высотой " + obstacleHeight + "m");
        }
    }

    public static void main(String[] args) {
        Dog Foma = new Dog("Foma", 3);

        double[] obstacles = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < obstacles.length; i++) {
            System.out.println("Барьер" + (i + 1) + " высотой " + obstacles[i] + "m");
            Foma.jump(obstacles[i]);
            System.out.println();

        }
    }


}

