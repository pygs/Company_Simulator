package com.company;

public class Projects{
    public String name;
    public String level;

    public Projects(String name, String level){
        this.name = name;
        this.level = level;
    }
    public String toString(){
        return name + " Difficulty: " + level;
    }
}
