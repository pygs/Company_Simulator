package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Projects{
    public String name;
    public String projectLvl ;

    public Projects(String name, String level){
        this.name = name;
        this.projectLvl = level;
    }
    public String toString(){
        return name + " Difficulty: " + projectLvl;
    }

}
