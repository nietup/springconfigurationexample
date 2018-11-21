package spring.book.configuration.example.springconfigurationexample.Starship;

import java.io.PrintStream;

public class Starship {
    private String message;
    private PrintStream printStream;

    public Starship(final String message, final PrintStream printStream) {
        this.message = message;
        this.printStream = printStream;
    }

    public void reportForDudy() {
        printStream.print(message);
    }
}
