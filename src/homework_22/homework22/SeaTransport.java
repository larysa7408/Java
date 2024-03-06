package homework_22.homework22;

public class SeaTransport extends Transport{
    public SeaTransport(String color, String model) {
        super(color, model);
    }
    protected void sail(){
        System.out.println(model+ " Sails on the sea");
    }
}
