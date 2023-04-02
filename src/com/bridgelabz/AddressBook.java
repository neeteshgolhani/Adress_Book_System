package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
class AddressBookSystem {
    private HashMap<String, ArrayList<Person>> addressBooks = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);
    public void run() {
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Create a new address book");
            System.out.println("2. Add a person to an address book");
            System.out.println("3. Display all persons in an address book");
            System.out.println("4. Exit");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (option) {
                case 1:
                    createAddressBook();
                    break;
                case 2:
                    addPerson();
                    break;
                case 3:
                    displayAddressBook();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    private void createAddressBook() {
        System.out.println("Enter a name for the new address book:");
        String name = scanner.nextLine();

        if (addressBooks.containsKey(name)) {
            System.out.println("An address book with that name already exists.");
            return;
        }

        addressBooks.put(name, new ArrayList<>());
        System.out.println("Address book created.");
    }

    private void addPerson() {
        System.out.println("Enter the name of the address book:");
        String name = scanner.nextLine();

        if (!addressBooks.containsKey(name)) {
            System.out.println("No address book found with that name.");
            return;
        }

        ArrayList<Person> addressBook = addressBooks.get(name);
        String personName, address, phone;

        System.out.println("Enter person name:");
        personName = scanner.nextLine();

        System.out.println("Enter address:");
        address = scanner.nextLine();

        System.out.println("Enter phone number:");
        phone = scanner.nextLine();

        Person person = new Person(personName, address, phone);
        addressBook.add(person);

        System.out.println("Person added to address book.");
    }

    private void displayAddressBook() {
        System.out.println("Enter the name of the address book:");
        String name = scanner.nextLine();

        if (!addressBooks.containsKey(name)) {
            System.out.println("No address book found with that name.");
            return;
        }

        ArrayList<Person> addressBook = addressBooks.get(name);

        if (addressBook.isEmpty()) {
            System.out.println("No persons found in the address book.");
            return;
        }

        for (Person person : addressBook) {
            System.out.println(person);
        }
    }
}
