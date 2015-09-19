//the main class which starts your application.
package com.thoughtworks.main;

import java.util.Scanner;

public class GameOfLife {

    private ConsoleInput consoleInput;
    private char[][] cells;

    public GameOfLife(ConsoleInput consoleInput) {
        this.consoleInput = consoleInput;
    }

    public static void main(String[] args) {
        ConsoleInput consoleInput = new ConsoleInput(new Scanner(System.in));
        GameOfLife gameOfLife = new GameOfLife(consoleInput);
        gameOfLife.start();
    }

    public void start() {
        int rows = 0;
        int columns;
        String input = consoleInput.readInput();
        columns = input.split(" ").length;
        while(!input.equals("")) {
            rows += 1;
            input = consoleInput.readInput();
        }
        cells = initialiseArray(rows, columns);
    }

    public char[][] initialiseArray(int rows, int columns) {
        return new char[rows][columns];
    }
}
