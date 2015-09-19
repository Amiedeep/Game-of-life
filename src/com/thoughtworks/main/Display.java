//It will display the message it receives.
package com.thoughtworks.main;

public class Display {

    private String message;

    public Display(String message) {
        this.message = message;
    }

    public void display() {
        System.out.println(message);
    }
}
