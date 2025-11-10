package leistung2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class sudoku {

	public static void main(String[] args) throws FileNotFoundException{
		ArrayList<String> einträge = readFile("extern/sudokus.csv");
		
		System.out.println(einträge.size() + " Sudokus geladen! \n");
		
		for (String eintrag : einträge) {
			System.out.println(eintrag);
		}
		
		System.out.println();
		
		extrahiereSudoku(einträge.get(21));

	}
	
	public static ArrayList<String> readFile(String path) throws FileNotFoundException {

		   ArrayList<String> lines = new ArrayList<>();
		   Scanner sc = new Scanner(new File(path));

		   while (sc.hasNextLine()) {
		      lines.add(sc.nextLine());
		   }

		   sc.close();

		   return lines;
		}
	
	public static int[] [] extrahiereSudoku(String eintrag) {
		String[] felder = eintrag.split(",");
		System.out.println(felder[0]);
		
		int[][] feld = new int[9][9];
		
		for (int i = 0; i < feld.length; i++) {
			feld[0][i] = felder[0].charAt(i) - '0';		// Vom ASCII Code 0 abziehen
			
			
			System.out.println(feld[0][i]);
			
		}
		
		return feld;
	}

}
