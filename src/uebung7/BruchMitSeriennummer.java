/**
 * 
 */
package uebung7;

/**
 * @author Platz 6315
 *
 */
public class BruchMitSeriennummer extends Bruch {

	// @param serienNummer
	final int serienNummer;
    static int statischesAttribut = 0; 
	
	BruchMitSeriennummer (int x, int y) {
		super(x,y);
		statischesAttribut++;
		serienNummer = statischesAttribut;
	}
	
	
	public int getSerienNummer() {
		return serienNummer;
	}

}
