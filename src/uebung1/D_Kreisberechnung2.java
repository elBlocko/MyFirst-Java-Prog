/**
 * Kreisberechung
 * Für einen Kreis mit dem Radius 5 cm
 * werden Umfang und Inhalt berechnet
 * Trennung von Deklaration und Initialisierung
 * 
 * Nutzung der Math Klasse
 * Nutzung von Stringverknüpfung in der Ausgabe
 * 
 * @author elProgrammiero
 * @date 2021-08-30
*/

package uebung1;

public class D_Kreisberechnung2 {

	public static void main(String[] args) {
		double radius, umfang, inhalt;
		radius = 5;
		umfang = 2 * Math.PI * radius;
		inhalt = Math.PI * Math.pow(radius, 2);
		System.out.println("Umfang: " + umfang);
		System.out.println("Inhalt: " + inhalt);

	}

}
