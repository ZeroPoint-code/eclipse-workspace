import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class testetsterrr {

	public static void main(String[] args) throws FileNotFoundException {
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

		for(int z = 0; z < feld.length; z++) {
			for (int s = 0; s < feld.length; s++) {
				feld[z][s] = felder[0].charAt((z * 9) + s) - '0';		// Vom ASCII Code 0 abziehen
				//System.out.println(feld[z][s]);

			}
		}
		gibFeldAus(feld);
		return feld;

	}
	
	public static void gibFeldAus(int[][] feld) {
		for(int z = 0; z < feld.length; z++) {
			for (int s = 0; s < feld.length; s++) {
				System.out.print(feld[z][s] + " " );
			}
			
			System.out.println();
		}
	}

}