package uebung6;

public class Girokonto extends Konto {

	double limit;

	Girokonto(String kontonummer, double kontostand, double limit) {
		super(kontonummer, kontostand);
		this.limit = limit;
	}

	double getLimit() {
		return limit;
	}

	void setLimit(double l) {
		limit = l;
	}
	
	// info an compiler 
	@Override
	void auszahlung(double betrag) {
		if ((getKontostand() - betrag) >= limit * (-1)) {
			super.auszahlung(betrag);
		} else {
			System.out.println("Fehler blubb blubb limit erreicht blub blubb");
		}
	}
}
