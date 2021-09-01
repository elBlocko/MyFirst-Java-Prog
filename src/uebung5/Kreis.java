package uebung5;

public class Kreis extends TeilMitRundung { // extends erbt Methoden und Attribute

	// Konstruktor
	Kreis(double r) {
		radius = r;
	}

	// neue Methoden (nicht in TeilMitRundung)
	double getUmfang() {
		return 2 * Math.PI * radius;
	}

	double getFlaeche() {
		return Math.PI * radius * radius;
	}
}
