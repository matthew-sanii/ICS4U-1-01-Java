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
    Mass = 55;
    public static void main(final String[] args) {
       final Scanner logLength = new Scanner(System.in);
       System.out.print("Enter log length (0.25, 0.5, or 1): ");
       final float length = logLength.nextFloat();
       System.out.println("The truck will be able to take "
		+ (Mass / length) + " logs that are " + length
		+ " meter(s) in length.");
       
       System.out.println("\nDone.");
    }
}

