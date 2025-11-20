package leistung2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class sudokuzain {

    public static void main(String[] args) throws FileNotFoundException {
        //Datei einlesen
        ArrayList<String> eintraege = readFile("./resources/sudokus.csv"); 

        System.out.println("Herzlich Willkommen bei Sudoku! Viel Spaß :)");
        System.out.println(eintraege.size() + " Sudokus geladen.");

        Random random = new Random();
        boolean weiterspielen = true;

        while (weiterspielen) {
            //zufälligen Index zwischen 0 und eintraege.size() wählen, um ein zufälliges Sudoku auszuwählen
	        int zufallI = random.nextInt(eintraege.size());               
            //ursprüngliches Sudoku, bearbeitsbares Spielfeld und Lösungsfeld extrahieren        		
	        int[][] startFeld = extrahiereSudoku(eintraege.get(zufallI));       
            //spielFeld wird vom Spieler bearbeitet		
	        int[][] spielFeld = kopiereFeld(startFeld);                              	
	        int[][] loesungsFeld = extrahiereLoesungsFeld(eintraege.get(zufallI)); 	  							
	        
            //spiel starten
	        spieleSudoku(startFeld, spielFeld, loesungsFeld); 
            //scanner um Spielereingabe zu lesen       		
	        Scanner sc = new Scanner(System.in);
	        String antwort = sc.nextLine().trim();		
            //abfrage, falls der Spieler exit eingibt
            //falls nicht j, dann spiel beenden
	        if (!antwort.equalsIgnoreCase("j")) {										
	        	weiterspielen = false;							
	        	System.out.println("Spiel beendet");
	        }
        }
    } 

    //liest die .csv Datei ein und speichert jede Zeile in einer Liste
    public static ArrayList<String> readFile(String path) throws FileNotFoundException {
        //neue Liste für alle Zeilen der Datei
        ArrayList<String> lines = new ArrayList<>();          						
        Scanner sc = new Scanner(new File(path)); 
        //durchläuft die Datei Zeile für Zeile            						
        while (sc.hasNextLine()) {													
            lines.add(sc.nextLine());												
        }
        sc.close();

        //gibt die Liste mit den Zeilen zurück
        return lines;																
    }

    //wandelt das Rätsel aus der Liste in ein 9 mal 9 Sudoku-Feld um
    public static int[][] extrahiereSudoku(String eintrag) {
        //trennt die Zeilen voneinander
        String[] felder = eintrag.split(",");                                    	
        int[][] feld = stringZuSudokuFeld(felder[0]);      
        //gibt das 9 mal 9 Sudoku-Feld zurück                       	
        return feld;                                                          
    }

    //wandelt die Lösung aus der Liste in ein 9 mal 9 Sudoku-Feld um
    public static int[][] extrahiereLoesungsFeld(String eintrag) {
        String[] felder = eintrag.split(",");										
        int[][] loesung = stringZuSudokuFeld(felder[1]);                          	
        return loesung;                                                           	
    }

    // Wandelt einen 81-Zeichen-String in ein 9x9-Feld um
    public static int[][] stringZuSudokuFeld(String belegung) {
        //erstellt ein neues Array für das Sudoku-Feld
        int[][] feld = new int[9][9];                                           	
        for (int z = 0; z < 9; z++) {                               				
            for (int s = 0; s < 9; s++) {         
                //wandelt jedes Zeichen in eine Zahl um und speichert sie an der richtigen Position im Array               					
                feld[z][s] = belegung.charAt((z * 9) + s) - '0';    				
            }
        }
        return feld;                                                            	
    }

    //gibt das Sudoku-Feld formatiert und lesbar in der Konsole aus
    public static void gibSudokuFormatiertAus(int[][] feld) {
        System.out.println("  Aktuelles Sudoku:");
        //läuft alle zeilen durch
        for (int z = 0; z < 9; z++) {
            //läuft alle spalten durch
            for (int s = 0; s < 9; s++) {
                //wert an der position z,s wird in der variable gespeichert
                int wert = feld[z][s];
                //falls dies ein leeres feld ist, wird ein x ausgegeben
                if (wert == 0) {
                    System.out.print("x ");
                //ansonsten wird der wert ausgegeben
                } else {
                    System.out.printf("%d ", wert);									
                }
                //abtrennung zwischen den Blöcken
                if (s == 2 || s == 5) {												
                    System.out.print("| ");
                }
            }
            System.out.println();
            //abtrennung zwischen den Blöcken
            if (z == 2 || z == 5) {												
                System.out.println("---------------------");
            }
        }
    }

    //erstellt eine Kopie des Sudoku-Feldes.
    public static int[][] kopiereFeld(int[][] original) {		
        //neues Array für die Kopie					
        int[][] kopie = new int[9][9];      
        //durchläuft alle Zeilen laufen                                     	
        for (int z = 0; z < 9; z++) {         
            //durchläuft lle Spalten laufen                       				
            for (int s = 0; s < 9; s++) {       
                //werte werden an die gleiche Position kopiert                  					
                kopie[z][s] = original[z][s];                  						
            }
        }
        return kopie;                                                            	
    }

    //führt das Spiel aus und verarbeitet die Eingaben des Spielers.
    public static void spieleSudoku(int[][] startFeld, int[][] spielFeld, int[][] loesungsFeld) {
        Scanner sc = new Scanner(System.in);

        //schleife läuft bis zu einem break
        while (true) {
            //neue zeile für bessere lesbarkeit
            System.out.println();
            //gibt das aktuelle Spielfeld für den Spieler lesbar aus
            gibSudokuFormatiertAus(spielFeld);         
            //ausgaben für den Spieler                          
            System.out.println();
            System.out.println("Eingabe: zeile | spalte | zahl (1-9), 'help' für Fehler oder 'exit' zum Beenden:");
            System.out.print("Hier eingeben: ");
            //eingabe des Spielers lesen
            String eingabe = sc.nextLine().trim();                              

            //falls der Spieler exit eingibt, wird das Spiel beendet und gefragt ob ein neues Spiel gestartet werden soll
            //in der while schleife von main wird dann die Eingabe ausgewertet
            if (eingabe.equalsIgnoreCase("exit")) {
            	//System.out.println("Neues Spiel j/n?");
                break;
            }
            //falls der Spieler help eingibt, werden die Fehler im aktuellen Spielfeld geprüft und angezeigt
            if (eingabe.equalsIgnoreCase("help")) {									
                pruefeUndZeigeFehler(startFeld, spielFeld, loesungsFeld);    
                //mache weiter bei der nächsten Eingabe  	
                continue;															
            }

            //spieler gibt zeile, spalte und zahl ein
            //trim entfernt führende und nachfolgende Leerzeichen
            //split teilt die Eingabe an den Leerzeichen auf und speichert sie in einem array
			String[] eingabe_2 = eingabe.trim().split(" ");   	
            //array mit der länge 3 aus strings um die Eingabe zu speichern						
			String[] werte = new String[3];             							
			int index = 0;
			for (int i = 0; i < eingabe_2.length; i++) {
                //falls kein leerer string vom Spieler eingegeben wurde, wird dieser im array gespeichert
			    if (eingabe_2[i].length() > 0) {        
                    //es wird gespeichert bis wir 3 werte haben      						
			        if (index < 3) {
			            werte[index] = eingabe_2[i];
			            index++;
			        }
			    }
			}

            //falls nicht 3 werte gespeichert werden konnten, weil in der Eingabe nicht genug übergeben wurden
            //wird eine Fehlermeldung ausgegeben und die Eingabe wird ignoriert
            if (index != 3) {                           							
                System.out.println("Bitte genau 3 Werte eingeben: z.B. '3 5 9'");
                //schleife wird von vorne durchlaufen
                continue;
            }

            //eingabewerte werden in int umgewandelt
            //die zeilen- und spaltennummer werden um 1 verringert, um das Array richtig anzusprechen
            int zeile  = Integer.parseInt(werte[0]) - 1;   							
            int spalte = Integer.parseInt(werte[1]) - 1;                        	
            int zahl   = Integer.parseInt(werte[2]);       							

            //falls der Spieler versucht in ein volles Feld zu schreiben, wird eine Fehlermeldung ausgegeben
            if (startFeld[zeile][spalte] != 0) {									
                System.out.println("Dieses Feld ist vorgegeben und darf nicht geändert werden!");
                continue;                                                       	
            }

            //zahl wird eingetragen
            spielFeld[zeile][spalte] = zahl;										
            System.out.println("Zahl eingetragen.");

            //prüfen, ob das Sudoku vollständig ist
            boolean voll = true;                                                	
            for (int z = 0; z < 9; z++) {                                       	
                for (int s = 0; s < 9; s++) {                                   	
                    if (spielFeld[z][s] == 0) {		
                        //bei einem leeren feld wird das Sudoku als nicht vollständig betrachtet								
                        voll = false;           
                        //bricht innere Schleife ab                                	
                        break;                                                  	
                    }
                }
                //bei nicht vollständigem Sudoku wird die äußere Schleife abgebrochen
                if (!voll) {                                                    	
                    break;                                                      	
                }
            }
            
            //falls das Sudoku vollständig ist, wird es mit der Lösung verglichen und ausgewertet
            //voll == true
            if (voll) {                                                    
                //anzahl der fehler wird hier gespeichert     	
                int fehler = pruefeUndZeigeFehler(startFeld, spielFeld, loesungsFeld);  
                //falls keine Fehler
                if (fehler == 0) {                                              	
                    System.out.println("Glückwunsch! Das Sudoku wurde korrekt gelöst.");
                } else {                                                        	
                    System.out.println("Sudoku ist voll, aber es sind noch Fehler enthalten.");
                }

                //spiel wird beendet und die Schleife wird abgebrochen
                break;																
            }

            
        }

        //abfrage ob man ein neues spiel starten möchte
        System.out.println("Neues Spiel j/n?");
  				
    }


    //prüft das Spielfeld des Spieler auf Fehler und gibt die Anzahl der Fehler zurück
    public static int pruefeUndZeigeFehler(int[][] startFeld, int[][] spielFeld, int[][] loesungsFeld) {
        //zähler für die fehler
        int fehler = 0; 															
        System.out.println("Falsche Zahlen werden mit * markiert:");
        System.out.println();
        for (int z = 0; z < 9; z++) {
            for (int s = 0; s < 9; s++) {
                int wert = spielFeld[z][s];
                if (startFeld[z][s] != 0) {
                    System.out.printf("%d ", wert);
                } else if (wert == 0) {
                    System.out.print("x ");
                } else if (wert != loesungsFeld[z][s]) {
                    System.out.printf("%d*", wert);
                    fehler++;
                } else {
                    System.out.printf("%d ", wert);
                }			
                //abtrennung zwischen den Blöcken	
                if (s == 2 || s == 5) {												
                    System.out.print("| ");
                }
            }
            System.out.println();
            //abtrennung zwischen den Blöcken	
            if (z == 2 || z == 5) {													
                System.out.println("---------------------");
            }
        }

        System.out.println();
        System.out.println("Du hast " + fehler + " Fehler." );
        return fehler;
    }
}
