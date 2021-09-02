package uebung9;

import javax.swing.JOptionPane;

public class StringBack2 {

	public static void main(String[] args) {
		String eingabe = JOptionPane.showInputDialog("Txt eingbnäh");
		String eingabe2 = "";
		for (int i = eingabe.length() - 1; i >= 0; i--) {
			eingabe2 += eingabe.charAt(i);
		}
		JOptionPane.showMessageDialog(null, eingabe2);
		
	}
}
