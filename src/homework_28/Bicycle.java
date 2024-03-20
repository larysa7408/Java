package homework_28;

public class Bicycle {
    private String model;
    private int weight;
    private int seatPostDiameter;

    public Bicycle(String model, int weight, int seatPostDiameter) {
        this.model = model;
        this.weight = weight;
        this.seatPostDiameter = seatPostDiameter;
    }

    public void start() {
        System.out.println("GO!");
    }

    public class HandleBar {
        public void right() {
            System.out.println("HandleBar right! ");
        }

        public void left() {
            System.out.println("HandleBar left! ");
        }
    }

    public class Seat {
        public void up() {
            System.out.println("Seat up!");
        }

        public void down() {
            System.out.println("Seat down!");
        }

        public void getSeatParam() {
            System.out.println("Seat parameter: seat post diameter = " + Bicycle.this.seatPostDiameter);
        }
    }
}
