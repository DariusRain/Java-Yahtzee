package com.coderain;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // ** -> v1.0 I have a die
        Die die1 = new Die();
        Die die2 = new Die();
        Die die3 = new Die();
        Die die4 = new Die();
        Die die5 = new Die();

        int rollCount = 1;

    }
}


//  v1.3 I can have multiple dice. (5 specifically)
//  v1.4 Each roll all the dice have their own random values.
//    Die die1 = new Die();
//    Die die2 = new Die();
//    Die die3 = new Die();
//    Die die4 = new Die();
//    Die die5 = new Die();
//    int rollCount = 1;
//        while (rollCount <= 15) {
//            die1.roll();
//            die2.roll();
//            die3.roll();
//            die4.roll();
//            die5.roll();
//            System.out.println("On Roll:" + rollCount);
//            System.out.println("Die " + 1 + " : " + die1.getValue());
//            System.out.println("Die " + 2 + " : " + die2.getValue());
//            System.out.println("Die " + 3 + " : " + die3.getValue());
//            System.out.println("Die " + 4 + " : " + die4.getValue());
//            System.out.println("Die " + 5 + " : " + die5.getValue());
//            rollCount+=1;
//
//        }
//  v1.5 I can re-roll just the first die
//  v1.6 i can re-roll a specific die
//    die1.roll();
//    System.out.println("Die " + 1 + " : " + die1.getValue());
//    die.2.roll();
//    System.out.println("Die " + 2 + " : " + die2.getValue());
