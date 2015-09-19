//the main class which starts your application.
package com.thoughtworks.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameOfLife {

    private ConsoleInput consoleInput;
    private Grid grid;

    public GameOfLife(ConsoleInput consoleInput, Grid grid) {
        this.consoleInput = consoleInput;
        this.grid = grid;
    }

    public static void main(String[] args) {
        ConsoleInput consoleInput = new ConsoleInput(new Scanner(System.in));
        GameOfLife gameOfLife = new GameOfLife(consoleInput, new Grid());
        gameOfLife.start();
    }

    public void start() {
        int rows = 0;
        int columns;
        List<String> inputValues = new ArrayList<>();
        String input = consoleInput.readInput();
        columns = input.split(" ").length;
        while(!input.equals("")) {
            rows += 1;
            input = consoleInput.readInput();
        }
        grid.initializeGridCells(rows, columns);
        grid.populateCells(inputValues);
        grid.startGame();
        String output = grid.getOutputInFormattedOrder();
        new Display(output).display();
    }
}
