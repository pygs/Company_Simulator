package com.company;

public class Employee extends Employees{
    public String speciality;
    public Employee(String firstName, String lastName, int java, int frontEnd, int dataBase, int mobile, int wordPress, int prestaShop, String speciality){
        super(firstName, lastName);
        this.speciality = speciality;
    }
}
