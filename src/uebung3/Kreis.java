package uebung3;

import java.util.ArrayList;

public class Kreis {
	// Attribute
	double radius;
	double flaeche;
	double umfang;

	
	Kreis (double r, double f, double u) {
		this.radius = r;
		this.flaeche = f;
		this.umfang = u;

	}

	void setData (double r, double f, double u) {
		this.radius = r;
		this.flaeche = f;
		this.umfang = u;

	}

	double getU(double r) {
		return Math.round((2 * Math.PI * r) * 100) / 100.0;
	}
	
	double getF(double r) {
		return Math.round((Math.PI * Math.pow(r, 2)) * 100) / 100.0;
		
	}
	void display() {
		System.out.println(radius + "\t" + flaeche + "\t" + umfang);
	}
	
	// Konstruktor
	Kreis(double r) {
		setRadius(r);
	}

	Kreis() {
		this(0);
	}

	double getRadius() {
		return this.radius;
	}

	void setRadius(double r) {
		this.radius = r;
	}

	void setUmfang(double u) {
		radius = u / (2 * Math.PI);
		System.out.println(Math.round(radius));
	}

	void setFlaeche(double f) {
		radius = Math.sqrt(f / Math.PI);
		System.out.println(Math.round(radius));

	}

	double getUmfang() {
		return Math.round((2 * Math.PI * this.radius) * 100) / 100.0;
	}

	double getFlaeche() {
		return Math.round((Math.PI * Math.pow(radius, 2)) * 100) / 100.0;
	}

	void radiusAusgeben() {
		System.out.println(this.radius);
	}

}
