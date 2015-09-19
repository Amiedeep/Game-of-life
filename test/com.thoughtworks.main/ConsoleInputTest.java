package com.thoughtworks.main;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static junit.framework.TestCase.assertEquals;

public class ConsoleInputTest {

    private ConsoleInput consoleInput;
    private ByteArrayInputStream inputStream;

    @Test
    public void shouldTakeInputFromTheUserAndReturnMeThatInput() {
        inputStream = new ByteArrayInputStream("Some thing i typed".getBytes());
        System.setIn(inputStream);
        consoleInput = new ConsoleInput(new Scanner(System.in));

        assertEquals("Some thing i typed", consoleInput.readInput());
    }
}