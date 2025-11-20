package leistung2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class sudoku {

	public static void main(String[] args) throws FileNotFoundException {
	    Scanner sc = new Scanner(System.in);
	    
	    // Aufgabe 1:
	    ArrayList<String> eintraege = readFile("resources/sudokus.csv");
	    System.out.println(eintraege.size() + " Sudokus geladen!\n");
	    Random zufall = new Random();
	    
	    
	    
	    // Optional 2
	    int minNullen = Integer.MAX_VALUE;
	    int maxNullen = Integer.MIN_VALUE;

	    for (int i = 0; i < eintraege.size(); i++) {
	        int nullen = 0;
	        String eintrag = eintraege.get(i).split(",")[0];	// Erstes Index pro Zeile
	        for (int j = 0; j < eintrag.length(); j++) {
	            if (eintrag.charAt(j) == '0') {
	                nullen++;
	            }
	        }
	        
	        if (nullen < minNullen) {
	        	minNullen = nullen;
	        }
	        if (nullen > maxNullen) {
	        	maxNullen = nullen;
	        }
	    }
	    
	    int mitte = (minNullen + maxNullen) / 2;
	    // System.out.println(mitte);	
	    // Es sind 51 Nullstellen zwischen den Minimum und Maximum - wichtig für Schwierigkeitsgrad
	    
	   

	    do {
	    	// Aufgabe 5
	        //String eintrag = eintraege.get(zufall.nextInt(eintraege.size()));		// size = 59 | nextInt liefert Zahl zwischen 0-58
	    	String eintrag = eintraege.get(0);
	        //System.out.println(eintrag);		// Ausgewähltes Index
	        String[] felder = eintrag.split(",");
	        
	        int[][] feld = extrahiereSudoku(felder[0]);
	        int[][] loesung = extrahiereSudoku(felder[1]);
	        int leerstellen = zaehleLeerstellen(feld);
	        
	        if(leerstellen < mitte) {		// Optionale Aufgabe: Nullstellen und Schwierigkeitsgrad werden ausgegeben
	        	System.out.println("Schwierigkeitsgrad: Einfach - Leerstellen: " + leerstellen);
	        } else {
	        	System.out.println("Schwierigkeitsgrad: Schwer - Leerstellen: " + leerstellen);
			}
	        

	        
	        boolean[][] vorgabe = new boolean[9][9];		// Überall wo 0 ist = False - wichtig für nicht änderbare Werte!
	        for (int z = 0; z < 9; z++) {
	            for (int s = 0; s < 9; s++) {
	                vorgabe[z][s] = feld[z][s] != 0;
	            }
	        }

	        System.out.println("Sudoku-Spiel gestartet:");
	        gibFeldAus(feld);

	        // Optional 1
	        long startZeit = System.currentTimeMillis();			// enthält die aktuelle Systemzeit in Millisekunden
	        int fehler = 0;

	        while (true) {
	            System.out.print("Bitte geben Sie Zeile, Spalte, Ziffer an!\nAndernfalls geben Sie exit für Ende oder help für Fehlerüberprüfung an: ");
	            String eingabe = sc.nextLine();

	            if (eingabe.equalsIgnoreCase("exit")) {
	                break;
	            } else if (eingabe.equalsIgnoreCase("help")) {
	                gibFeldMitFehlernAus(feld, loesung, vorgabe);
	                continue;
	            }

	            String[] teileEingabe = eingabe.split(", ");		// 3 Werte werden mit einem , getrennt
	            if (teileEingabe.length != 3) {						// Es müssen mindestens 3 Werte angegeben werden!
	                System.out.println("Falsches Format!\n");
	                continue;
	            }

	            int z = Integer.parseInt(teileEingabe[0]) - 1;		// -1 wegen Index
	            int s = Integer.parseInt(teileEingabe[1]) - 1;
	            int zahl = Integer.parseInt(teileEingabe[2]);

	            if (z < 0 || z > 8 || s < 0 || s > 8 || zahl < 1 || zahl > 9) {			// Überprüft ob eingabe außerhalb des Zeilen, Spalte oder Werte liegt
	                System.out.println("Ungültige Eingabe!\n");
	                continue;
	            }

	            if (vorgabe[z][s]) {
	                System.out.println("Vorgabe kann nicht geändert werden!\n");
	                continue;
	            }

	            feld[z][s] = zahl;
	            gibFeldAus(feld);

	            long endZeit = System.currentTimeMillis();
	            long dauer = (endZeit - startZeit) / 1000;	//Dauer des Vorgangs berechnen
	            if (dauer >= 60) {
	                int minuten = (int) (dauer / 60);
	                int sekunden = (int) (dauer % 60);
	                System.out.println("Spielzeit: " + minuten + ":" + String.format("%02d", sekunden));		// Gibt eine Zahl in zwei Stellen aus wie z.B. statt 2:5 - 2:05
	            } else {
	                System.out.println("Spielzeit: " + dauer + " Sekunden");
	            }
	            
	            // Optionale Aufgabe - "Ermöglichen Sie es, nach Spielende ein weiteres Spiel zu starten." ink. do-Schleife
	            // Prüfen ob noch leere Werte vorhanden sind - um nachvollzuziehen ob Spiel abgeschlossen ist
	            boolean leereWerte = false;
	            
	            for (int i = 0; i < 9; i++) {
	                for (int j = 0; j < 9; j++) {
	                    if (feld[i][j] == 0) {
	                        leereWerte = true;
	                        break;
	                    }
	                }
	                if (leereWerte) {
	                	break;
	                }
	            }

	            if (!leereWerte) {
	                fehler = 0; 	// Zurücksetzen für jedes neue Spiel
	                for (int i = 0; i < 9; i++) {
	                    for (int j = 0; j < 9; j++) {
	                        if (feld[i][j] != loesung[i][j]) {
	                            fehler++;
	                        }
	                    }
	                }
	                // Aufgabe 8
	                if (fehler > 0) {
	                    System.out.println("Es sind noch " + fehler + " Fehler im Sudoku! Korrigiere sie.");
	                    gibFeldMitFehlernAus(feld, loesung, vorgabe);
	                } else {
	                    System.out.println("Spiel erfolgreich gelöst! Glückwunsch!");
	                    break;
	                }
	            }
	        }

	        // Optional 3
	        if (fehler == 0) {
	            System.out.print("Möchtest du ein weiteres Spiel spielen? (ja/nein): ");
	            String weiter = sc.nextLine();
	            if (!weiter.equalsIgnoreCase("ja")) {
	                break;
	            }
	        }
	    } while (true);

	    System.out.println("Spiel beendet!");
	    sc.close();
	}

	
	// Aufgabe 2
    public static ArrayList<String> readFile(String path) throws FileNotFoundException {
        ArrayList<String> lines = new ArrayList<>();
        Scanner sc = new Scanner(new File(path));		// liest Datei
        
        while (sc.hasNextLine()) {			// Läuft solange, wie noch eine Zeile verfügbar ist
            lines.add(sc.nextLine());		// Jeweilige Zeile von Datei wird in lines hinzugefügt
        }
        
        sc.close();
        return lines;
    }

    
    // Aufgabe 3
    public static int[][] extrahiereSudoku(String eintrag) {
        int[][] feld = new int[9][9];
        
        for (int z = 0; z < 9; z++) {			// Für jede Zeile
            for (int s = 0; s < 9; s++) {		// Für jede Spalte
                feld[z][s] = eintrag.charAt((z * 9) + s) - '0';		// Holt das Zeichen für die [z][s]-Position im Sudoku + 0 macht daraus eine Zahl - ASCII
            }
        }
        return feld;
    }
    
    // Aufgabe 4
    public static void gibFeldAus(int[][] feld) {
        for (int z = 0; z < feld.length; z++) {
            for (int s = 0; s < feld.length; s++) {
            	if (feld[z][s] == 0) {
            	    System.out.print("° ");	
            	} else {
            	    System.out.print(feld[z][s] + " ");
            	}
            	
                if (s == 2 || s == 5) {
                    System.out.print("| ");							// senkrechter Strich "|" für 9x9 Blöcke
                }
            }
            
            System.out.println();
            if (z == 2 || z == 5) {
                System.out.println("------+-------+------");		// horizontale Trennlinie für 9x9 Blöcke
            }
        }
    }

    // Aufgabe 7
    public static void gibFeldMitFehlernAus(int[][] feld, int[][] loesung, boolean[][] vorgabe) {
        int fehler = 0;
        
        for (int z = 0; z < 9; z++) {
            for (int s = 0; s < 9; s++) {
                if (vorgabe[z][s]) {							// Überall wo True bzw bereits ausgefüllt ist wie in der Original Vorlage
                    System.out.printf("%d ", feld[z][s]);		// % - Formatierungsplatzhalter, d - Ganzzahl
                } else if (feld[z][s] == 0) {					// Wenn es nicht ausgefüllt ist bzw. 0
                    System.out.print("° ");
                } else if (feld[z][s] != loesung[z][s]) {		// Wenn ausgefüllt ist aber darin sich ein Fehler befindet
                    System.out.printf("%d*", feld[z][s]);
                    fehler++;
                } else {
                    System.out.printf("%d ", feld[z][s]);		// Wenn Feld korrekt ausgefüllt ist wird diese normal ausgegeben
                }
                if (s == 2 || s == 5) {
                    System.out.print("| ");							// Erneut Korrigierter senkrechter Strich
                }
            }
            
            System.out.println();
            if (z == 2 || z == 5) {
                System.out.println("------+-------+------");		// Erneut korrigierte horizontale Linie
            }
        }
        
        System.out.println("Fehler: " + fehler);
    }


    
    public static int zaehleLeerstellen(int[][] feld) {
        int leer = 0;
        for (int z = 0; z < 9; z++) {
            for (int s = 0; s < 9; s++) {
                if (feld[z][s] == 0) {
                    leer++;								// Überall wo nicht ausgefüllt ist erhöht sich leer um 1
                }
            }
        }
        return leer;
    }

}