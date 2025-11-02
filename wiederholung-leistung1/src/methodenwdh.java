import java.util.Scanner;

import com.sun.security.auth.NTDomainPrincipal;
import com.sun.tools.classfile.StackMapTable_attribute.chop_frame;

public class methodenwdh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = addierer(5, 2, 1);
		System.out.println(x);
		
		zeilenumbruch();
		
		int y = 34;
		int a = 34;
		int b = 88;
		
		int m = addierer(y, a, b);
		System.out.println(m);
		
		zeilenumbruch();
		
		System.out.println(addierer(4, 2, 1));
		
		boolean tester = schleifenfalltrick(20);
		
		System.out.println(tester);
		
		zeilenumbruch();
		
		System.out.println(ifrechner(5));
		
		
		// Aufgabe 1:
		int xyz = zufallzahlen(10, 20);
		System.out.println(xyz);
		
		
		String gegeben = "India";
		String ergebni = boom(gegeben);
		System.out.println(ergebni);
		

		
		sc.close();
	}
	
	public static int addierer(int zahl1, int zahl2, int zahl3) {
		return zahl1 + zahl2 + zahl3;
	}
	
	public static boolean schleifenfalltrick(int limit) {
		int sum = 0;
		
		for(int i = 0; i < limit; i++) {
			sum += 1;					
			//return sum > 21;			- egal was passiert, false kommt raus weil die sich schneiden und der letzte vorrang hat!
		}
		
		return false;
	}
	
	public static boolean ifrechner(int zahl) {
		if(zahl > 18) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void zeilenumbruch() {
		System.out.println("\n\n");
	}
	
	// Aufgabe 1:
	public static int zufallzahlen(int x, int y) {
		int dazwischen = (int) (Math.random() * (y - x + 1)) + x;
		return dazwischen;
	}
	
	// Aufgabe 2
	public static String boom(String x) {
		
		String umgedrehtString = "";
		for(int i = x.length() - 1; i >= 0; i--) {
			umgedrehtString += x.charAt(i);
		}
		
		return umgedrehtString;
	}
	
	

}
