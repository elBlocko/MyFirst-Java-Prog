package uebung3;

import javax.swing.JOptionPane;


public class Kreistabelle {

	public static void main(String[] args) {
		var kreisradius = JOptionPane.showInputDialog("Radius eingeben: ");
		var erhoehung = JOptionPane.showInputDialog("Erhoehung eingeben: ");
		var r = Double.parseDouble(kreisradius);
		var e = Double.parseDouble(erhoehung);
		
	
		
		// declare
		Kreis[] kreisListe;
		// create
		kreisListe = new Kreis[30];

		for (int i = 0; i < 30; i++) {
			// initialize	
			double u = MyMath.getU(r); 
			double f = MyMath.getF(r);
			kreisListe[i] = new Kreis(r, f, u);			
			r += e;
			kreisListe[i].display();
		}
	}
}
