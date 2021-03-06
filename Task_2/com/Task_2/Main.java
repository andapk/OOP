package com.Task_2;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    public static DecimalFormat df = new DecimalFormat("0.00");

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

        district1.addNewOfficer(officer1);
        district1.addNewOfficer(officer2);
        district1.addNewOfficer(officer3);

        district2.addNewOfficer(officer4);
        district2.addNewOfficer(officer5);
        district2.addNewOfficer(officer6);
        district2.addNewOfficer(officer7);

        System.out.println("Information about District 1:\n" + district1
                + "\nInformation about District 2:\n" + district2);

        district2.removeOfficer(officer5);

        System.out.println("Average level in District 1: " + df.format(district1.calculateAvgLevelInDistrict()));
        System.out.println("Average level in District 2: " + df.format(district2.calculateAvgLevelInDistrict()));

        ArrayList<District> districtArray = new ArrayList<>();
        districtArray.add(district1);
        districtArray.add(district2);

        System.out.println("Officer count in both districts are: " + countOfficers(districtArray));

        System.out.println("Officer level in both districts are: "
                + df.format(calculateAverageLevelBothDistricts(districtArray)));

        System.out.println(whoIsBetter(districtArray).getTitle() + " is better, because it's average level is "
                + df.format(whoIsBetter(districtArray).calculateAvgLevelInDistrict()));
    }
    public static int countOfficers(ArrayList<District> districtArray) {
        int countOfficers = 0;
        for (District district : districtArray) {
            countOfficers = countOfficers + district.getOfficersInTheDistrict().length;
        }
        return countOfficers;
    }

    public static float calculateAverageLevelBothDistricts(ArrayList<District> districtArray) {
        float level = 0;
        for (District district : districtArray) {
            level = level + district.calculateAvgLevelInDistrict();
        }
        return level / districtArray.size();
    }

    public static District whoIsBetter(ArrayList<District> districtArray) {
        District district = null;
        for (int i = 0, j = i + 1; i < districtArray.size(); i++) {
            if (districtArray.get(i).calculateAvgLevelInDistrict() >
                    districtArray.get(j).calculateAvgLevelInDistrict()) {

                district = districtArray.get(i);

            } else if (districtArray.get(i).calculateAvgLevelInDistrict() <
                    districtArray.get(j).calculateAvgLevelInDistrict()) {

                district = districtArray.get(j);
            }
        }
        return district;
    }
    }

