/**
 * Klasse Konto
 * @author A. Fletcher
 * @date 2021-08-31
 */

package uebung6;

public class Konto {
	//Attribute
	protected String kontonummer;
	protected double kontostand;
	
	//Konstruktor
	Konto(String kontonummer, double kontostand){
		this.kontonummer = kontonummer;
		this.kontostand = kontostand;
	}

	//Methoden
	String getKontonummer() {
		return kontonummer;
	}

	double getKontostand() {
		return kontostand;
	}

	void einzahlen(double einzahlung){
		kontostand = kontostand + einzahlung;
	}
	
	void auszahlung(double auszahlung) {
		kontostand = kontostand - auszahlung;
	}
	
}
