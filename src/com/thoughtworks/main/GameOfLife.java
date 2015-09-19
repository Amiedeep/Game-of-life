//the main class which starts your application.
package com.thoughtworks.main;

import java.util.Scanner;

public class GameOfLife {

    private ConsoleInput consoleInput;

    public GameOfLife(ConsoleInput consoleInput) {
        this.consoleInput = consoleInput;
    }

    public static void main(String[] args) {
        ConsoleInput consoleInput = new ConsoleInput(new Scanner(System.in));
        GameOfLife gameOfLife = new GameOfLife(consoleInput);
        gameOfLife.start();
    }

    public void start() {
        String input = consoleInput.readInput();
    }

    public char[][] initialiseArray(int rows, int columns) {
        return new char[rows][columns];
    }
}
