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

        // create an address book manager and add the sample address books
        AddressBookManager addressBookManager = new AddressBookManager();
        addressBookManager.addAddressBook(addressBook1);
        addressBookManager.addAddressBook(addressBook2);

        // view persons by city
        List<Person> personsInChicago = addressBookManager.getPersonsByCity("Chicago");
        System.out.println("Persons in Chicago:");
        personsInChicago.forEach(person -> System.out.println(person.getName()));

        // view persons by state
        List<Person> personsInCA = addressBookManager.getPersonsByState("CA");
        System.out.println("Persons in California:");
        personsInCA.forEach(person -> System.out.println(person.getName()));
    }
}