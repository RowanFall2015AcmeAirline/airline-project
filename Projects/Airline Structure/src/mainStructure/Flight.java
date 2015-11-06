package mainStructure;

import java.sql.Timestamp;

/**
 * Holds the data for a particular flight
 * 
 * @author Aleksandr Fritz
 *
 */

public class Flight {
	private Timestamp departureTime;
	private Timestamp arrivalTime;
	private Plane aircraft;

	public Flight() {
		departureTime = new Timestamp(0);
		arrivalTime = new Timestamp(0);
	}
}
