

public class untermethoden {

	public static void main(String[] args) {
		int[] zahlen = {1, 17, 24, 13, 12, 9, 345, 42};
		int rechner = summe(zahlen);					// new int []... geht auch
		System.out.println(rechner);
		int verarbeiter = verarbeitung(23, 34, 44);
		
		int rechner2 = addiere(1, 5, 3, 8);
		System.out.println(rechner2);			// Vararg Methode ausgeben
	}
	
	public static int summe(int[] params) {		// Methodenkopf
		int ergebnis = 0;						// Methodenrumpf
		int i = 0;
		
		while(i < params.length) {			// nur bei = kombination -1 machen!!!
			ergebnis += params[i];
			i++;
		}
		return ergebnis;
	}
	
	public static int verarbeitung(int a, int b, int c) {			// man kann auch static ArrayList<Integer> lieszahlen(Scanner sc)
		int ergebnis = 0;											// ArrayList<Integer> zahlen = new ArrayList<>();
		int addition = a + b + c;
		
		return ergebnis;
	}
	
	public static int addiere(int... x) {			// Vararg Methode - als Parameter können viele int Werte ion einem eingegeben werden.
		int i = 0;
		int erg = 0;
		while(i < x.length) {
			erg += x[i];
			i++;
		}
		return erg;
	}
}
