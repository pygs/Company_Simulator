package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Employee extends Employees{
    public String speciality;
    public double salary = Math.round(ThreadLocalRandom.current().nextDouble(2500.0, 4000.0+1.0));
    public Employee(String firstName, String lastName, String speciality){
        super(firstName, lastName);
        this.speciality = speciality;

    }
    public String toString(){
        return firstName + " " + lastName + "\tSpeciality: " + speciality + "\tPrice: " + salary + "\nJava: " + java + "\t\tFront-end: " + frontEnd + "\nData Bases: " + dataBase + "\t\tMobile: " + mobile + "\nWordPress: " + wordPress + "\t\tPrestaShop: " + prestaShop + "\n";
    }
}
