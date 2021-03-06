package com.task_4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Officer officer1 =
                new Officer("John", "Smith", 73456, 27);
        Officer officer2 =
                new Officer("Ochen", "Perkins", 2456, 7);
        Officer officer3 =
                new Officer("Merry", "Cabral", 6574, 87);
        Officer officer4 =
                new Officer("Robert", "Smith", 3456, 17);
        Officer officer5 =
                new Officer("Bred", "Perkins", 12456, 65);
        Officer officer6 =
                new Officer("Mike", "Cabral", 65740, 87);
        Officer officer7 =
                new Officer("John", "Ocean", 456, 270);

        District district1 = new District("District 1", "Countryside", 1, new Officer[0]);
        District district2 = new District("District 2", "Big City", 2, new Officer[0]);

        Lawyer lawyer1 = new Lawyer("Billy", "Samss", 111, 23);
        Lawyer lawyer2 = new Lawyer("Jessica", "Snow", 112, 1);
        Lawyer lawyer3 = new Lawyer("Emily", "Winter", 113, 34);

        district1.addNewOfficer(officer1);
        district1.addNewOfficer(officer2);
        district1.addNewOfficer(officer3);
        district1.addNewLawyer(lawyer1);
        district1.addNewLawyer(lawyer2);

        district2.addNewOfficer(officer4);
        district2.addNewOfficer(officer5);
        district2.addNewOfficer(officer6);
        district2.addNewOfficer(officer7);
        district2.addNewLawyer(lawyer3);

        System.out.println("Information about District 1:\n" + district1
                + "\nInformation about District 2:\n" + district2);

        ArrayList<District> district = new ArrayList();
        district.add(district1);
        district.add(district2);

        System.out.println(district);

        maxPersons(district);

    }

    public static void maxPersons(ArrayList<District> districtList) {
        for (int i = 0, j = i + 1; i < districtList.size(); i++) {

            if (districtList.get(i).getPersonsInTheDistrict().size() >
                    districtList.get(j).getPersonsInTheDistrict().size()) {

                System.out.format("%s has the highest amount of Persons",
                        districtList.get(i).getTitle());

            } else if (districtList.get(i).getPersonsInTheDistrict().size() <
                    districtList.get(j).getPersonsInTheDistrict().size()) {

                System.out.format("%s has the highest amount of Persons",
                        districtList.get(j).getTitle());

            } else if (districtList.get(i).getPersonsInTheDistrict().size() ==
                    districtList.get(j).getPersonsInTheDistrict().size() && i != j) {

                System.out.println("Person amount in both districts are equal!");
            }
        }
    }
}