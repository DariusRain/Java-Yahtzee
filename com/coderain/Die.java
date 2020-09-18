package com.coderain;
// ** -> https://programmerfriend.com/java-random-numbers/
import java.security.SecureRandom;
public class Die {
    //      v1.0
    // N of sides of die
    private int sides = 6;
    // Value die is currently rolled from 1 to "int sides"
    private int on;

    private static int timesRolled = 0;

    public void Die(int customSides) {
        if (customSides > 6) {
            sides = customSides;
        }
        on = 0;
    }

    public void rolled() {
        timesRolled += 1;
    }

    public int getValue() {
        return on;
    }

//    public int getSides() {
//        return sides;
//    }
    public int getTimesRolled() {
        return timesRolled;
    }

    //      v1.1 that die can be rolled to have a random value
    public void roll() {
        SecureRandom rand = new SecureRandom();
        // on = random value in a range of 1 - sides or 1 - 6 if no custom int was assigned to the sides ariable
        on = rand.nextInt((sides - 1) + 1) + 1;
        rolled();
    }

    //      v1.2 I can roll the die X times then the application finishes
    public void rollNumberOfTimes(int n) {
        int rollCount = 0;
        while(rollCount <= n) {
            roll();
            System.out.println("Die 1: " + getValue());
            rollCount +=1;
        }
    }

}
