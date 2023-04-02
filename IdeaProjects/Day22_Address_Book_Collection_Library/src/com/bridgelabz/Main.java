package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        System.out.println("WELCOME TO ADDRESS BOOK SYSTEM ");
        AddressBook addressBook = new AddressBook();

        // Add some people to the address book
        addressBook.addPerson("John Doe");
        addressBook.addPerson("Jane Smith");
        addressBook.addPerson("John Doe"); // This should print a message that John Doe already exists

        // Create a Person object and add it to the address book
        Person person = new Person("Bob Johnson");
        addressBook.addPerson(person.toString());

        // Create another Person object with the same name and try to add it to the address book
        Person duplicatePerson = new Person("Bob Johnson");
        addressBook.addPerson(duplicatePerson.toString()); // This should print a message that Bob Johnson already exists
    }
}