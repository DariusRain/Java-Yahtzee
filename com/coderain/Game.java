package com.coderain;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.exit;

public class Game {
    // ArrayList of Die objects
    private ArrayList<Die> dice;
    {
        dice = new ArrayList<Die>();
    }

    // Round counter
    private int round = 0;

    // This function initializes the game and rolls all 5 of the dice.
    public void initList() {
        System.out.println("Yahtzee=======================================>");
        System.out.println("Press any key to start game and roll the dice:");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        for(int i = 0; i < 5; i++){
            dice.add(new Die());
            dice.get(i).roll();
        }
        setRound(1);

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
    public void displayGameRound() {
        displayList();
        Scanner scan = new Scanner(System.in);
        System.out.println("( Round " + round + " ) " + "Pick up and re-roll? (Press 'x' if no re-rolls):");
        String input = scan.nextLine();
        if(-1 < input.indexOf("x")) {
            displayList();
            exit(0);
        }
        String dieNums[] = input.split(" ");
        for(int i = 0; i < dieNums.length; i++) {
            rollDie(Integer.parseInt(dieNums[i]));
        }
    }

    public void startGame() {
        initList();
        while (true) {
            displayGameRound();
            if(round == 3) {
                displayList();
                System.out.println("Game over...");
                exit(0);
            }
            setRound(round + 1);
        }
    }


    public void setRound(int round) {
        this.round = round;
    }
}
