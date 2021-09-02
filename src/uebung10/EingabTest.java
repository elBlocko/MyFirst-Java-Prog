package uebung10;

import java.time.Duration;
import java.time.Instant;

import javax.swing.JOptionPane;

public class EingabTest {

	public static void main(String[] args) {

		String soll = "Fischers Fritz fischt frische Fische";
		Instant startEingabeAufforderung = Instant.now();

		String eingabe = JOptionPane.showInputDialog("Geben Sie so schnell wie möglich \n" + soll + " ein");
		Instant endeDerEingabe = Instant.now();
		long min, sec, mili;
		Duration dauer = Duration.between(startEingabeAufforderung, endeDerEingabe);
		min = dauer.toMinutes();
		sec = dauer.getSeconds() - min * 60;
		mili = dauer.getNano() / 1000000;

		if (eingabe != null && eingabe.equals(soll)) {
			System.out.println("FehlerFrei! Zeit: " + min + 
					" Minuten " + sec + " Sekunden " + mili + " Milisekunden");
		} else {
			System.out.println("Eingabe war falsch");
		}
	}
}
