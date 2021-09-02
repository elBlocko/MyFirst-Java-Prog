package uebung10;

import java.time.Duration;
import java.time.Instant;

import javax.swing.JOptionPane;

public class EingabTest {

	public static void main(String[] args) {
		Instant startEingabeAufforderung = Instant.now();
		String eingabe = JOptionPane
				.showInputDialog("Geben Sie so schnell wie möglich \n 'Fischers Fritz fischt frische Fische' ein");
		String soll = "Fischers Fritz fischt frische Fische";
		if (eingabe.equals(soll)) {
			System.out.println("FehlerFrei!");
			Instant endeDerEingabe = Instant.now();
			Duration dauer = Duration.between(startEingabeAufforderung, endeDerEingabe);
			System.out.println(
					"FehlerFrei! Zeit: " + dauer.toMinutes() + " " + dauer.toSeconds() + " " + dauer.toMillis());
		} else {
			System.out.println("Eingabe war falsch");
		}
	}
}
