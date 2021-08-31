package uebung3;

public class MyMath {
  
	static double getU(double r) {
		return Math.round((2 * Math.PI * r) * 100) / 100.0;
	}
	
	static double getF(double r) {
		return Math.round((Math.PI * Math.pow(r, 2)) * 100) / 100.0;
		
	}
	
}
