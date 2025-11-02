import java.io.File;
import java.util.Scanner;


public class whileee {

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
		
		sc.close();
	}


}
