package com.company;

public class ForeignCitizen extends Citizen {

    private String country;

    private String passportNumber;



    public ForeignCitizen(String firstName, String lastName,

                          int yearOfBirth, String country, String passportNumber) throws InvalidYearOfBirthException {

        super(firstName, lastName, yearOfBirth);

        this.country = country;

        this.passportNumber = passportNumber;

    }

}

