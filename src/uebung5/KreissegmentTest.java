package uebung5;

public class KreissegmentTest {
  
	public static void main(String[] args) {
	 
	 Kreissegment segment = new Kreissegment(2,180);
	 
	 System.out.println("Radius des Kreissegments: " + segment.getRadius());
	 segment.radiusVergroessernUm(2);
	 System.out.println("Radius des Kreissegments: " + segment.getRadius());
	 System.out.println("Fl�che des Kreissegments: " + segment.getFlaeche());
	 System.out.println("Umfang des Kreissegments: " + segment.getUmfang());
	 
	 
	}	
}
