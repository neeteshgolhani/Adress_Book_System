package com.bridgelabz;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class AddressBookManager {

    private Map<String, List<Person>> personsByCity;
    private Map<String, List<Person>> personsByState;

    public AddressBookManager() {
        personsByCity = new HashMap<>();
        personsByState = new HashMap<>();
    }

    public void addAddressBook(AddressBook addressBook) {
        List<Person> persons = addressBook.getPersons();
        persons.forEach(person -> {
            personsByCity.computeIfAbsent(person.getCity(), k -> new ArrayList<>()).add(person);
            personsByState.computeIfAbsent(person.getState(), k -> new ArrayList<>()).add(person);
        });
    }

    public List<Person> getPersonsByCity(String city) {
        return personsByCity.getOrDefault(city, Collections.emptyList());
    }

    public List<Person> getPersonsByState(String state) {
        return personsByState.getOrDefault(state, Collections.emptyList());
    }

}
