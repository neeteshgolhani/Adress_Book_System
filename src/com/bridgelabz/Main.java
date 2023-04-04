package com.bridgelabz;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("WELCOME TO ADDRESS BOOK SYSTEM ");
        // create some sample address books and persons
        AddressBook addressBook1 = new AddressBook(Arrays.asList(
                new Person("John Smith", "New York", "NY"),
                new Person("Jane Doe", "Los Angeles", "CA"),
                new Person("Bob Johnson", "San Francisco", "CA")
        ));

        AddressBook addressBook2 = new AddressBook(Arrays.asList(
                new Person("Alice Brown", "Chicago", "IL"),
                new Person("Charlie Green", "Chicago", "IL"),
                new Person("David Lee", "Boston", "MA")
        ));

        // search for persons in a specific city or state across all address books
        List<AddressBook> addressBooks = Arrays.asList(addressBook1, addressBook2);
        List<Person> searchResult = AddressBookSearch.search(addressBooks, "Chicago");

        // print the search result
        System.out.println("Search result:");
        searchResult.forEach(person -> System.out.println(person.getName()));
    }
}
