package com.bridgelabz;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class AddressBookManager {

    private List<AddressBook> addressBooks;

    public AddressBookManager(List<AddressBook> addressBooks) {
        this.addressBooks = addressBooks;
    }

    public long getCountByCity(String city) {
        return addressBooks.stream()
                .flatMap(addressBook -> addressBook.getPersons().stream())
                .filter(person -> person.getCity().equalsIgnoreCase(city))
                .count();
    }

    public long getCountByState(String state) {
        return addressBooks.stream()
                .flatMap(addressBook -> addressBook.getPersons().stream())
                .filter(person -> person.getState().equalsIgnoreCase(state))
                .count();
    }
}
