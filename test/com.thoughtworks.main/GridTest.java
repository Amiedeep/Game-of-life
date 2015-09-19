package com.thoughtworks.main;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GridTest {

    private Grid grid;

    @Test
    public void shouldReturnMeFalseWhenICallShouldDieOfLonelinessMethod() {
        grid = new Grid();

        assertEquals(false, grid.willDieOfLoneliness(1, 3));
    }
}