package com.company;

public class Students extends Employees{
    Double price;
    int late;
    int error;
    public Students(String firstName, String lastName, int java, int frontEnd, int dataBase, int mobile, int wordPress, int prestaShop){
        super(firstName, lastName, java, frontEnd, dataBase, mobile, wordPress, prestaShop);
    }
    public String toString(){
        return "First name: " + firstName + "\nLast name: " + lastName + "\nJava: " + java + "\nFront-end: " + frontEnd + "\nData Bases: " + dataBase + "\nMobile: " + mobile + "\nWordPress: " + wordPress + "\nPrestaShop: " + prestaShop;
    }
}
