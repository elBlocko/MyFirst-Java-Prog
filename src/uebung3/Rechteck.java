package uebung3;
 
public class Rechteck {

	double laenge, breite;

	// ----------------------------- // 
	
	// Konstruktor
		Rechteck(double l,double b) {
			setSeiten(l,b);
		}

		Rechteck() {
			this(0,0);
		}

	void setLaenge(double l){
		laenge = l;
	}
	void setBreite(double b){
		breite = b;
	}
	void setSeiten(double l, double b){
		setLaenge(l);
		setBreite(b);		
		
	}
	double getLaenge(){
      return laenge;
	}
	double getBreite(){
		return breite;
	}
	double getLangeSeite(){
		if (laenge > breite) 
			return laenge;
		else
			return breite;
		
	}
	double getKurzeSeite(){
		if (laenge < breite) {
			return laenge;
		}	
		else 
			return breite;	
	
	}
	double getDiagonale(){
		return Math.round(Math.sqrt((Math.pow(laenge, 2)*(Math.pow(breite, 2))))*100)/100;
	}
	double getFlaeche(){
		return Math.round((laenge*breite)*100)/100.0;
	}
	double getUmfang(){
		return Math.round((2*laenge + 2*breite)*100)/100.0;
	}

	void laengeAusgeben() {
//		var laenge = 5.4; 
		System.out.println("Länge: " + laenge);
		}
}
