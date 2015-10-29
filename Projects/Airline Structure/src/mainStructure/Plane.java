package mainStructure;

import java.util.HashMap;
import java.util.Map;

/**
 * Holds the seats and has a particular size.
 * 
 * @author Aleksandr Fritz, Ray Linden
 *
 */
public abstract class Plane {
	protected int rows, columns;
	protected Map seats;
	
	public Plane(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		
		seats = instantiateMap(rows, columns);
	}

	/**
	 * Creates the HashMap of seats based on the number of seats the plane has.
	 * 
	 * @param numberOfSeats
	 * @return newSeats
	 */
	private Map instantiateMap(Integer numberOfRows, Integer numberOfColumns) {
		HashMap<SeatNumber, Seat> newSeats = new HashMap<SeatNumber, Seat>();
		SeatNumber currentSeatNumber;
		Seat currentSeat;
		Integer actualNumber;
		Boolean firstClass;
		
		//start the number count at 0 so that it is 1 the first time it is called
		actualNumber = 0;
		
		//loops through the rows
		for(Integer i = 0; i < numberOfRows; i++) {
			//loops through the columns for each row
			for(Integer j = 0; j <numberOfColumns; j++) {
				
				//if we're in the first 2 rows, it is first class
				if (i < 2) {
					firstClass = true;
				}
				else {
					firstClass = false;
				}
				
				//count up the actual seat number for each seat
				actualNumber++;
				currentSeatNumber = new SeatNumber(actualNumber.toString());
				currentSeat = new Seat(currentSeatNumber, firstClass);
				newSeats.put(currentSeatNumber, currentSeat);
			}
		}
		
		return newSeats;
	}
}
