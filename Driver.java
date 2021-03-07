
import java.util.list*;

/**
 * 
 */
public class Driver {

    private List<Move> Vehicles;
	
	public Driver(List<Move> Vehicles){
		this.Vehicles = Vehicles;
		}
		
	public void MoveVehicles(){
		for(Move Vehicles : this.Vehicles){
			Vehicles.Move();
		}
	}

}