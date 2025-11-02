import java.util.Random;

public class ifelse {

	public static void main(String[] args) {
		
		int zufallszahl = (int) (Math.random() * 85); // Bis max. 0-84 Jahre
		
		//System.out.println("Erste: " + zufallszahl);
		
		if (zufallszahl < 18) {
			System.out.println(zufallszahl + " Jahre Alt - Zu Jung für Führerschein");
		} else if (zufallszahl < 60){			// Bei mehr als 2 Bedingungen in einem - else if
			System.out.println(zufallszahl + " Jahre Alt - Kannst Führerschein machen!");
		} else {
			System.out.println(zufallszahl + " Jahre Alt - Zu Alt!");
		}
		
		int a = 5;
		int b = 27;
		
		if (a > b) {
			System.out.println("Du bist zu Jung!");
		} else {
			System.out.println("Du bist Alt genug!");
		}
		
		
		boolean x = b >= 18;
		
		if (x == true) {
			System.out.println("Richtig");
		} else {		// == else if (x == false)
			System.out.println("Falsch");
		}
		
		
		double promille = 0.3;
		
		if (promille > 0.5) {
			System.out.println("Du darfst kein Auto fahren");
		} else {
			System.out.println("Du darfst weiterfahren");
		}
		
		double note = 1.0;
		
		if (note <= 4) {
			System.out.println("Bestanden");
		} else {
			System.out.println("Nicht bestanden");
		}
		
		double laenge = 4.0;
		double luecke = 3.9;
		
		if (laenge == luecke) {
			System.out.println("Passt");
		} else {
			System.out.println("Passt nicht");
		}
		
		int wasser = (int) (Math.random() * 10 * (-1));
		//Random zahl = new Random();
		System.out.println(wasser + " Grad");
		if (wasser > 0) {
			System.out.println("Wasser gefriert nicht");
		} else {
			System.out.println("Wasser gefriert");
		}
		
		int ziel = 21;
		
		int zahl = (int) (Math.random() * 22);
		
		if (zahl <= 17) {
			 System.out.println("noch eine Karte");
		} else if (zahl < ziel) {
			 System.out.println("keine Karte mehr");
		} else if (zahl == ziel) {
			 System.out.println("Blackjack!");
		} else {
			 System.out.println("zu viele Punkte");
		}
		
		int alter = 19;
		
		if(alter > 18) { // oder alter > 18 && alter < 21
			if (alter < 21) {
				System.out.println("Passt");
			}
		} else {
			System.out.println("Passt nicht");
		}
		
		
	}

}
