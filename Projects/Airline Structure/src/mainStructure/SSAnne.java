package mainStructure;

/**
 * The larger plane with twice as many seats.
 * 
 * @author Aleksandr Fritz, Ray Linden
 *
 */
public class SSAnne extends Plane {
	private static final Integer ANNE_ROWS = 6;
	private static final Integer ANNE_COLUMNS = 2;
	private static final boolean HAS_FIRST_CLASS = true;
	
	public SSAnne() {
		super(ANNE_ROWS, ANNE_COLUMNS,HAS_FIRST_CLASS);
	}
}
