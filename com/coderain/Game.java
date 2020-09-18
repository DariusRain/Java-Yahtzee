package com.coderain;
import java.util.ArrayList;
import java.util.Scanner;
public class Game {
    private ArrayList<Die> dice;
    {
        dice = new ArrayList<Die>();
    }
//    addToDi
//    public int getDiceValue(String dieNumber) {
//
//    }
    public void initList() {
        for(int i = 1; i <= 5; i++){
            dice.add(new Die());
        }
    }
    public void displayList() {
        int diceCount = 1;
        for(Die die: dice) {
            System.out.println("Rolled Die" + diceCount + " " + die.getTimesRolled() + " times...");
            diceCount += 1;
        }
    }
    public int rollDie(int dieNum) {
        Die die = dice.get(dieNum);
        if (die.getTimesRolled() <= 5) {
            die.roll();
            return die.getValue();
        }
        return 0;
    }

    public void displayGameRound() {
        displayList();
        Scanner scan = new Scanner(System.in);
        System.out.println("What Die would you like to roll:");
        int valOfRoll = rollDie(scan.nextInt() - 1);
        System.out.println("Rolled: " + valOfRoll);

    }

    public void startGame() {
        initList();
        while (isGameOver() != true) {
            displayGameRound();
        }
    }
    public boolean isGameOver() {
        boolean res = true;
        for(Die die: dice) {
            if (die.getTimesRolled() != 5) {
                res = false;
            }
        }
        return res;
    }
}
