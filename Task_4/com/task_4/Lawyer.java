package com.task_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Lawyer extends Person  {

    private int lawyerID;
    private int HelpedInCrimesSolving;


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
        super.setName (name);
        super.setSurname (surname);
        this.lawyerID = lawyerID;
        this.HelpedInCrimesSolving = helpedinCrimeSolwing;
    }

    public Lawyer() {

    }
@Override
    public String toString() {
        return super.getName() + " " + super.getSurname() + " " +getLawyerID() +
                " " + getHelpedInCrimesSolving();
    }

//    public boolean addNewLawyer(Lawyer lawyer) {
//        ArrayList<Lawyer> sourceList = new ArrayList<>(Arrays.asList(getLawyer()));
//        sourceList.add(lawyer);
//        setLawyer(sourceList.toArray(new Lawyer[0]));
//        return true;
//    }
}
//Classname.ArrayListname.add(objectname)
