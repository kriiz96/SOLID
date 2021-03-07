
import java.util.*;

/**
 * 
 */
public class Boat extends Vehicle {

    /**
     * Default constructor
     */
    public Boat() {
    }

    /**
     * @return
     */
    public void Drive() {
        throw new Exception("It doesn't have any tires to moves");
    }

}