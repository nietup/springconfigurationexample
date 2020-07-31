package spring.book.configuration.example.App.Starship;

import java.io.PrintStream;

public class Starship {
    private String message;
    private PrintStream printStream;
    private int power;

    public Starship(final String message, final PrintStream printStream) {
        this.message = message;
        this.printStream = printStream;
    }

    public void reportForDuty() {
        printStream.println(message + " Power level: " + power);
    }

    public void incrementPower() {
        power++;
    }
}
