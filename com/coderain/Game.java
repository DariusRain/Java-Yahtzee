package com.coderain;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.exit;

public class Game {
    // ArrayList of Die objects
    private final ArrayList<Die> dice;
    {
        dice = new ArrayList<>();
    }
    // One scan field needed for input
    private final Scanner scan = new Scanner(System.in);

    // Round counter
    private int round = 0;

    // This function initializes the game and rolls all 5 of the dice.
    public void initList() {
        System.out.println("Yahtzee=======================================>");
        System.out.println("Press any key to start game and roll the dice:");
        scan.nextLine();
        for(int i = 0; i < 5; i++){
            dice.add(new Die());
            dice.get(i).roll();
        }
        round += 1;

    }

    // Display dice list after each round including the last one.
    public void displayList() {
        int diceCount = 1;
        for(Die die: dice) {
            System.out.println("Die " + diceCount + ": " + die.getValue());
            diceCount += 1;
        }
    }

    // Roll die by number
    public void rollDie(int dieNum) {
        if (dieNum <= 5) {
            Die die = dice.get(dieNum - 1);
            die.roll();
        }
    }

    // Displays the round to re-roll if user chooses.
    public void gameRound() {
        displayList();
        System.out.println("( Round " + round + " ) " + "Pick up and re-roll? (Press 'x' if no re-rolls):");
        String input = scan.nextLine();
        if(input.contains("x")) {
            exit(0);
        }
        String[] dieNumbers = input.split(" ");
        for(String dieNumber: dieNumbers) {
            if (Integer.parseInt(dieNumber) <= dice.size()) {
                rollDie(Integer.parseInt(dieNumber));
            } else {
                System.out.println("Invalid die: " + dieNumber);
                System.out.println("Make sure to include spaces between multiple dice ( E.x: 1 2 3 4 5 ).");
            }

        }
        if(isYahtzee()) {
            System.out.println("YAHTZEE!");
        }
    }

    // Runs the displayRound function 3 times and ends the game after the loop
    public void startGame() {
        initList();
        while (round < 3) {
            gameRound();
            round += 1;
        }
        displayList();
        System.out.println("Game over...");
        exit(0);
    }

    // Checks if all of the Die.getValue() numbers are equal and returns false as soon as a number is not equal.
    public boolean isYahtzee() {
        int value = dice.get(0).getValue();
        for(Die die: dice) {
            if (value != die.getValue()) {
                return false;
            }
        }
        return true;
    }
}
