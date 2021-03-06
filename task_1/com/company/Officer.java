package com.company;

public class Officer {
    private   String name;
    private String surname;
    private   int officerID;
    private int crimeSolved;

    public String getWorkingDistrict() {
        return workingDistrict;
    }

    public void setWorkingDistrict(String workingDistrict) {
        this.workingDistrict = workingDistrict;
    }

    private String workingDistrict;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getOfficerID() {
        return officerID;
    }

    public void setOfficerID(int officerID) {
        this.officerID = officerID;
    }

    public int getCrimeSolved() {
        return crimeSolved;
    }

    public void setCrimeSolved(int crimeSolved) {
        if (crimeSolved<0)
        {
            throw new RuntimeException("Value is less then zero!");
        }
        this.crimeSolved = crimeSolved;
    }

    public Officer() {

    }

    public Officer(String name, String surname,String workingDistrict,
                    int officerID, int crimeSolved) {

        if (crimeSolved<0)
        {
            throw new IllegalArgumentException("Value is less than zero!");
        }

        this.crimeSolved = crimeSolved;
        this.officerID = officerID;
        this.name = name;
        this.surname = surname;
        this.workingDistrict=workingDistrict;

    }

    public String toString()
    {
        return getName() + " " + getSurname() +
                " " + getOfficerID() + " " +
                getWorkingDistrict() + "  " + getCrimeSolved()+" ";
    }
    public int calculatedLevel(int crimesSolved) {
        int officeLevel=0;
        if(crimesSolved<20){
            officeLevel=1;
        } else if(crimesSolved>=20 && crimesSolved<40){
            officeLevel=2;
        } else {
            officeLevel=3;
        }
        return officeLevel;
    }
}

