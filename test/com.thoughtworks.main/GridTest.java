package com.thoughtworks.main;

import org.junit.Test;

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
}