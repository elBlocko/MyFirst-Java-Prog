package uebung8;

import javax.swing.JOptionPane;

public class Vokalzaehler {

	public static void main(String[] args) {
		int aZaehler = 0;
		int eZaehler = 0;
		int iZaehler = 0;
		int oZaehler = 0;
		int uZaehler = 0;

		String eingabe = JOptionPane.showInputDialog("Txt eingbnäh");
		String eingabeklein = eingabe.toLowerCase();
		for (int i = 0; i < eingabeklein.length(); i++) {
			switch (eingabe.charAt(i)) {
			case 'a':
				aZaehler++;
				break;
			case 'e':
				eZaehler++;
				break;
			case 'i':
				iZaehler++;
				break;
			case 'o':
				oZaehler++;
				break;
			case 'u':
				uZaehler++;
				break;

			} // eoswitch
		} // eofor
	  System.out.print("Die Eingabe \"" + eingabe + "\" enthält:");
	  System.out.print(aZaehler + " mal a");
	  System.out.print(eZaehler + " mal e");
	  System.out.print(iZaehler + " mal i");
	  System.out.print(oZaehler + " mal o");
	  System.out.print(uZaehler + " mal u");
	  
	}	
}
