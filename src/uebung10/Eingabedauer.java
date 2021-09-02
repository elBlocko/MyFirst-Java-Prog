package uebung10;

import java.time.Duration;
import java.time.Instant;

import javax.swing.JOptionPane;

public class Eingabedauer {

	public static void main(String[] args) {
		Instant startEingabeAufforderung = Instant.now();
		JOptionPane.showInputDialog("Geben Sie ihren Namen ein");
		Instant endeDerEingabe = Instant.now();
		Duration dauer = Duration.between(startEingabeAufforderung, endeDerEingabe);

		System.out.println("Dauer nach ISO-8601: " + dauer);
		System.out.println("Dauer nach in Min: " + dauer.toMinutes());
		System.out.println("Dauer nach in Sec: " + dauer.getSeconds());
		System.out.println("Dauer nach in Milis: " + dauer.toMillis());

	}

}
