package com.company;

public class EstonianCitizen extends Citizen {


    public EstonianCitizen(String firstName, String lastName, String epesel) throws InvalidYearOfBirthException {
        super(firstName, lastName, epeselToYear(epesel));



        String c = epesel.substring(0, 1);

        String d = epesel.substring(1, 2);

        String e = epesel.substring(2, 3);

        String f = epesel.substring(3, 4);

        String g = epesel.substring(4, 5);

        String h = epesel.substring(5, 6);

        String i = epesel.substring(6, 7);

        String j = epesel.substring(7, 8);

        String k = epesel.substring(8, 9);

        String l = epesel.substring(9, 10);

        String m = epesel.substring(10, 11);


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


        int result;


        result = 1 * charPesel1 + 2 * charPesel2 + 3 * charPesel3 + 4 * charPesel4 + 5 * charPesel5 +

                6 * charPesel6 + 7 * charPesel7 +

                8 * charPesel8 + 9 * charPesel9 + 1 * charPesel10;

        if (result % 11 == charPesel11) {

            System.out.println(" Estonian PESEL is Ok");

        } else System.out.println("Estonian PESEL Error");

        System.out.println("Year of birth Estonian is:" + epeselToYear(epesel));



    }

    private static int epeselToYear(String epesel) {
        String a = epesel.substring(1, 3);

        String b = epesel.substring(0, 1);


        int year = Integer.valueOf(a);

        if (b.equals("1") || b.equals("2")) {

            year += 1800;

        } else if (b.equals("3") || b.equals("4")) {

            year += 1900;
        }else if (b.equals("5") || b.equals("6")){

            year += 2000;


        }

        return year;

    }

}
