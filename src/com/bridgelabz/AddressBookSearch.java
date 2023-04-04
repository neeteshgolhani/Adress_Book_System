package com.bridgelabz;
import java.util.stream.*;
import java.util.List;
public class AddressBookSearch {
    public static List<Person> search(List<AddressBook> addressBooks, String cityOrState) {
        return addressBooks.stream()
                .flatMap(addressBook -> addressBook.getPersons().stream())
                .filter(person -> person.getCity().equalsIgnoreCase(cityOrState) || person.getState().equalsIgnoreCase(cityOrState))
                .collect(Collectors.toList());
    }
}
