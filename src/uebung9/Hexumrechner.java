package uebung9;

import javax.swing.JOptionPane;

public class Hexumrechner {

	public static void main(String[] args) {
		String eingabe = JOptionPane.showInputDialog("Hex Wert eingeben");	
			
		 int dec = Integer.parseInt(eingabe,16);
		 String bin = Integer.toBinaryString(dec);
		 JOptionPane.showMessageDialog(null, dec + "\n"+ bin);
	}
}
