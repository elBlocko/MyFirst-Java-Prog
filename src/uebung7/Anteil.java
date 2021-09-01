package uebung7;

public class Anteil extends Bruch {
/*
 * nenner ist Gesamtbestand, zaehler ist Anteil
 * Bruch max 1 ergeben
 * --> zahler >= 1 sein 
 * 
 * 
 * */
	
	
	static Bruch verteilt = new Bruch(0);

	Anteil() {
		super(); 
	}

	Anteil(int z, int n) {	
		super(z,n); // Anteil immer Bruch mit Parametern
		verteilt = verteilt.addiere(this);
		if (this.getVerteilt() > 1) {
			System.out.print("Fehler! Es wurde zuviel verteilt!");
		}
	}

	public double getVerteilt() {
		// Wert des Bruchs 'verteilt' als double wiedergeben		
		return verteilt.dezimalwert();
	}

	public Bruch getRest() {
		// Wert des noch nicht verteilten Anteils als Bruch wiedergeben
		Bruch gesamt = new Bruch(1);
		return gesamt.subtrahiere(verteilt);
	}
}