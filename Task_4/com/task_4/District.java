package com.task_4;


import java.util.ArrayList;


public class District {

    private String title;
    private String city;
    private int districtID;
    private ArrayList<Person> personsInTheDistrict = new ArrayList<>();




    public District() {
    }

    public District(String title, String city, int districtID, Officer[] officersInTheDistrict) {
        this.title = title;
        this.city = city;
        this.districtID = districtID;

    }
    public ArrayList<Person> getPersonsInTheDistrict() {
        return personsInTheDistrict;
    }

    public void setPersonsInTheDistrict(ArrayList<Person> personsInTheDistrict) {
        this.personsInTheDistrict = personsInTheDistrict;
    }
    public boolean addNewPerson(Person person)
    {
        if(person != null) {
            personsInTheDistrict.add(person);
            return true;
        }
        return false;
    }

    public boolean removePerson(String name, String surname)
    {
        if(!name.isEmpty() && !surname.isEmpty()) {
            personsInTheDistrict.removeIf(person -> person.getName().equals(name)
                    && person.getSurname().equals(surname));
            return true;

        }
        return false;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDistrictID() {
        return districtID;
    }

    public void setDistrictID(int districtID) {
        this.districtID = districtID;
    }


    @Override
    public String toString() {
        return title + " " + city + " " + districtID;
    }
    public boolean addNewOfficer(Officer officer) {
        personsInTheDistrict.add(officer);
        return true;
    }

    public boolean addNewLawyer(Lawyer lawyer) {
        personsInTheDistrict.add(lawyer);
        return true;
    }

        public float calculateAvgLevelInDistrict(){
            ArrayList<Officer> officerList = new ArrayList<>();
            for (int i = 0; i < getPersonsInTheDistrict().size(); i++) {
                if (getPersonsInTheDistrict().get(i) instanceof Officer) {
                    officerList.add((Officer) getPersonsInTheDistrict().get(i));
                }
            }
            float sum = 0;
            for (Officer officer : officerList) {
                sum += officer.calculatedLevel(officer.getCrimeSolved());
            }
            return sum / officerList.size();
        }
    }


