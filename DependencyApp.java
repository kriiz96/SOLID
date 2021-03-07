
import java.util.ArrayList;
import java.util.list;

/**
 * 
 */
public class DependencyApp {

    public static void main(String[] args) {
		List<Move>Vehicle = new ArrayList<>();
		
		Car Lancer = new Car("Lancer");
		Car Civic = new Car("Civic");
		
		Boat Maria = new Boat("Maria");
		Boat Titanic = new Boat("Titanic");
		
		Vehicle.add(Lancer);
		Vehicle.add(Civic);
		
		Vehicle.add(Maria);
		Vehicle.add(Titanic);
		
		Driver driver = Driver(Vehicles);
		
		driver.moveVehicles();
		
	}

}