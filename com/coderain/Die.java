package com.coderain;
// ** -> https://programmerfriend.com/java-random-numbers/
import java.security.SecureRandom;
public class Die {
    //      v1.0
    // N of sides of die
    private int sides = 6;
    // Value die is currently rolled from 1 to "int sides"
    private int on;

    public void Die(int customSides) {
        if (customSides > 6) {
            sides = customSides;
        }
        on = 0;
    }

    public int getValue() {
        return on;
    }

    //      v1.1 that die can be rolled to have a random value
    public void roll() {
        SecureRandom rand = new SecureRandom();
        // on = random value in a range of 1 - sides or 1 - 6 if no custom int was assigned to the sides ariable
        on = rand.nextInt((sides - 1) + 1) + 1;
    }



}
