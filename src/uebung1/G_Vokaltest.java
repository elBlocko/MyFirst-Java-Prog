/**
 * Vokaltest
 *  
 * switch case Anweisung 
 *  
 * @author elProgrammiero
 * @date 2021-08-30
*/
package uebung1;

import javax.swing.JOptionPane;

public class G_Vokaltest {
	public static void main(String[] args) {
		String eingabe = JOptionPane.showInputDialog("Geben Sie einen Buchstaben ein:");
		var buchstabe = eingabe.charAt(0); // erster Buchstabe einer Zeichenkette
		switch(buchstabe) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			JOptionPane.showMessageDialog(null, buchstabe + "ist ein Vokal");
			break;
		default:
			JOptionPane.showMessageDialog(null, buchstabe + "ist kein Vokal");	
			
		}		
	}
}
