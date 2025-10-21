import java.io.File;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class arrayunterr {

	public static void main(String[] args) {
		int [] x = new int [10];
		java.util.Arrays.fill(x, 17);		// Komplette Array auf 17
		
		System.out.println(x[3]);
		
		int[] y = {1, 1, 2, 3, 5, 8, 13};
		
		int[] z;
		z = new int[] {0, 8, 15};			// Arten von Deklaration
		
		
		Scanner sc = new Scanner(System.in);
		
		int eingabe [] = new int [10];
		int ausgabe [] = new int [20];
		
		int i = 0;
		
		do {
			System.out.println("Gib Wert ein: ");
		    eingabe[i] = sc.nextInt();
		    i++;
		} while (i < 10);
		
		i = 0;
		
		while (i < 10) {
		    ausgabe[i] = eingabe[i];
		    i++;
		}
        

        i = 0;
        
        System.out.print("Eingegebene Werte: ");
        do {
            System.out.print(ausgabe[i] + " ");
            i++;
        } while (i < 10);
		
		sc.close();
		
		File file = new File(".");
		System.out.println(file.getAbsolutePath());
		
		File[] files = file.listFiles();
		System.out.println(files[4]);
		
		
		// Aufgabe 1.
		
		Random rand = new Random();
		int n = rand.nextInt(100) + 1;
		
		int ubernahme [] = new int [n];
		i = 0;
        do {
            ubernahme[i] = i + 1; // Hier füllen wir das Array mit den Zahlen 1, 2, 3, ...
            i++;
        } while (i < n);

        System.out.println("Gefülltes Array: " + Arrays.toString(ubernahme));
        
        // Aufgabe 2.
        
        i = 1;
        int quadrat10 [] = new int [11];
        
        do {
        	int quadrat = i * i;
        	quadrat10[i] = quadrat;
        	System.out.println(i + ". te Quadratzahl: " + quadrat10[i]);
        	i++;
        } while (i <= 10);
        
        // Aufgabe 3.
        
        String textnormal = "Ich bin ich ein Student!";
        
        String[] worte = textnormal.split("\\W+");
        
        i = 0;
        while (i < worte.length) {
        	System.out.println(worte[i]);
        	i++; // variable max vergleich mit boolean - aktuelle wort vergelichen mit if - worte i length
        }
        
        // Aufgabe 4.
        
        int[] zahlen = new int[2001];
        
        i = 0;
        
        do {
            zahlen[i] = rand.nextInt(1000); // Zufallszahl zwischen 0 und 999
            //System.out.println(zahlen[i]);
            i++;
        } while (i < zahlen.length); 
        
        i = 0;
        int summe = -1;
        int pos = -1;
        
        while (i < zahlen.length - 2) {
        	int zwischensumme = zahlen[i] + zahlen[i + 1] + zahlen[i + 2];
        	
        	if (zwischensumme > summe) {
        		summe = zwischensumme;
        		pos = i;
        	}
        	i++;
        }
        System.out.println(pos + " Summe = " + summe + " " + zahlen[pos] + " " + zahlen[pos + 1] + " " + zahlen[pos + 2]);
	}

}
