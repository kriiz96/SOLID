
import java.util.*;

/**
 * 
 */
public class LiskovApp {

    /**
     * Default constructor
     */
    public LiskovApp() {
    }

    /**
     * @param args 
     * @return
     */
    public static void main(String[] args) {
        Vehicle.makeVehicleMoveForward(new Car);
		Vehicle.makeVehicleMoveForward(new Boat);
		Vehicle.makeVehicleMoveForward(new Motorcycle);
    }

}