package homework.homework_28;

/**
 * AIT-TR, cohort 42.1, Java Basic, HW #28
 *
 * @author Larysa Petrova
 * @version 20-Mar-24
 */
public class Transport {
    public static void main(String[] args) {
        Bicycle peugeot = new Bicycle("Peugeot", 120, 40);
        Bicycle.HandleBar handleBar = peugeot.new HandleBar();
        Bicycle.Seat seat = peugeot.new Seat();

        seat.up();
        seat.down();
        peugeot.start();
        handleBar.left();
        handleBar.right();
        seat.getSeatParam();
    }
}
