import java.util.Scanner;

public class vorlesung0910 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eingabe Promille: ");
		double promille = sc.nextDouble();
		
		if (promille >= 0.5) {
			System.out.println("Person darf kein Auto fahren");
		} else {
			System.out.println("Fahrzeug darf benutzt werden");
		}
		
		System.out.println("Eingabe Note: ");
		double note = sc.nextDouble();
		
		if (note >= 4.0) {
			System.out.println("Prüfung bestanden");
		} else {
			System.out.println("Prüfung nicht bestanden");
		}
		
		double lücke = 20.0;
		double stein = 19.9;
		
		if ((lücke <= stein) && (stein >= lücke - 0.2)) {
			System.out.println("Passt");
		} else {
			System.out.println("Passt nicht");
		}
		
		int wassertemp = 35;
		
		if ((wassertemp > 100) && (wassertemp < 100)) {
			System.out.println("Wasser gefriert");
		} else if (wassertemp > 100) {
			System.out.println("Wasser kocht");
		}
		
		int zahl = 17;
		int blackJack = 21;
		
		if (zahl <= 17) {
			System.out.println("noch eine Karte");
		} else if (zahl < blackJack) {
			System.out.println("keine Karte mehr");
		} else if (zahl == blackJack) {
			System.out.println("BlackJack!");
		} else {
			System.out.println("zu viele Punkte");
		}
		
		
		
		double gewicht = 2850.41;
		
		if (gewicht <= 4000.0) {
			System.out.println("Straße darf befahren werden");
		} else {
			System.out.println("Straße darf nicht befahren werden");
		}
		
		
		
		sc.close();

	}

}
