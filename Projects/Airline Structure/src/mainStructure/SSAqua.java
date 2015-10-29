package mainStructure;

/**
 * The smaller plane with half as many seats.
 * 
 * @author Aleksandr Fritz, Ray Linden
 *
 */
public class SSAqua extends Plane {
	private static final Integer AQUA_ROWS = 3;
	private static final Integer AQUA_COLUMNS = 2;

	public SSAqua() {
		super(AQUA_ROWS, AQUA_COLUMNS);
	}
}