package com.thoughtworks.main;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GameOfLifeTest {

    private GameOfLife gameOfLife;
    private ConsoleInput consoleInput;
    private Grid grid;

    @Before
    public void setUp() {
        consoleInput = mock(ConsoleInput.class);
        grid = mock(Grid.class);
        gameOfLife = new GameOfLife(consoleInput, grid);
    }

    @Test
    public void shouldCallReadInputMethodOfConsoleInputWhenIStartTheApplication() {
        when(consoleInput.readInput()).thenReturn("");

        gameOfLife.start();

        verify(consoleInput, times(1)).readInput();
    }

    @Test
    public void shouldCallTheReadInputMethodRepeatedlyUntilIPassEmptyString() {
        when(consoleInput.readInput()).thenReturn("a bc", "h ehdhju je", "hwjqh", "");
        gameOfLife.start();

        verify(consoleInput, times(4)).readInput();
    }

    @Test
    public void shouldCallTheInitializeGridCellsMethodWhenICallStartMethod() {
        when(consoleInput.readInput()).thenReturn("a bc", "h ehdhju je", "hwjqh", "");
        gameOfLife.start();

        verify(consoleInput, times(4)).readInput();
        verify(grid, times(1)).initializeGridCells(3,2);
    }
}