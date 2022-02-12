package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Best extends Students{
    public double salary = Math.round(ThreadLocalRandom.current().nextDouble(3000.0, 4500.0+1.0));
    public Best(String firstName, String lastName) {
        super(firstName, lastName);
    }
    public String toString(){
        return firstName + " " + lastName + "\tAttitude: Best" + "\tPrice: " + salary + "\nJava: " + java + "\t\tFront-end: " + frontEnd + "\nData Bases: " + dataBase + "\t\tMobile: " + mobile + "\nWordPress: " + wordPress + "\t\tPrestaShop: " + prestaShop + "\n";
    }
}
