/**
 * Banner class allows objects to be created representing a banner
 * with a printed message in ASCII art.
 * @author Grace Codd
 */
public class Banner {
    
    /*Declare private class member String representing
     * a message. */
    private String message;

    /**
     * Constructor takes in a String and stores the value
     * of this string in the class member 'message'.
     * @param m message to be displayed in banner
     */
    public Banner(String m) {
        this.message = m;
    }

    /**
     * Prints a banner containing a message. The banner 
     * will automatically resize to fit the length of the message
     * using the repeat method from the String class.
     */
    public void display() {
        /*Declare int variable 'n'. Get number of characters in message by 
         * calling length method from String class. Store length in n.
         */
        int n = this.message.length();
        /*Print lines of special characters to create banner.
         * Repeat certain characters 'n' times to resize to fit message
         * by calling repeat method from String class.
         * https://www.geeksforgeeks.org/string-class-repeat-method-in-java-with-examples/
         */
        System.out.println("  ****" + "*".repeat(n) + "****");
        System.out.println(" *** ~~" + "~".repeat(n) + "~ ***");
        System.out.println("*** ~  " + this.message + " ~ ***");
        System.out.println(" *** ~~" + "~".repeat(n) + "~ ***");
        System.out.println("  ****" + "*".repeat(n) + "****");
    }
}
