package com.company;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Double money = 3000.0;
        List<Projects> projectList = new ArrayList<>();
        List<Students> stuList = new ArrayList<>();
        List<Employees> empList = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            String[] projectName = {"dupa", "CD Projekt Red", "Techland", "EA", "Google"};
            String[] projectLvl = {"Easy", "Medium", "Complicated"};
            projectList.add(new Projects(projectName[ThreadLocalRandom.current().nextInt(0, 4 + 1)], projectLvl[ThreadLocalRandom.current().nextInt(0, 2 + 1)]));
        }
        Best bestStu = new Best("Janusz", "Kopytko");
        Normal stu = new Normal("Janusz", "Kopytko");
        Lazy idiStu = new Lazy("Janusz", "Kopytko");
        stuList.add(bestStu);
        stuList.add(stu);
        stuList.add(idiStu);

        Scanner name = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String playerName = name.nextLine();
        Player player = new Player(playerName, null, 1, 1, 1, 0, 1, 1);

        LocalDate dt = LocalDate.of(2019, 12, 31);
        int count = 0, empCount = 0;
        while(money > 0.0) {
            String progress = "I", progressBar = "", empBar = "";
            for (int i = 0; i < count; i++){
                progressBar += progress;
            }
            for (int i = 0; i < empCount; i++){
                empBar += progress;
            }
            System.out.println(dt = dt.plusDays(1));
            System.out.println(playerName + " Company");
            System.out.println("Money: " + money + " Pesos");
            System.out.println("Active project: " + player.getProject());
            System.out.println("1. Sign the contract for new project." );
            System.out.println("2. Spend the day searching for new projects. [" + progressBar + "]");
            System.out.println("3. Spend the day programming.");
            System.out.println("4. Spend the day testing code.");
            System.out.println("5. Return project to client.");
            System.out.println("6. Hire new employee.");
            System.out.println("7. Fire the employee.");
            System.out.println("8. Spend the day settling accounts with offices.");
            Scanner input = new Scanner(System.in);
            int playerInput = input.nextInt();
            if (playerInput == 1) {
                int projectLoop = 1;
                if (player.projectList.isEmpty()) {
                    for (int i = 0; i < projectList.size(); i++) {
                        System.out.println((i + 1) + ". " + projectList.get(i));
                        projectLoop++;
                    }
                    System.out.println(projectLoop + ". Exit");
                    Scanner projectInput = new Scanner(System.in);
                    int projectSet = projectInput.nextInt();
                    if (projectSet == projectLoop){
                        dt = dt.minusDays(1);
                        projectList.add(new Projects(null, null));
                    }
                    Projects proLvl = projectList.get(projectSet-1);
                    if (projectSet == projectLoop){
                        projectList.remove(projectSet - 1);
                        // Needed to do exit option and it was my only idea without using break
                    }
                    else if (proLvl.projectLvl != "Complicated" || (proLvl.projectLvl == "Complicated" && !player.studen.isEmpty()) || (proLvl.projectLvl == "Complicated" && !player.employees.isEmpty())) {
                        player.setProject(projectList.get(projectSet - 1));
                        projectList.remove(projectSet - 1);
                    }
                    else if(proLvl.projectLvl == "Complicated"){
                        System.out.println("You can't do it alone.");
                        dt = dt.minusDays(1);
                    }
                }
                else {
                    System.out.println("You have active project.\n");
                    dt = dt.minusDays(1);
                }
            }

            else if (playerInput == 2){
                System.out.println("You are looking for new project.");
                count++;
                if (count == 5){
                    String[] projectName = {"dupa", "CD Projekt Red", "Techland", "EA", "Google"};
                    String[] projectLvl = {"Easy", "Medium", "Complicated"};
                    projectList.add(new Projects(projectName[ThreadLocalRandom.current().nextInt(0, 4 + 1)], projectLvl[ThreadLocalRandom.current().nextInt(0, 2 + 1)]));
                    count = 0;
                }
            }

            else if (playerInput == 6){
                System.out.println("1. Employees");
                if(player.studen.isEmpty()) {
                    System.out.println("2. Students");
                }
                System.out.println("3. Look for new employee. Cost: 100" + " [" + empBar + "]");
                System.out.println("4. Exit");
                Scanner empChoice = new Scanner(System.in);
                int empInput = empChoice.nextInt();
                if (empInput == 1) {
                    for (int i = 0; i < 3; i++){
                        int empRand = ThreadLocalRandom.current().nextInt(0, 2+1);
                        if (empRand == 0){
                            empList.add(new Employee("Adam", "Szuta", "Programmer"));
                        }
                        else if (empRand == 1){
                            empList.add(new Employee("Adam", "Szuta", "Seller"));
                        }
                        else if (empRand == 2){
                            empList.add(new Employee("Adam", "Szuta", "Tester"));
                        }
                        System.out.println(empList.get(i));
                    }
                    Scanner emploInput = new Scanner(System.in);
                    int empSet = emploInput.nextInt();
                    player.addEmployee(empList.get(empSet - 1));
                    empList.remove(empSet - 1);
                }
                else if (empInput == 2) {
                    if (player.studen.isEmpty()) {
                        for (int i = 0; i < stuList.size(); i++) {
                            System.out.println((i + 1) + ". " + stuList.get(i));
                        }
                        Scanner stuInput = new Scanner(System.in);
                        int stuSet = stuInput.nextInt();
                        player.addStudent(stuList.get(stuSet - 1));
                    } else {
                        System.out.println("Your one friend is already helping you.");
                        dt = dt.minusDays(1);
                    }
                }
                else if (empInput == 3){
                    System.out.println("You posted announcements for job hiring.");
                    empCount++;
                    money -= 100;
                    if(empCount == 5){
                        String[] empName = {"Adam"};
                        String[] empLastName = {"Szuta"};
                        String[] empSpeciality = {"Programmer", "Seller", "Tester"};
                        empList.add(new Employee(empName[ThreadLocalRandom.current().nextInt(0, 0+1)], empLastName[ThreadLocalRandom.current().nextInt(0, 0+1)], empSpeciality[ThreadLocalRandom.current().nextInt(0, 0+1)]));
                    }
                }
                else if (empInput == 4){
                    dt = dt.minusDays(1);
                }
            }
        }
    }
}
