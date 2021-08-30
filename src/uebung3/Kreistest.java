package uebung3;

import javax.swing.JOptionPane;

public class Kreistest {

	public static void main(String[] args) {
		var kreisradius = JOptionPane.showInputDialog("Radius eingeben: ");
		var einheit = JOptionPane.showInputDialog(kreisradius);
		var r = Double.parseDouble(kreisradius);
		Kreis k = new Kreis(r);

		System.out.println(k.getRadius() + " " + einheit);
		System.out.println(k.getUmfang() + " " + einheit);
		System.out.println(k.getFlaeche() + " " + einheit + "²");

	}

}
