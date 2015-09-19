package com.thoughtworks.main;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class GridTest {

    private Grid grid;

    @Test
    public void shouldReturnMeFalseWhenICallWillDieOfLonelinessMethodWithOutOfIndexBounds() {
        grid = new Grid();
        grid.initializeGridCells(4, 4);

        assertEquals(false, grid.willDieOfLoneliness(-1, -3));
    }

    @Test
    public void shouldReturnMeFalseWhenICallWillDieOfLonelinessMethodWithCellIsNotValidDying() {
        grid = new Grid();
        grid.initializeGridCells(2, 2);
        List<String> list = Arrays.asList("x x", "x x");
        grid.populateCells(list);

        assertEquals(false, grid.willDieOfLoneliness(1, 1));
    }

    @Test
    public void shouldReturnMeTrueWhenICallWillDieOfLonelinessMethodWithCellValidDying() {
        grid = new Grid();
        grid.initializeGridCells(3, 3);
        List<String> list = Arrays.asList("- x -", "- x -", "- x -");
        grid.populateCells(list);

        assertEquals(true, grid.willDieOfLoneliness(0, 1));
    }

    @Test
    public void shouldReturnMeFalseWhenICallWillDieOfOverCrowdingMethodWithOutOfIndexBounds() {
        grid = new Grid();
        grid.initializeGridCells(4, 4);

        assertEquals(false, grid.willDieOfOverCrowding(-1, -3));
    }

    @Test
    public void shouldReturnMeFalseWhenICallWillDieOfOverCrowdingMethodWithCellIsNotValidDying() {
        grid = new Grid();
        grid.initializeGridCells(2, 2);
        List<String> list = Arrays.asList("x x", "x x");
        grid.populateCells(list);

        assertEquals(false, grid.willDieOfOverCrowding(1, 1));
    }

    @Test
    public void shouldReturnMeTrueWhenICallWillDieOfOverCrowdingMethodWithCellValidDying() {
        grid = new Grid();
        grid.initializeGridCells(3, 3);
        List<String> list = Arrays.asList("x x x", "x x -", "x x x");
        grid.populateCells(list);

        assertEquals(true, grid.willDieOfOverCrowding(0, 1));
    }

    @Test
    public void shouldReturnMeFalseWhenICallWillLiveBecauseOfLiveNeighboursMethodWithOutOfIndexBounds() {
        grid = new Grid();
        grid.initializeGridCells(4, 4);

        assertEquals(false, grid.willLiveBecauseOfLiveNeighbours(-1, -3));
    }
}