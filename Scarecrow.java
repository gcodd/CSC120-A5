/*
 * Scarecrow class aggregates objects from Pumpkin, Shirt, Pants,
 * Boot, and Banner classes to create a depiction of a scarecrow in 
 * ASCII art.
 * @author Grace Codd
 * 
 * Refereneces
 * https://www.asciiart.eu/clothing-and-accessories/shirts
 * https://www.asciiart.eu/clothing-and-accessories/skirts
 * https://www.geeksforgeeks.org/string-class-repeat-method-in-java-with-examples/
 * 
 * I did not collaborate with anyone on this assignment.
 */

class Scarecrow {

    /* 
     * Declaration of class fields
     */
    private Pumpkin head; //Pumpkin object representing head of scarecrow
    private Shirt body; //Shirt object representing body of scarecrow
    private Pants legs; //Pants object representing legs of scarecrow
    private Boot leftFoot; //Boot object representing the leftFoot of the scarecrow
    private Boot rightFoot; //Boot object representing the rightFoot of the scarecrow
    private Banner sign; //Banner object representing the sign the scarecrow will display
    private String message; //String object representing message in banner

    /** Constructor takes in objects from Pumpkin, Shirt, Pants, Boot, and String classes 
     * and assigns them to class fields. An instance of Banner class is created and stored in the
     * 'sign' class field. 
     * @param head the pumpkin representing the head
     * @param body the shirt representing the body
     * @param legs the pants representing the legs
     * @param leftFoot the boot representing the left boot
     * @param rightFoot the boot representing the right boot
     * @param message the message to be printed in the banner
     */
    public Scarecrow(Pumpkin head, Shirt body, Pants legs, 
                        Boot leftFoot, Boot rightFoot, String message) {
        this.head = head;
        this.body = body;
        this.legs = legs;
        this.leftFoot = leftFoot;
        this.rightFoot = rightFoot;
        this.message = message;
        sign = new Banner(message); //Instantiate Banner class, passing message into contructor

    }

    /** 
    * Displays the Scarecrow 
    */
    public void display() {
        sign.display();
        head.display();
        body.display();
        legs.display();
        leftFoot.display();
        rightFoot.display();
    }

    /**
     * Main method. Demonstrates aggregation of objects to create object of 
     * Scare crow class.
     * @param args The command line arguments
     */
    public static void main(String[] args) {

        /*Declare local String variable 'message' and initialize with a message.
         * This will be the first message that is displayed in the banner.
         */
        String message = "HAPPY SPOOKY SEASON!";

        /*If statement checks for command line arguments.
         * If there are command line arguments, the String will be 
         * stored in the message variable.
         */
        if (args.length > 0) {
            message = args[0];
        }

        /*Instatiate object of Scarecrow class, passing instances of 
         * aggregated classes and a copy of local variable message into constructor.
        */
        Scarecrow myScarecrow = new Scarecrow(new Pumpkin(),
                                                new Shirt(),
                                                new Pants(),
                                                new Boot("left"),
                                                new Boot("right"), 
                                                message);

        /*Call display method from Scarecrow class to display 
         * Scarecrow in console.*/
        myScarecrow.display();
    }

}
