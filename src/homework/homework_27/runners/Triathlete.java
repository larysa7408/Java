package homework.homework_27.runners;


public class Triathlete implements Swimmer, Runner {
    private String name;

    public Triathlete(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Triathlete " + name + " runs");
    }

    @Override
    public void swim() {
        System.out.println("Triathlete " + name + " swims");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
