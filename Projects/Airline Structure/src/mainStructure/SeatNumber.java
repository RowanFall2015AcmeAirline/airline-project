package mainStructure;

/**
 * Holds the seat number and acts as a key for the seat HashMap.
 * This class does little now, but is here for future proofing.
 * @author Aleksandr Fritz, Ray Linden
 *
 */
public class SeatNumber {
	private String number;
	
	/**
	 * Creates the SeatNumber with the String of the number.
	 * @param number
	 */
	public SeatNumber(String number) {
		this.number = new String(number);
	}
	
}
