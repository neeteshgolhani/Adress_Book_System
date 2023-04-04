package com.bridgelabz;
import java.util.List;

public class AddressBook {
        private List<Person> persons;

        public AddressBook(List<Person> persons) {
            this.persons = persons;
        }

        public List<Person> getPersons() {
            return persons;
        }
    }