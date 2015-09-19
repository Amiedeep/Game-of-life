package com.thoughtworks.main;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.*;

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
        when(consoleInput.readInput()).thenReturn("");

        gameOfLife.start();

        verify(consoleInput, times(1)).readInput();
    }

    @Test
    public void shouldReturnMeThe2DArrayWithSizeIPassAsArgumentWhenICallInitialiseArrayMethod() {
        String[][] outputArray = gameOfLife.initialiseArray(4, 5);

        assertEquals(4, outputArray.length);
        assertEquals(5, outputArray[1].length);
    }

    @Test
    public void shouldCallTheReadInputMethodRepeatedlyUntilIPassEmptyString() {
        when(consoleInput.readInput()).thenReturn("a bc", "h ehdhju je", "hwjqh", "");
        gameOfLife.start();

        verify(consoleInput, times(4)).readInput();
    }
}