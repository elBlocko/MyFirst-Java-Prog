/**
 * Schaltjahr
 * eingabe Jahr als integer
 * Prüfung
 * Ausgabe ob Schaltjahr oder nicht
 *  
 * @author elProgrammiero
 * @date 2021-08-30
*/
package uebung1;

import javax.swing.JOptionPane;
public class F_Schaltjahr {
	public static void main(String[] args) {
		var eingabe = JOptionPane.showInputDialog("Geben Sie ein Schaltjahr ein ");
		var jahr = Integer.parseInt(eingabe);
		String erg;
		// siehe fizbuzz
		if (jahr%400 == 0) {
	    	erg = "ein";
		} else
	    if (jahr%4 == 0  &&  jahr%100 != 0 ) {
	    	erg = "ein";
	    } else {
	    	erg = "kein";	    	
	    }    	
	     	
	    
		JOptionPane.showMessageDialog(null, eingabe + " ist "+ erg + " Schaltjahr"); 

		
	
	}
}
