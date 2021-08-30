package uebung2;

public class Bruchtest1 {

	public static void main(String[] args) {
		Bruch b = new Bruch();
		b.zaehler = 3;
		b.nenner = 4;
		// System.out.print("Bruch b = " + b.zaehler + "/" + b.nenner);		
		b.ausgeben();
		b.nenner = 12;
		b.ausgeben();
		
		b.gekuerztAusgeben();
		b.erweitern(4);
		b.ausgeben();
		System.out.println(b.dezimalwert());
		
		Bruch a = new Bruch();
		a.ausgeben();
		Bruch c = new Bruch(2,3);
		c.ausgeben();     
				
		
	}
}
