package homework.homework_36;

/**
 * AIT-TR, cohort 42.1, Java Basic, HW #36
 *
 * @author Larysa Petrova
 * @version 12-Apr-24
 */

public class Telephone {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Raskolnikov", +4057_67_78);
        phoneBook.add("Raskolnikov", +4057_46_98);
        phoneBook.add("Myronovich", +4057_97_45);
        phoneBook.add("Avakov", +4057_98_34);
        phoneBook.add("Philipov", +4057_23_22);
        phoneBook.add("Avakov", +4057_00_99);
        phoneBook.add("Ileeva", +4057_65_22);

        System.out.println("Phone Number for Raskolnikov: " + phoneBook.get("Raskolnikov"));
        System.out.println("Phone Number for Myronovich: " + phoneBook.get("Myronovich"));
        System.out.println("Phone Number for Avakov: " + phoneBook.get("Avakov"));
        System.out.println("Phone Number for Philipov: " + phoneBook.get("Philipov"));
        System.out.println("Phone Number for Ileeva: " + phoneBook.get("Ileeva"));
    }
}
