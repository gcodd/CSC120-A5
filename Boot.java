/**
 * Boot class allows objects to be created representing boots
 * depicted in ASCII art.
 * @author Grace Codd
 */
public class Boot {

    /* Declare private String variable representing direction (left or right)
     * of the boot.
     */
    private String direction;
  
    /**
     * Class constructor takes in String representing direction of boot
     * and stores the string converted to all lower case in the class
     * field 'direction'
     * @param direction left or right
     */
    public Boot(String direction) {
        /*Call toLowerCase method from String class, store return
         * in direction class field.*/
        this.direction = direction.toLowerCase();
    }

   /**
    * Prints ASCII art representation of left and right boots. 
    */
    public void display() {
        if (this.direction.equals("left")) {
          System.out.print("        (___|   ");
        } else if (this.direction.equals("right")) {
          System.out.println("|___)");
        } else {
          System.out.println("Which boot?");
        }
    }
}
