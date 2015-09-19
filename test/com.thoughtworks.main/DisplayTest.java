package com.thoughtworks.main;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class DisplayTest {

    private Display display;

    @Test
    public void shouldDisplayMessageOnTheTerminalWhenICallDisplayMethod() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        display = new Display("Some message");

        display.display();

        assertEquals("Some message\n", outputStream.toString());
    }
}