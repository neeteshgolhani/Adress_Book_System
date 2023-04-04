package com.bridgelabz;
import java.util.Arrays;

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
        AddressBookManager addressBookManager = new AddressBookManager(Arrays.asList(addressBook1, addressBook2));

        // get count by city
        long countInChicago = addressBookManager.getCountByCity("Chicago");
        System.out.println("Number of persons in Chicago: " + countInChicago);

        // get count by state
        long countInCA = addressBookManager.getCountByState("CA");
        System.out.println("Number of persons in California: " + countInCA);
    }
}