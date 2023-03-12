package com.bridgelabz;
import java.util.Scanner;
public class Contact {
    private String name;
    private String phone;
    private String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
 class AddressBook {
    private Contact[] contacts;
    private int size;

    public AddressBook(int capacity) {
        this.contacts = new Contact[capacity];
        this.size = 0;
    }

    public void addContact(Contact contact) {
        if (size == contacts.length) {
            System.out.println("Address book is full.");
        } else {
            contacts[size] = contact;
            size++;
        }
    }

    public void displayContacts() {
        for (int i = 0; i < size; i++) {
            Contact contact = contacts[i];
            System.out.println(contact.getName() + ", " + contact.getPhone() + ", " + contact.getEmail());
        }
    }

    public void updateContact(String name) {
        for (int i = 0; i < size; i++) {
            Contact contact = contacts[i];
            if (contact.getName().equalsIgnoreCase(name)) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter new phone number: ");
                String phone = scanner.nextLine();
                contact.setPhone(phone);

                System.out.print("Enter new email: ");
                String email = scanner.nextLine();
                contact.setEmail(email);

                System.out.println("Contact updated successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }
}
class AddressBookMain {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook(10);
        Scanner scanner = new Scanner(System.in);

        // Add some contacts to the address book for testing
        addressBook.addContact(new Contact("John Doe", "1234567890", "johndoe@example.com"));
        addressBook.addContact(new Contact("Jane Smith", "0987654321", "janesmith@example.com"));

        System.out.print("Enter name of contact to update: ");
        String name = scanner.nextLine();

        addressBook.updateContact(name);

        addressBook.displayContacts();
    }
}
