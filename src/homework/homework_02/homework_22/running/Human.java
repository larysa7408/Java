package homework.homework_02.homework_22.running;

public class Human {


    private final int runSpeed;
    private final int restTime;
    private String typeRunner = "Человек";


    public Human() {
        this.runSpeed = 10;
        this.restTime = 15;
    }

    public Human(int runSpeed, int restTime) {
        this.runSpeed = runSpeed;
        this.restTime = restTime;
    }

    public void run() {
        System.out.println(typeRunner + "бегает 10 км в час ");
        rest();
    }
    public void rest() {
        System.out.println(typeRunner+"у нужно "+ restTime + "минут для отдыха");
    }

    public int getRunSpeed() {
        return runSpeed;
    }


    public int getRestTime() {
        return restTime;
    }



    public void setTypeRunner(String typeRunner) {
        this.typeRunner = typeRunner;
    }
public String toString(){
        return typeRunner + "{" +
                "runSpeed =" + runSpeed +
                ", restTime= " + restTime +
                "}";
}
}
