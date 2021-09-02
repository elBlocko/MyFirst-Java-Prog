package uebung9;

import javax.swing.JOptionPane;

public class Zahlensysteme {

	public static void main(String[] args) {
		String eingabe = JOptionPane.showInputDialog("Zahl eingeben");	
		int zahl = Integer.parseInt(eingabe);
		String bin= Integer.toBinaryString(zahl);
		String hex= Integer.toHexString(zahl);


	
		JOptionPane.showMessageDialog(null, zahl + "\n"+ bin + "\n"+ hex);
	}
}
