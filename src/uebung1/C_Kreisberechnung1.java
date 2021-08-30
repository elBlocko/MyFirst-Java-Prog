/**
 * Kreisberechung
 * Für einen Kreis mit dem Radius 5 cm
 * werden Umfang und Inhalt berechnet
 * Deklaration mit var:
 * erkennt anhand der Datentypzuweisung welcher Datentyp es ist
 * 
 * 
 * @author elProgrammiero
 * @date 2021-08-30
*/

package uebung1;

public class C_Kreisberechnung1 {

	public static void main(String[] args) {
		var radius = 5.0;
		var umfang = 2.0 * 3.1415926 * radius;
		var inhalt = 3.1415926 * radius * radius;

		System.out.print("Umfang: ");
		System.out.println(umfang);
		System.out.print("Inhalt: ");
		System.out.println(inhalt);

	}

}
