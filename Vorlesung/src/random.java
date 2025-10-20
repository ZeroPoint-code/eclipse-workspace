import java.util.Random;
import java.util.Scanner;

public class random {

	public static void main(String[] args) {
		Random würfel = new Random();
		würfel.nextInt(6);
		System.out.println(würfel.nextInt(6));
		
		int zufallszahl = (int) (Math.random() * 10);
		Scanner sc = new Scanner(System.in);
		
		int eingabe;
		do {
			System.out.println("Bitte gib eine Zahl zwischen " + " 0 und 9 ein: ");
			eingabe = sc.nextInt();
			if (eingabe != zufallszahl) {
				System.out.println(eingabe + " ist leider falsch!");
			}
		} while(eingabe != zufallszahl);
		System.out.println("Super, Du hast die Zahl erraten.");
	
		String exitt = "Exit";
		String eingabe2;
		
		do {
			System.out.println("Bitte gib Exit ein: ");
			eingabe2 = sc.next();
			if (!eingabe2.equals(exitt)) {
				System.out.println(eingabe2 + " ist leider falsch!");
			}
		} while(!eingabe2.equals(exitt));
		System.out.println("Super, Du hast Exit eingegeben.");
		
		
		
		sc.close();

	}
}
