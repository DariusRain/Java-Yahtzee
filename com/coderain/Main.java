package com.coderain;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Die die = new Die();
        int rollCount = 0;
        // v1.2
        while(rollCount <= 10) {
            die.roll();
            System.out.println("Die 1: " + die.getValue());
            rollCount +=1;
        }
    }
}
