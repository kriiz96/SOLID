
import java.util.*;

/**
 * 
 */
public class Car implements Move {
	
	private String name;

    public Car(String name) {
		this.name = name;
    }
	
	public void move(){
		this.advance();
	}

    public void advance() {
        System.out.println(String.format("It are car and can move " , this.name));
    }

}