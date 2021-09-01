/**
 * Klasse Bruch
 * @author A. Fletcher
 * @date 2021-08-30
 */

package uebung7;

public class Bruch {
	// Attribute
	private int zaehler;
	private int nenner;

	public int getZaehler() {
		return zaehler;
	}

	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}

	public int getNenner() {
		return nenner;
	}

	public void setNenner(int nenner) {
		this.nenner = nenner;
	}

	static int anzahlBrueche = 0;

	// Methoden

	// Konstruktoren
	Bruch(int zaehler, int nenner) {
		// this.zaehler = zaehler;
		// this.nenner = nenner;
		if (nenner == 0) {
			System.out.print("Fehler! Der Nenner darf nicht 0 sein!");
		} else {
			var hz = zaehler;
			var hn = nenner;
			var r = hz % hn;
			while (r > 0) {
				hz = hn;
				hn = r;
				r = hz % hn;
			} // in hn steht jetzt der ggT
			this.zaehler = zaehler / hn;
			this.nenner = nenner / hn;
		}
		anzahlBrueche++;
	}

	// Default-Konstruktor
	Bruch() {
		// zaehler = 0;
		// nenner = 1;
		this(0, 1);
	}

	Bruch(int zaehler) {
		this(zaehler, 1);
	}

	// Methoden
	void ausgeben() {
		// int zaehler = 0; //namensgleiche lokale Variable, durch this.zaehler
		// überflüssig
		System.out.println(this.zaehler + "/" + nenner);
		// this.zaehler --> Wert vom aufrufenden Objekt
	}

	void kuerzen() {
		var m = Math.abs(zaehler); // speichert in m den Betrag von zaehler
		var n = Math.abs(nenner); // speichert in n den Betrag von nenner
		var r = m % n;
		while (r > 0) {
			m = n;
			n = r;
			r = m % n;
		}
		zaehler = zaehler / n; // in n steht jetzt ggT
		nenner = nenner / n;
	}

	void gekuerztAusgeben() {
		kuerzen();
		ausgeben();
	}

	void erweitern(int a) {
		zaehler = zaehler * a;
		nenner = nenner * a;
	}

	double dezimalwert() {
		double dezimal = (double) zaehler / nenner;
		return dezimal;
	}

	Bruch addiere(Bruch b) {
		int z = this.zaehler * b.nenner + this.nenner * b.zaehler;
		int n = this.nenner * b.nenner;
		Bruch differenz = new Bruch(z, n);
		return differenz;
	}

	Bruch subtrahiere(Bruch b) {
		int z = this.zaehler * b.nenner - this.nenner * b.zaehler;
		int n = this.nenner * b.nenner;
		Bruch differenz = new Bruch(z, n);
		return differenz;
	}

	Bruch multiplizieren(Bruch b) {
		int z = this.zaehler * this.zaehler;
		int n = this.nenner * this.nenner;
		Bruch produkt = new Bruch(z, n);
		return produkt;
	}

	Bruch dividieren(Bruch b) {
		int z = this.zaehler * this.nenner;
		int n = this.nenner * this.zaehler;
		Bruch quotient = new Bruch(z, n);
		return quotient;
	}
	
	
	// Klassenmethode
	static int getAnzahlBrueche() {
		return anzahlBrueche;
	}
	
    String bruchToString() {
	return zaehler + "/" + nenner;
    }

}
