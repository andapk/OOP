package com.Task_3;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    public static DecimalFormat df = new DecimalFormat("0.00");

    public static int totalCrimes(ArrayList<Lawyer> lawyerArray) {
        int sumCrimes = 0;
        for (Lawyer lawyer : lawyerArray) {
            sumCrimes = sumCrimes + lawyer.getHelpedInCrimesSolving();
        }
        return sumCrimes;
    }

    public static Lawyer bestLawyer(ArrayList<Lawyer> lawyerList) {
        int max = Integer.MIN_VALUE;
        Lawyer bestLaw = null;
        for (int i = 0; i < lawyerList.size(); i++) {
            if (lawyerList.get(i).getHelpedInCrimesSolving() > Integer.MIN_VALUE) {
                max = lawyerList.get(i).getHelpedInCrimesSolving();
                bestLaw = lawyerList.get(i);
            }
        }
        return bestLaw;
    }
    public static void main(String[] args) {
        Officer officer1 =
                new Officer("John", "Smith",  73456, 27);
        Officer officer2 =
                new Officer("Ochen", "Perkins",  2456, 7);
        Officer officer3 =
                new Officer("Merry", "Cabral",  6574, 87);
        Officer officer4 =
                new Officer("Robert", "Smith",  3456, 17);
        Officer officer5 =
                new Officer("Bred", "Perkins",  12456, 65);
        Officer officer6 =
                new Officer("Mike", "Cabral",  65740, 87);
        Officer officer7 =
                new Officer("John", "Ocean",  456, 270);

        District district1 = new District("District 1", "Countryside", 1, new Officer[0]);
        District district2 = new District("District 2", "Big City", 2, new Officer[0]);

        Lawyer lawyer1 = new Lawyer("Bill", "Samss",111,23);
        Lawyer lawyer2 = new Lawyer("Jessica", "Snow", 112, 1);
        Lawyer lawyer3 = new Lawyer("Emily", "Winter", 113, 34);

        district1.addNewOfficer(officer1);
        district1.addNewOfficer(officer2);
        district1.addNewOfficer(officer3);

        district2.addNewOfficer(officer4);
        district2.addNewOfficer(officer5);
        district2.addNewOfficer(officer6);
        district2.addNewOfficer(officer7);

        System.out.println("Information about District 1:\n" + district1
                + "\nInformation about District 2:\n" + district2);
        System.out.format("Information about Lawyers. \n" +
                "First lawyer:\n %s" +
                "\nSecond lawyer:\n %s" +
                "\nThird lawyer:\n %s\n", lawyer1.toString(), lawyer2.toString(), lawyer3.toString());

        ArrayList<Lawyer> Lawyerarray = new ArrayList();
        Lawyerarray.add(lawyer1);
        Lawyerarray.add(lawyer2);
        Lawyerarray.add(lawyer3);


        System.out.println("The total number of the crimes in which solving the Lawyers were involved: "
                + totalCrimes(Lawyerarray));


        System.out.println("\nThe best lawyer:\n" + bestLawyer(Lawyerarray));
    }
}
