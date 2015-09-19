//this class holds all the cells and their operations
package com.thoughtworks.main;

import java.util.List;

public class Grid {

    private String[][] cells;

    public void initializeGridCells(int rows, int columns) {
        cells = new String[rows][columns];
    }

    public void populateCells(List<String> inputValues) {
        int row = 0;
        for(String inputLine : inputValues) {
            initialiseRowOfCell(inputLine, row);
            row += 1;
        }
    }

    private void initialiseRowOfCell(String inputLine, int row) {
        int column = 0;
        for(String cellValue : inputLine.split(" ")) {
            cells[row][column] = cellValue;
            column += 1;
        }
    }

    public boolean willDieOfLoneliness(int row, int column) {
        return false;
    }
}
