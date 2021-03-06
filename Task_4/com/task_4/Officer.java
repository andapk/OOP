package com.task_4;


public class Officer extends Person{

    private   int officerID;
    private int crimeSolved;



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
        this.crimeSolved = crimeSolved;
    }

    public Officer() {

    }

    public Officer(String name, String surname,
                   int officerID, int crimeSolved) {

        this.crimeSolved = crimeSolved;
        this.officerID = officerID;
        super.setName(name);
        super.setSurname(surname);

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

@Override
    public String toString() {
        return super.getName() + " " + super.getSurname() +" "+officerID+" "+crimeSolved;
    }


}



