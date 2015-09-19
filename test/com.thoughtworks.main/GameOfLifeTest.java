package com.thoughtworks.main;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GameOfLifeTest {

    private GameOfLife gameOfLife;

    @Test
    public void shouldCallReadInputMethodOfConsoleInputWhenIStartTheApplication() {
        ConsoleInput consoleInput = mock(ConsoleInput.class);
        gameOfLife = new GameOfLife(consoleInput);

        gameOfLife.start();

        verify(consoleInput, times(1)).readInput();
    }
}