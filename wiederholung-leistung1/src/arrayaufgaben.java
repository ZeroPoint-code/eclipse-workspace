import java.io.File;
import java.util.Scanner;

public class arrayaufgaben {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = ("Hallo Welt wie geht es Dir");
		
		String[] worte = s.split(" ");
		
		System.out.println(worte[0]);
		
		System.out.println(worte.length);
		
		int[] x = new int[10];				// Platz für 10 Int's
		
		java.util.Arrays.fill(x, 17);		// Füllt alle Plätze mit 17
		
		int[] z = new int [] {0, 8, 10};	// Array erstellt mit 3 Index
		
		
		int i = 0;
		int würfelzahl = 5;
		int[] würfel = new int[würfelzahl];
		
		while(i < würfel.length) {
			würfel[i] = (int) (Math.random() * 6) + 1;		// zwischen 1-6
			System.out.println(würfel[i]);
			i++;
		}
		
		x = new int[100];			// nachträglich 100 plätze vergeben
		
		int[] bef = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

		int[] kop = new int[10];
		
		i = 0;
		
		while(i < bef.length) {		// Aufgabe alles von bef in kop reinkopieren
			kop[i] = bef[i];
			System.out.println(kop[i]);
			i++;
		}
		
		File file = new File(".");
		System.out.println(file.getAbsolutePath());		// gibt aktuellen Verzeichnis aus
		
		System.out.println("-------------");
		System.out.println("Aufgabe 1");
		
		// Aufgabe 1
		int zufallszahl = (int) (Math.random() * 22);
		
		int[] zufall = new int[zufallszahl];
		System.out.println(zufall.length + ". Plätze Index");
		
		i = 0;
		
		while(i < zufall.length) {
			zufall[i] = (int) (Math.random() * 10000);
			System.out.println(zufall[i]);
			i++;
		}
		
		System.out.println("-------------");
		System.out.println("Aufgabe 2");
		
		// Aufgabe 2
		
		int[] quadrat = new int[10];
		
		i = 0;
		int zahl = 1;
		
		while(i < quadrat.length) {
			quadrat[i] = zahl * zahl;
			System.out.println(quadrat[i]);
			i++;
			zahl++;
		}
		
		System.out.println("-------------");
		System.out.println("Aufgabe 3");
		
		// Aufgabe 3
		
		String eingabesatz = sc.nextLine();
		String[] eingabesplit = eingabesatz.split(" ");
		
		String laengste = "";
		i = 0;

		
		while (i < eingabesplit.length) {
            if (eingabesplit[i].length() > laengste.length()) {
                laengste = eingabesplit[i];
            }
            i++;
        }
		System.out.println(laengste);
		
		System.out.println("-------------");
		System.out.println("Aufgabe 4");
		
		
		// Aufgabe 4
		
		int[] array2001 = new int [2001];		// 2001 Plätze
		i = 0;
		
		while(i < array2001.length) {
			array2001[i] = (int) (Math.random() * 1000);		// Alle mit Zufallszahlen gefüllt
			i++;
		}
		
		int zahllaengste = 0;
		i = 0;
		
		while (i < array2001.length - 2) {
			int aktuell = (int) (array2001[i] + array2001[i + 1] + array2001[i + 2]);
			System.out.println("Zahl 1: " + array2001[i] + " ; Zahl 2: " + array2001[i + 1] + " ; Zahl 3: " + array2001[i + 2]);
            if (aktuell > zahllaengste) {
                zahllaengste = aktuell;
            }
            i++;
        }
		System.out.println("Längste Kombi: " + zahllaengste);
		
		sc.close();
	}

}
