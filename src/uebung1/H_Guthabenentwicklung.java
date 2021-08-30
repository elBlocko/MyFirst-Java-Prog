package uebung1;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class H_Guthabenentwicklung {

	public static void main(String[] args) {
		double guthaben = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie das Startguthaben ein: "));
		double zinssatz = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie den Zinssatz ein: "));
		for (int i = 1; i <= 10; i++) {
			guthaben = guthaben * (1 + zinssatz / 100);
			guthaben = Math.round(guthaben * 100)/100.0;
			System.out.println("Guthaben nach " + i + " Jahren : " +guthaben);
		}
	}

}
