/*
* The Logs program, just proves you can show print to terminal.
*
* @author  matthew sanii
* @version 1.0
* @since   2020-01-01
*/

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
    public static void main(final String[] args) {
       
       
       System.out.println("\nDone.");
    }
}

