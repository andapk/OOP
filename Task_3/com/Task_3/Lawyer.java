package com.Task_3;
public class Lawyer {

    private String name;
    private String surname;
    private int lawyerID;
    private int HelpedInCrimesSolving;

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

    public int getLawyerID() {
        return lawyerID;
    }

    public void setLawyerID(int lawyerID) {
        this.lawyerID = lawyerID;
    }

    public int getHelpedInCrimesSolving() {
        return HelpedInCrimesSolving;
    }

    public void setHelpedInCrimesSolving(int helpedinCrimeSolwing) {
        this.HelpedInCrimesSolving = helpedinCrimeSolwing;
    }

    public Lawyer(String name, String surname, int lawyerID, int helpedinCrimeSolwing) {
        this.name = name;
        this.surname = surname;
        this.lawyerID = lawyerID;
        this.HelpedInCrimesSolving = helpedinCrimeSolwing;
    }
    public Lawyer(){

    }

    public String toString() {
        return "Name: " + getName() + "Surname: " + getSurname() + "\nLawyer ID: " + getLawyerID() +
                "\nHelped in crimes solving: " + getHelpedInCrimesSolving() + "\n";
    }
}
