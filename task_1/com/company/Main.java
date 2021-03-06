package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static Officer officerCreator() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter Officer's name: ");
        String name = input.nextLine();
        System.out.print("Please, enter Officer's surname: ");
        String surname = input.nextLine();
        System.out.print("Please, enter Officer's ID: ");
        int officerID = Integer.parseInt(input.nextLine());
        System.out.print("Please, enter Officer's working district: ");
        String workingDistrict = input.nextLine();
        System.out.print("Please, enter Officer's crimes solved: ");
        int crimeSolved = Integer.parseInt(input.nextLine());

        input.close();

        return new Officer(name, surname,workingDistrict, officerID,  crimeSolved);
    }
    public static void main(String[] args) {
        Officer newOfficer =
        new Officer("John", "Smith", "District 12", 73456, 27);

        Officer newOfficer1 =
                new Officer("Ochen", "Perkins", "District 2", 2456, 7);

        Officer newOfficer2 =
                new Officer("Merry", "Cabral", "District 7", 6574, 87);


        ArrayList<Officer> Distric99 = new ArrayList<>();
        Distric99.add(newOfficer);
        Distric99.add(newOfficer1);
        Distric99.add(newOfficer2);

        Officer officer4 = officerCreator();
        Distric99.add(officer4);
        System.out.println("New arraylist:\n" + Distric99);

        LevelscalculatedAndCount(Distric99, 1);
        System.out.println("Is there officer named John? " +
                findByName(Distric99, "[Jj]ohn"));
    }


    public static void LevelscalculatedAndCount(ArrayList<Officer> district99, int level) {
        int count = 0;
        int count2or3Level = 0;
        for (Officer officer : district99) {
            if (officer.calculatedLevel(officer.getCrimeSolved()) == level) {
                count++;
            } else {
                count2or3Level++;
            }
        }
        System.out.format("There are %d officers in the District 99 with level 1.\n" +
                "There are %d officers with levels, that are larger than 1.\n", count, count2or3Level);
    }

    public static boolean findByName(ArrayList<Officer> district99, String namePattern) {
        for (Officer officer : district99) {
            if (officer.getName().matches(namePattern)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
