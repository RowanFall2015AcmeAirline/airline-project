package mainStructure;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Master class that contains the flights, planes, and members
 * 
 * @author Aleksandr Fritz, Ray Linden
 *
 */
public class Airline {
	private Collection flights, planes, members;
	
	public Airline(){
		flights = new ArrayList<Flight>();
		planes = new ArrayList<Plane>();
		members = new ArrayList<Member>();
		
	}

	public void canRegister() {
		
		

	}
}
