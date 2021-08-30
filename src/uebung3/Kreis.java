package uebung3;

public class Kreis {
	// Attribute
	double radius;

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

	double getUmfang() {
		return Math.round((2*Math.PI* this.radius)*100)/100.0;
	}

	double getFlaeche() {
		return Math.round((Math.PI *Math.pow(radius, 2))*100)/100.0;
	}
	
	void radiusAusgeben() {		
		System.out.println(this.radius); 
	}
	
	

}
