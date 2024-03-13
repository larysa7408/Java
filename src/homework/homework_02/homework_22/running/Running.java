package homework.homework_02.homework_22.running;


public class Running {
    public static void main(String[] args) {
        Human human = new Human();
        AmateurAthlete amateurAthlete = new AmateurAthlete();
        ProfessionalAthlete professionalAthlete = new ProfessionalAthlete();

        human.run();
        System.out.println();
        amateurAthlete.run();
        System.out.println();
        professionalAthlete.run();
        System.out.println();
    }


}
