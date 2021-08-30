/**
 * Kreisberechung
 * 
 * Eingabe über die Dialogbox
 * Typumwandlung String --> Double
 * Ausgabe über Messagebox
 * \n Zeilenumbruch
 * \u00b2 = ² (Unicode)
 * 
 * @author elProgrammiero
 * @date 2021-08-30
*/

package uebung1;

import javax.swing.JOptionPane;

public class E_Kreisberechnung3 {

	public static void main(String[] args) {
		var eingabe = JOptionPane.showInputDialog("Geben Sie den Kreisradius ein: ");

		var radius = Double.parseDouble(eingabe); // Zeichenkette in Fließkommazahl umwandeln
		eingabe = JOptionPane.showInputDialog("Geben Sie die Einheit ein: ");
		var einheit = eingabe;
		var umfang = 2 * Math.PI * radius;
		var inhalt = Math.PI * Math.pow(radius, 2);
		
		JOptionPane.showMessageDialog(null,"Umfang: " + umfang 
				+ " " + einheit + "\nInhalt: " + inhalt + " " + einheit + '\u00b2'); // \u00b2 ²

		
	}

}
