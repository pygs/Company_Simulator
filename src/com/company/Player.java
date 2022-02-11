package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Player extends Employees{
    public List<Projects> projectList = new ArrayList<>();
    public Player(String firstName, String lastName, int java, int frontEnd, int dataBase, int mobile, int wordPress, int prestaShop){
        super(firstName, lastName, java, frontEnd, dataBase, mobile, wordPress, prestaShop);
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
}
