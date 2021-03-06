package com.Task_3;

    public class Officer {
        private   String name;
        private String surname;
        private   int officerID;
        private int crimeSolved;

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
            this.crimeSolved = crimeSolved;
        }

        public Officer() {

        }

        public Officer(String name, String surname,
                       int officerID, int crimeSolved) {

            this.crimeSolved = crimeSolved;
            this.officerID = officerID;
            this.name = name;
            this.surname = surname;

        }

        public String toString() {
            return name+ " "+surname+" "+officerID+" "+crimeSolved;
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


