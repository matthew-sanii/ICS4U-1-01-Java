/*
* The Logs program, just proves you can show print to terminal.
*
* @author  matthew sanii
* @version 1.0
* @since   2020-01-01
*/

import java.util.Scanner;

/**
* This is the standard "Hello, World!" program.
*/

final class Logs {

    /**
    * This is variable for the truck capacity.
    */

    public static final double CAPACITY = 1100;

    /**
    * This is variable for the log density.
    */

    public static final double LOG_DENSITY = 20;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private Logs() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {
        final Scanner logLength = new Scanner(System.in);

        System.out.print("Enter log length (0.25, 0.5, or 1): ");

        final float length = logLength.nextFloat();

        System.out.println("The truck will be able to take "
                + (CAPACITY / LOG_DENSITY) / length + " logs that are " + length
                + " meter(s) in length.");

        System.out.println("\nDone.");
    }
}

