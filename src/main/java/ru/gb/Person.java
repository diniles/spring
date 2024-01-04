package ru.gb;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int dateOfBirth;

    public Person(String firstName, String lastName, int dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " was born in " + dateOfBirth;
    }
}
