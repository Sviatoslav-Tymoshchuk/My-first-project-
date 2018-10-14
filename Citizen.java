package com.company;

public abstract class Citizen {

    private String firstName;

    private String lastName;

    private int yearOfBirth;



    public Citizen(String firstName, String lastName, int yearOfBirth) throws InvalidYearOfBirthException {

        this.firstName = firstName;

        this.lastName = lastName;

        if(yearOfBirth > 2018) {

            throw new InvalidYearOfBirthException();

        }

        this.yearOfBirth = yearOfBirth;

    }


}
