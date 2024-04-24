package homework.homework_36;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void add(String surname, int phoneNumber) {
        if (!contacts.containsKey(surname)) {
            contacts.put(surname, new ArrayList<>());
        }
        contacts.get(surname).add(String.valueOf(phoneNumber));
    }

    public List<String> get(String surname) {
        return contacts.getOrDefault(surname, Collections.emptyList());
    }

}
