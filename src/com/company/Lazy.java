package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Lazy extends Students{
    public double salary = Math.round(ThreadLocalRandom.current().nextDouble(2000.0, 2500.0+1.0));
    public Lazy(String firstName, String lastName) {
        super(firstName, lastName);
    }
    public String toString(){
        return firstName + " " + lastName + "\tAttitude: Lazy" + "\tPrice: " + salary + "\nJava: " + java + "\t\tFront-end: " + frontEnd + "\nData Bases: " + dataBase + "\t\tMobile: " + mobile + "\nWordPress: " + wordPress + "\t\tPrestaShop: " + prestaShop + "\n";
    }
}
