package com.bridgelabz;
import java.util.HashSet;

public class AddressBook {
    private HashSet<String> names = new HashSet<>();

    public void addPerson(String name) {
        if (names.contains(name)) {
            System.out.println(name + " already exists in the address book.");
        } else {
            names.add(name);
            System.out.println(name + " added to the address book.");
        }
    }
}
