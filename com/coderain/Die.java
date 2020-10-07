package com.coderain;
// ** -> https://programmerfriend.com/java-random-numbers/
import java.security.SecureRandom;
public class Die {

    //      v1.0
    // N of sides of die
    // Value die is currently rolled from 1 to "int sides"

    private int sides = 6;
    private int on = 0;
    private SecureRandom rand = new SecureRandom();

    public Die() {}

    public Die(int customSides) {
        if (customSides > 6) {
            sides = customSides;
        }
        on = 0;
    }
    //      v1.1 that die can be rolled to have a random value
    public void roll() {
        // on = random value in a range of 1 - sides or 1 - 6 if no custom int was assigned to the sides field
        on = rand.nextInt(sides) + 1;
    }

    public int getValue() {
        return on;
    }




}
