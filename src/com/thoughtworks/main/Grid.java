//this class holds all the cells and their operations
package com.thoughtworks.main;

public class Grid {

    private String[][] cells;

    public void initializeGridCells(int rows, int columns) {
        cells = new String[rows][columns];
    }
}
