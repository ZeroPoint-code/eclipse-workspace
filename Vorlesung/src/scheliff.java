
public class scheliff {

	public static void main(String[] args) {
	/*	
		String s = "Ich teste was teste";
		String[] worte = s.split(" ");
		
		int i = 0;
		
		while (i < worte.length) {
			System.out.println(worte[i]);
			i++;
		}
		
		int umgekehrt = (int) worte.length - 1;
		
		while (umgekehrt >= 0) {
			System.out.println(worte[umgekehrt]);
			umgekehrt--;
		}
		*/
		
		int n = 5;
		int faku = 1;
	    int i = 0;
		
		while(i < n) {
			i++;
			faku = faku * i;
			System.out.println(faku);
		}
		
		int [] zahlen = new int [6];
		
		//VERARBEITUNG TODO

		i = 0;
		
		while (i < zahlen.length) {
			zahlen[i] = (int) (Math.random() * 49) + 1;
			i++;
		}
		
		//Ausgabe
		i = 0;
		while (i < zahlen.length) {
			System.out.println(zahlen[i]);
		}
		
	}

}
