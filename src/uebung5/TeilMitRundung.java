package uebung5;

public class TeilMitRundung {
 protected double radius;
 // Konstruktoren
 TeilMitRundung(){
	 radius = 1;
 }
 
 TeilMitRundung(double r){
	 radius = r;
 }
  
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}

void radiusVergroessernUm(double vr) {
	radius += vr;
}
 
 
}
