package uebung9;

import javax.swing.JOptionPane;

public class Hexumrechner {

	public static void main(String[] args) {
		String eingabe = JOptionPane.showInputDialog("Hex Wert eingeben");	

		int zahl = Integer.parseInt(eingabe);
		 String hex = Integer.toHexString(zahl);
		 System.out.println(hex);
//		 
//		String bin= Integer.toBinaryString(zahl);
//		String hex= Integer.toHexString(zahl);
//
//
//	
//		JOptionPane.showMessageDialog(null, zahl + "\n"+ bin);
	}

}
