package homework.homework_32;

import java.util.Random;

public class Fruit {
    protected float weight;

    public Fruit(float fromWeight, float toWeight) {
        Random random = new Random();
        weight = fromWeight + random.nextFloat(toWeight - fromWeight);
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{ weight=" + weight + '}';
    }
}
