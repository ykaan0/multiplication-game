package org.versed;

public class Main {

    public static void main(String[] args) {
        GameSystem gameSystem = new GameSystem();
        User user = new User();
        user.enterName();
        gameSystem.sign();
        gameSystem.play();
    }
}
