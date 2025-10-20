import java.util.Scanner;

public class abgabe {

	public static void main(String[] args) {
		
		// Aufgabe 1
		System.out.print("Aufgabe 1\n");
		System.out.println("Hello-World"); // Ausgabe - Hello-World
		
		// Aufgabe 2
		System.out.print("\nAufgabe 2\n");
		int intAddition = 1 + 2;
		int intSubtraktion = 1 - 2;
		int intMultiplikation = 1 * 2;
		int intDivision = 10 / 2;
		System.out.println("Int-Beispielausgabe: " + intDivision); // Pro Datentyp eine Beispielsausgabe
		
		double doubleAddition = 10.5 + 5.1;
		double doubleSubtraktion = 10.3 - 5.4;
		double doubleMultiplikation = 10.3 * 5.5;
		double doubleDivision = 10.7 / 2.5;
		System.out.println("Double-Beispielausgabe: " + doubleMultiplikation);

		String stringAddition = "Test" + "123";
		System.out.println("String-Beispielausgabe: " + stringAddition);
		
		boolean booleanVergleich = true == false;
		boolean booleanGroesser = 10 > 1;
		boolean booleanKleiner = 100 < 1000;
		System.out.println("Boolean-Beispielausgabe: " + booleanVergleich);
		
		
		// Aufgabe 3
		System.out.print("\nAufgabe 3\n");
		System.out.println("And True True: " + (true & true) + " OR True True: " + (true | true) + " XOR True True: " + (true ^ true)); 			//Kombination 1
        System.out.println("And True False: " + (true & false) + " OR True False: " + (true | false) + " XOR True False: " + (true ^ false));		//Kombination 2	
        System.out.println("And False True: " + (false & true) + " OR False True: " + (false | true) + " XOR False True: " + (false ^ true));		//Kombination 3
        System.out.println("And False False: " + (false & false) + " OR False False: " + (false | false) + " XOR False False: " + (false ^ false));	//Kombination 4
		
        // Aufgabe 4
        System.out.print("\nAufgabe 4\n");
        var monat = 3;
		var jahr = 2002;
		var tag = 21;
		var wochentag = "";

		if (monat <= 2) {				// Tritt auf, wenn Variable monat kleiner als / gleich 2 ist
		    monat = monat + 10;
		    jahr = jahr - 1;
		} else {						// Tritt auf wenn erste Bedingung nicht auftritt
		    monat = monat - 2;
		}

		System.out.println("Monat: " + monat); 		// Die Outputs dienen zum Überprüfen bzw. nachvollziehen der Zwischenschritte.
		System.out.println("Jahr: " + jahr);

		var c = jahr / 100;
		var y = jahr % 100;

		System.out.println("Durch: " + c);
		System.out.println("Modulo: " + y);

		var h = (((26 * monat - 2) / 10) + tag + y + y / 4 + c / 4 - 2 * c) % 7; 

		System.out.println("h-Rechnung: " + h);

		h = (h + 7) % 7;

		System.out.println("h-Modulo: " + h);

		if (h == 0) {					// Hier wird nach dem Wert von h (0-6) die Wochentage vergeben in Variabel wochentag
		    wochentag = "Sonntag";
		} else if (h == 1) {
		    wochentag = "Montag";
		} else if (h == 2) {
		    wochentag = "Dienstag";
		} else if (h == 3) {
		    wochentag = "Mittwoch";
		} else if (h == 4) {
		    wochentag = "Donnerstag";
		} else if (h == 5) {
		    wochentag = "Freitag";
		} else if (h == 6) {
		    wochentag = "Samstag";
		}

		System.out.println("Wochentag: " + wochentag);			// Ausgabe vom jeweiligen Wochentag
        
		// Aufgabe 5
		System.out.print("\nAufgabe 5\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEVA - 1\n");
		System.out.println("Geben Sie die Strecke ein: ");		
		double strecke = sc.nextDouble();						// Eingabe der Strecke in Fließkommazahlen
		
		System.out.println("Geben Sie die vorhandene Benzinmenge ein: ");	
		double benzinmenge = sc.nextDouble();		// Eingabe vom vorhandenen Bezinmenge in Fließkommazahlen
		
		double verbrauch = 5.5;
		System.out.println("Der verbrauch des Fahrzeuges beträgt: " + verbrauch + "l kombiniert auf 100km (d.h. Innerorts & Außerorts)."); // Ausgabe wie viel Liter Fahrzeug verbraucht auf 100km
		
		double benzinverbrauch = (verbrauch * strecke) / 100; 	// Verarbeitung
		System.out.println("Bei " + strecke + "km mit einer Benzinmenge von " + benzinmenge + "l und einem verbrauch von " + verbrauch +"l liegt der Brenzinverbrauch bei " + benzinverbrauch + "l."); // Ausgabe wie viel Benzin das Fahrzeug verbraucht bei der eingegebenen Strecke
		
		System.out.print("\nEVA - 2\n");
		System.out.println("Geben Sie die Anzahl der Artikel ein: "); 	// Eingabe Anzahl der Artikel
        int anzahl = sc.nextInt();
        
        System.out.println("Geben Sie den Preis pro Artikel ein (in Euro): ");	//Eingabe vom Preis pro Artikel
        double preisProArtikel = sc.nextDouble();

        double gesamtpreis = anzahl * preisProArtikel;		// Verarbeitung

        System.out.println("Der Gesamtpreis beträgt: " + gesamtpreis + "€.");	// Ausgabe vom Gesamtpreis
		
		sc.close();
		
		// Aufgabe 6
		System.out.print("\nAufgabe 6\n");
		
		// byte hat 8 Bit
        int byteBits = 8;
        int byteMax = (int)(Math.pow(2, byteBits) / 2 - 1);  		// 2^(8) / 2 - 1
        int byteMin = (int)(Math.pow(2, byteBits) / 2 * (-1));		// 2^(8) / 2 * (-1)
        System.out.println("Wertebereich von byte: " + byteMin + " bis " + byteMax);		// Ausgabe wie welchen Wert max byte im positiven und negativen Bereich annehmen darf

        // int hat 32 Bit
        int intBits = 32;
        long intMax = (long)(Math.pow(2, intBits) / 2 - 1);   		// 2^(32) / 2 - 1
        long intMin = (long)(Math.pow(2, intBits) / 2 * (-1));  	// 2^(32) / 2 * (-1)
        System.out.println("Wertebereich von int: " + intMin + " bis " + intMax);			// Ausgabe wie welchen Wert max int im positiven und negativen Bereich annehmen darf

        
        // long hat 64 Bit
        int longBits = 64;
        long longMax = (long)(Math.pow(2, longBits) / 2 - 1);   	// 2^(64) / 2 - 1
        long longMin = (long)(Math.pow(2, longBits) / 2 * (-1));  	// 2^(64) / 2 * (-1)
        System.out.println("Wertebereich von long: " + longMin + " bis " + longMax);		// Ausgabe wie welchen Wert max long im positiven und negativen Bereich annehmen darf
        
		
		/**
			Aufgabe 7
			Ein 32-Bit-Rechner vergibt für jede Speicheradresse genau 32 Bit, das sind vier Byte.
			Damit kann er 2^32 verschiedene Adressen bauen. Das ergibt ungefähr 4,3 Milliarden Adressen.
			Da jede Adresse für ein einzelnes Byte steht, lassen sich so maximal 4 GB Speicher direkt mit einer eigenen Adresse erreichen.
			Größerer Speicher geht nicht, weil die Adresskombinationen irgendwann einfach aufgebraucht sind.
			Quelle: https://de.wikipedia.org/wiki/4-GB-Grenze
		 */
	}

}
