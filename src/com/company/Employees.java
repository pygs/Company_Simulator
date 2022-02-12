package com.company;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Employees {
    public String firstName;
    public String lastName;
    public int java = ThreadLocalRandom.current().nextInt(0, 1+1);
    public int frontEnd = ThreadLocalRandom.current().nextInt(0, 1+1);
    public int dataBase = ThreadLocalRandom.current().nextInt(0, 1+1);
    public int mobile = ThreadLocalRandom.current().nextInt(0, 1+1);
    public int wordPress = ThreadLocalRandom.current().nextInt(0, 1+1);
    public int prestaShop = ThreadLocalRandom.current().nextInt(0, 1+1);

    public Employees(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
