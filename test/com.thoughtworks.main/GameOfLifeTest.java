package com.thoughtworks.main;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GameOfLifeTest {

    private GameOfLife gameOfLife;
    private ConsoleInput consoleInput;

    @Before
    public void setUp() {
        consoleInput = mock(ConsoleInput.class);
        gameOfLife = new GameOfLife(consoleInput);
    }

    @Test
    public void shouldCallReadInputMethodOfConsoleInputWhenIStartTheApplication() {
        gameOfLife.start();

        verify(consoleInput, times(1)).readInput();
    }

    @Test
    public void shouldReturnMeThe2DArrayWithSizeIPassAsArgumentWhenICallInitialiseArrayMethod() {
        char[][] outputArray = gameOfLife.initialiseArray(4, 5);

        assertEquals(4, outputArray.length);
        assertEquals(5, outputArray[1].length);
    }
}