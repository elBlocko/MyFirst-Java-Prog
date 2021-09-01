package uebung7;

public class Bruchtest {

	public static void main(String[] args) {
			Bruch a = new Bruch(2,3);
			Bruch b = new Bruch(1,4);
			Bruch c = a.addiere(b);
			System.out.println("Addition: ");
			c.gekuerztAusgeben();
			Bruch d = a.subtrahiere(b);
			d.gekuerztAusgeben();
	}

}
