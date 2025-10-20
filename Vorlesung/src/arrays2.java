import java.io.File;
import java.util.Scanner;

public class arrays2 {

	public static void main(String[] args) {
		String s = "Hallo Welt wie geht es dir";
		
		var worte = s.split(" ");
		
		System.out.println(worte.length);
		
		int i = 0;
		
		while (i < worte.length) {
			System.out.println(worte[i]);
			i++;
		}
		int [] x = new int[10];
		int [] y = {1, 1, 2, 3, 5, 8, 13};
		
		x = new int[] {1, 2, 4};
		
		System.out.println(x[2]);
		
		
		int würfelAnzahl = 5;
		x = new int [würfelAnzahl];
		System.out.println("X Wert: " + x[0]);
		
		while (i < x.length) {
			System.out.println(x[i]);
			i++;
		}
		
		Scanner sc = new Scanner(System.in);
		
		int eingabe [] = new int [10];
		int ausgabe [] = new int [20];
		
		i = 0;
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
        
        System.out.print("Eingegebene Werte: ");
        
        i = 0;
        do {
            System.out.print(ausgabe[i] + " ");
            i++;
        } while (i < 10);
		
		sc.close();
		
		File file = new File(".");
		System.out.println(file.getAbsolutePath());
		File[] files = file.listFiles();
	}

}
