package lesson.lesson_02.lesson_16;

public class Cat {
    int maxVolume;
    int realVolume;


    public Cat(int maxVolume) {
        this.maxVolume = maxVolume;
        this.realVolume = 0;

    }

    public void eat(Plate plate) {
        int food = plate.amountFood();
        if (food > maxVolume - realVolume) {
            food = maxVolume - realVolume;

        }
        realVolume += food;
        plate.decrease(food);
    }

}

