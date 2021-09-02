package uebung10;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Zeitausgabe {

	public static void main(String[] args) {
		// von Linux nullpunkt 01.01.01970
		System.out.println(System.currentTimeMillis());
		// Nullpunkt auf der Zeitachse
		System.out.println("Epoch: " + Instant.EPOCH);
		// kleinstmögliche Zeitangabe (1Mrd Jahre vor dem Nullpunkt)
		System.out.println("Min: " + Instant.MIN);
		// größt Zeitangabe (1Mrd Jahre vor dem Nullpunkt)
		System.out.println("Max: " + Instant.MAX);
		// aktuelle Systemzeit
		Instant zeitpunkt = Instant.now();
		System.out.println(zeitpunkt);
		// Dauer
		Duration dauer = Duration.of(10, ChronoUnit.MINUTES);
		Duration verlaengerung = dauer.plusHours(3);
		System.out.println(verlaengerung);
	}

}
