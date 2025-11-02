import java.io.File;
import java.util.Scanner;



public class schleifen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 1;
		while (n<=30) { 
			System.out.println(n + ". Bring Sally up ... bring Sally down");
			n++;
		}
		
		
		String s = "Hallo Tschüss was geht ab";
		
		String[] x = s.split(" ");			// Trennt ab und tut einzelnt in array x
		System.out.println(x[1]);			// 2te Stelle
		
		int i = 0;
		
		while(i < x.length) { // wenn du ein vergleich(==) machen willst mit array.length dann musst du -1
			System.out.println(x[i]);
			i++;
		}
		
		
		int[] z = new int[10];		// In Array kommen nur 10 Werte rein
		
		z = new int[] {0, 8, 15}; 	// Array wird geleert und da kommt 0, 8, 15 rein
		//java.util.Arrays.fill(z, 20);
		i = 0;
		
		while(i < z.length) {
			System.out.println(z[i]);
			i++;
		}
		
		int[] erste = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] zweite = new int[10];
		
		i = 0;

		while(i < erste.length) {
			zweite[i] = erste[i];
			//System.out.println(zweite[i]);
			i++;
		}
		
		i = 0;
		
		while(i < zweite.length) {
			System.out.println("Wert: " + zweite[i]);
			i++;
		}
		
		File file = new File(".");
		System.out.println(file.getAbsolutePath());
		//File[] files = file.listFiles();
		
		i = 0;
		
		while(i < 30) {
			System.out.println("Bring Sally up ... bring Sally down");
			i++;
		}
		
		
		boolean istExit = false;
				
		
		while(istExit == false) {
			System.out.println("Eingeben oder exit: ");
			String eingabe2 = sc.nextLine();
			
			if(eingabe2.equalsIgnoreCase("exit")) {		// Laut Aufgabe geht auch ohne IgnoreCase, weil in Aufgabe nur klein exit gefordert ist!
				istExit = true;
				// break; geht auch und springt aus der Schleife
			}
		}
		
		i = 0;
		
		boolean istNull = false;
		int ergebnis = 0;
		
		while(istNull == false) {
			System.out.println("Zahl eingeben oder Null: ");
			int eingabe3 = sc.nextInt();
			if(eingabe3 == 0) {
				istNull = true;
			} else {
				ergebnis += eingabe3;
			}
		}
		//System.out.println(ergebnis);
		
		int würfel = 0;
		int dreimalsechs = 0;
		
		
		while(dreimalsechs != 18) { 		// Zusatz 1:
			würfel = (int) (Math.random() * 7);
			System.out.println(würfel);
			
			if(würfel == 6) {
				dreimalsechs = würfel + dreimalsechs;
			}
		}
		System.out.println("Drei mal Sechs wurde erfüllt!");
		
		
		würfel = 0;
		/*
		while(true) { 		// Zusatz 2:
			würfel = (int) (Math.random() * 7);
			System.out.println("Erste Zahl:" + würfel);
			
			if(würfel == 6) {
				würfel = (int) (Math.random() * 7);
				System.out.println("Zweite Zahl:" + würfel);
				
				if(würfel == 6) {
					würfel = (int) (Math.random() * 7);
					System.out.println("Dritte Zahl:" + würfel);
					
					if(würfel == 6) {
						System.out.println("Drei Mal 6!!!!");
						break;
					}
				}
			}
		}
		*/
		
		
		
		
		
		sc.close();
	}


}
