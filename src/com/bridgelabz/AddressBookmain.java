package com.bridgelabz;

import java.util.Scanner;

public class AddressBookmain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program!");
        AddressBook addressBook = new AddressBook();
        // Add some sample contacts
        addressBook.addPerson(new Person("Alice", "alice@example.com", "1234567890"));
        addressBook.addPerson(new Person("Bob", "bob@example.com", "2345678901"));
        addressBook.addPerson(new Person("Charlie", "charlie@example.com", "3456789012"));
        // Delete a contact
        addressBook.deletePerson("Bob");
        // Display remaining contacts
        addressBook.displayContacts();
    }
}
