
import java.util.*;

public class Boat implements Move {
	
	private String name;
	
    public Boat(String name) {
		this.name = name;
    }
	
	public void move(){
		this.travel();
	}
	
    public void travel() {
        System.out.println(String.format("It are travel", this.name));
    }

}