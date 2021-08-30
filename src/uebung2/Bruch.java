package uebung2;

public class Bruch {
	// Atribute
	int zaehler;
	int nenner;

	// KONSTRUKTOR
	Bruch(int zaehler, int nenner) {
//		this.zaehler = zaehler;
//		this.nenner = nenner;
		if (nenner == 0) {
			System.out.print("Fehler! Der Nenner darf nicht Null sein");
		} else {
			var hz = zaehler;
			var hn = nenner;
			var r = hz % hn;
			while (r > 0) {
				hz = hn;
				hn = r;
				r = hz % hn;

			}
			this.zaehler = zaehler / hn;
			this.nenner = nenner / hn;
		}
	}

	// default constructor
	Bruch() {
//		zaehler = 0;
//		nenner = 1;
    this(0,1);
	}
	Bruch(int zaehler) {
		this(zaehler,1);
	}
	// METHODEN
	void ausgeben() {
		int zaehler = 0;
		System.out.println(this.zaehler + "/" + nenner); // zaehler = 0 ignoriert
	}

	void kuerzen() {
		var m = Math.abs(zaehler); // speichert in m den Betrag von zaehler
		var n = Math.abs(nenner); // speichert in m den Betrag von zaehler
		var r = m % n;
		while (r > 0) {
			m = n;
			n = r;
			r = m % n;

		}
		zaehler = zaehler / n;
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
		return (double) zaehler / nenner;

	}

}
