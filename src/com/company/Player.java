package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player extends Employees{
    public List<Projects> projectList = new ArrayList<>();
    public List<Employees> employees = new ArrayList<>();
    public List<Students> studen = new ArrayList<>();
    public Player(String firstName, String lastName, int java, int frontEnd, int dataBase, int mobile, int wordPress, int prestaShop){
        super(firstName, lastName);
    }
    public String toString(){
        return "First name: " + firstName + "\nLast name: " + lastName + "\nJava: " + java + "\nFront-end: " + frontEnd + "\nData Bases: " + dataBase + "\nMobile: " + mobile + "\nWordPress: " + wordPress + "\nPrestaShop: " + prestaShop;
    }

    public void setProject(Projects projekt){
        projectList.add(projekt);
    }

    public List<Projects> getProject(){
        return projectList;
    }

    public void addStudent(Students student){
        studen.add(student);
    }

    public void addEmployee(Employees employee){
        employees.add(employee);
    }
}
