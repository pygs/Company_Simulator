package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Normal extends Students{
    public double salary = Math.round(ThreadLocalRandom.current().nextDouble(2500.0, 4000.0+1.0));
    public Normal(String firstName, String lastName) {
        super(firstName, lastName);
    }
    public String toString(){
        return firstName + " " + lastName + "\tAttitude: Normal" + "\tPrice: " + salary + "\nJava: " + java + "\t\tFront-end: " + frontEnd + "\nData Bases: " + dataBase + "\t\tMobile: " + mobile + "\nWordPress: " + wordPress + "\t\tPrestaShop: " + prestaShop + "\n";
    }
}
