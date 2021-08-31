package uebung3;

import javax.swing.JOptionPane;

public class Rechtecktest {

	public static void main(String[] args) {
		var rechteckBreite = JOptionPane.showInputDialog("Breite eingeben: ");
		var rechteckLaenge = JOptionPane.showInputDialog("Laenge eingeben: ");

		var b = Double.parseDouble(rechteckBreite);
		var l = Double.parseDouble(rechteckLaenge);

		Rechteck r = new Rechteck(l, b);

		System.out.println(r.getKurzeSeite());
		System.out.println(r.getLangeSeite());
		System.out.println(r.getDiagonale());
		System.out.println(r.getUmfang());
		System.out.println(r.getFlaeche());
		r.laengeAusgeben();
	}
}
