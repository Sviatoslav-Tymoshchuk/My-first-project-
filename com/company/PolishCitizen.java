package com.company;

public class PolishCitizen extends Citizen {

    private String pesel;



    public PolishCitizen(String firstName, String lastName, String pesel) throws InvalidYearOfBirthException {

        super(firstName, lastName, peselToYearOfBirth(pesel));


        this.pesel = String.valueOf(pesel);

        String c = pesel.substring(0, 1);

        String d = pesel.substring(1, 2);

        String e = pesel.substring(2, 3);

        String f = pesel.substring(3, 4);

        String g = pesel.substring(4, 5);

        String h = pesel.substring(5, 6);

        String i = pesel.substring(6, 7);

        String j = pesel.substring(7, 8);

        String k = pesel.substring(8, 9);

        String l = pesel.substring(9, 10);

        String m = pesel.substring(10, 11);



        int charPesel1 = Integer.valueOf(c);

        int charPesel2 = Integer.valueOf(d);

        int charPesel3 = Integer.valueOf(e);

        int charPesel4 = Integer.valueOf(f);

        int charPesel5 = Integer.valueOf(g);

        int charPesel6 = Integer.valueOf(h);

        int charPesel7 = Integer.valueOf(i);

        int charPesel8 = Integer.valueOf(j);

        int charPesel9 = Integer.valueOf(k);

        int charPesel10 = Integer.valueOf(l);

        int charPesel11 = Integer.valueOf(m);

        System.out.println("Year of birth Polish is:" + peselToYearOfBirth(pesel));



        int result;



        result = 9 * charPesel1 + 7 * charPesel2 + 3 * charPesel3 + 1 * charPesel4 + 9 * charPesel5 +

                7 * charPesel6 + 3 * charPesel7 +

                1 * charPesel8 + 9 * charPesel9 + 7 * charPesel10;

        if (result % 10 == charPesel11) {

            System.out.println(" Polish PESEL is Ok");

        } else System.out.println("Polish PESEL is incorrect");

    }



    private static int peselToYearOfBirth(String pesel) {

        // "85031401234" -> 1985

        // "04231701234" -> 2004

        String a = pesel.substring(0, 2);

        String b = pesel.substring(2, 3);



        int year = Integer.valueOf(a);

        if(b.equals("2") || b.equals("3")) {

            year += 2000;

        } else {

            year += 1900;

        }

        return year;


    }





    }










