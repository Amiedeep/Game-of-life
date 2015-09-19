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
        if(isIndexOutOfBound(row, column))
            return false;
        if(getLiveNeighboursCount(row, column) < 2)
            return true;
        return false;
    }

    public boolean willDieOfOverCrowding(int row, int column) {
        if(isIndexOutOfBound(row, column))
            return false;
        if(getLiveNeighboursCount(row, column) > 3)
            return true;
        return false;
    }

    private int getLiveNeighboursCount(int row, int column) {
        int liveNeighboursCount = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = column - 1; j <= column + 1; j++) {
                if(isValidCoordinate(i, j)) {
                    if(cells[i][j].equals("x") && !isCellCoordinates(row, column, i, j))
                        liveNeighboursCount += 1;
                }
            }
        }
        return liveNeighboursCount;
    }

    private boolean isCellCoordinates(int row, int column, int i, int j) {
        return row == i && column == j;
    }

    private boolean isValidCoordinate(int row, int column) {
        return row >= 0 && row < cells.length && column >= 0 && column < cells[0].length;
    }

    private boolean isIndexOutOfBound(int row, int column) {
        return row < 0 || row > cells.length || column < 0 || column > cells[0].length;
    }
}
