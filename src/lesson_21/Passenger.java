package lesson_21;

public class Passenger {

    private static int couterId;
    private final int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Passenger(String name) {

        this.name = name;
        this.id=++couterId;
    }
public int getId(){
        return id;
}

}
