package com.bridgelabz;
    public class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Person)) {
                return false;
            }
            Person person = (Person) obj;
            return name.equals(person.name);
        }
    }