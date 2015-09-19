//the main class which starts your application.
package com.thoughtworks.main;

import java.util.Scanner;

public class GameOfLife {

    private ConsoleInput consoleInput;
    private Grid grid;

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
        grid = new Grid(rows, columns);
    }
}
