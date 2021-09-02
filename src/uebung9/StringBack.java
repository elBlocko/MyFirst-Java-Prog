package uebung9;

import javax.swing.JOptionPane;

public class StringBack {
	public static void main(String[] args) {
		String eingabe = JOptionPane.showInputDialog("Txt eingbnäh");			
		for (int i = eingabe.length()-1; i >= 0 ; i--) {
           System.out.print(eingabe.charAt(i));
		}
	}
}
