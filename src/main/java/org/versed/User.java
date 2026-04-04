package org.versed;

import java.util.Scanner;

public class User {
    private String name;
    private int score;
    Scanner scanner = new Scanner(System.in);

    public void enterName() {
        System.out.print("Name : ");
        name = scanner.nextLine();
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
