package homework_22.homework22;

public class GroundTransport extends Transport{
    public GroundTransport(String color, String model) {
        super(color, model);
    }
    protected void drive(){
        System.out.println(model+ " Driving down the road");
    }
}

