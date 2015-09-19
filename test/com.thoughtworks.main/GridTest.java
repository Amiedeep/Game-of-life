package com.thoughtworks.main;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class GridTest {

    private Grid grid;

    @Test
    public void shouldReturnMeFalseWhenICallShouldDieOfLonelinessMethod() {
        grid = new Grid();
        grid.initializeGridCells(4, 5);

        assertEquals(false, grid.willDieOfLoneliness(1, 3));
    }

    @Test
    public void shouldReturnMeFalseWhenICallShouldDieOfLonelinessMethodWithOutOfIndexBounds() {
        grid = new Grid();
        grid.initializeGridCells(4, 4);

        assertEquals(false, grid.willDieOfLoneliness(-1, -3));
    }

    @Test
    public void shouldReturnMeFalseWhenICallShouldDieOfLonelinessMethodWithCellIsNotValidDying() {
        grid = new Grid();
        grid.initializeGridCells(2, 2);
        List<String> list = Arrays.asList("x x", "x x");
        grid.populateCells(list);

        assertEquals(false, grid.willDieOfLoneliness(1, 1));
    }
}