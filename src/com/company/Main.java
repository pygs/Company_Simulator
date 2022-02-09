package com.company;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Double money = 3000.0;
        List<Projects> project = new ArrayList<Projects>();
        String[] projectLvl = {"Easy", "Medium", "Complicated"};
        Projects projekt1 = new Projects("dupa", projectLvl[0]);
        Projects projekt2 = new Projects("dupa", projectLvl[1]);
        Projects projekt3 = new Projects("dupa", projectLvl[2]);
        project.add(projekt1);
        project.add(projekt2);
        project.add(projekt3);
        int[] bestStuLvl = new int[6];
        int[] StuLvl = new int[6];
        int[] chillStuLvl = new int[6];
        for (int i = 0; i < bestStuLvl.length; i++) {
            bestStuLvl[i] = ThreadLocalRandom.current().nextInt(0, 1 + 1);
            StuLvl[i] = ThreadLocalRandom.current().nextInt(0, 1 + 1);
            chillStuLvl[i] = ThreadLocalRandom.current().nextInt(0, 1 + 1);
        }

        Students bestStu = new Students("Janusz", "Kopytko", bestStuLvl[0], bestStuLvl[1], bestStuLvl[2], bestStuLvl[3], bestStuLvl[4], bestStuLvl[5]);
        Students stu = new Students("Janusz", "Kopytko", bestStuLvl[0], bestStuLvl[1], bestStuLvl[2], bestStuLvl[3], bestStuLvl[4], bestStuLvl[5]);
        Students chillStu = new Students("Janusz", "Kopytko", bestStuLvl[0], bestStuLvl[1], bestStuLvl[2], bestStuLvl[3], bestStuLvl[4], bestStuLvl[5]);

        Scanner name = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String playerName = name.nextLine();
        Employees player = new Employees(playerName, null, 1, 1, 1, 0, 1, 1);

        LocalDate dt = LocalDate.of(2019, 12, 31);
        while(money > 0.0) {
            System.out.println(dt = dt.plusDays(1));
            System.out.println("1. Sign the contract for new project.");
            System.out.println("2. Spend the day searching for new projects.");
            System.out.println("3. Spend the day programming.");
            System.out.println("4. Spend the day testing code.");
            System.out.println("5. Return project to client.");
            System.out.println("6. Hire new employee.");
            System.out.println("7. Fire the employee.");
            System.out.println("8. Spend the day settling accounts with offices.");
            Scanner input = new Scanner(System.in);
            int playerInput = input.nextInt();
            if (playerInput == 1) {
                for (int i = 0; i < project.size(); i++) {
                    System.out.println((i + 1) + ". " + project.get(i));
                }
            }
        }
    }
}
