package com.company;

public class Main {



    public static void main(String[] args) {



        try {

            PolishCitizen c = new PolishCitizen("Sviatoslav", "Tymoshchuk",

                    "90092817196");

            ForeignCitizen f = new ForeignCitizen("John", "Smith",

                    1955, "UK", "123456");

            EstonianCitizen r = new EstonianCitizen("Otto", "Braun",

                    "37605030299");



        } catch(InvalidYearOfBirthException e) {

            System.out.println("Nie udało się utworzyć obywatela - rok urodzenia nieprawidłowy");

        }





    }

}