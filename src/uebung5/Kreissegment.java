package uebung5;

public class Kreissegment extends TeilMitRundung {

	// Attribute
	double winkel;

	// Konstruktoren
	Kreissegment() {
		super();
		winkel = 90;
	}

	Kreissegment(double r, double w) {
		super(r);
		winkel = w;
	}

	// Methoden
	double getUmfang() {
		return 2 * Math.PI * radius * winkel / 360 + 2 * radius;
	}

	double getFlaeche() {
		return Math.PI * radius * radius * winkel / 360;
	}

}
