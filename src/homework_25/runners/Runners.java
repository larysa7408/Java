package homework_25.runners;

/**
 * AIT-TR, cohort 42.1, Java Basic, HW #25
 *
 * @author Larysa Petrova
 * @version 13-Mar-24
 */


public class Runners {
    public static void main(String[] args) {
        Human human = new Human();
        AmateurRunner amateurRunner = new AmateurRunner();
        ProfRunner profRunner = new ProfRunner();

        human.run();
        System.out.println();
        amateurRunner.run();
        System.out.println();
        profRunner.run();
        System.out.println();
    }
}
