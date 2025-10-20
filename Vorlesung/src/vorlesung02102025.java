import java.util.Scanner;

public class vorlesung02102025 {

	public static void main(String[] args) {
		var monat = 3;
		var jahr = 2002;
		var tag = 21;
		var wochentag = "";

		if (monat <= 2) {
		    monat = monat + 10;
		    jahr = jahr - 1;
		} else {
		    monat = monat - 2;
		}

		System.out.println("Monat: " + monat);
		System.out.println("Jahr: " + jahr);

		var c = jahr / 100;
		var y = jahr % 100;

		System.out.println("Durch: " + c);
		System.out.println("Modulo: " + y);

		var h = (((26 * monat - 2) / 10) + tag + y + y / 4 + c / 4 - 2 * c) % 7; 

		System.out.println("h-Rechnung: " + h);

		h = (h + 7) % 7;

		System.out.println("h-Modulo: " + h);

		if (h == 0) {
		    wochentag = "Sonntag";
		} else if (h == 1) {
		    wochentag = "Montag";
		} else if (h == 2) {
		    wochentag = "Dienstag";
		} else if (h == 3) {
		    wochentag = "Mittwoch";
		} else if (h == 4) {
		    wochentag = "Donnerstag";
		} else if (h == 5) {
		    wochentag = "Freitag";
		} else if (h == 6) {
		    wochentag = "Samstag";
		}

		System.out.println("Wochentag: " + wochentag);
		
		var hoch = 1.345e2;
		float d = 17.4f % 4;		
		
		System.out.println("Wochentag: " + d);
		
		//boolean
		
		var boolUndund = true && false; 	// && wenn beginn false ist gut sich das ganze nicht an nur wenn anfang true
		var boolTest = false & false; 	// nur bei doppel true = true AND
		var boolOder = true | false; 	// überall wo true dabei ist = true OR
		var boolXor = true ^ false; 	// wie XOR 
		
		//scanner
		System.out.println("Gibt ein Text ein: ");
		Scanner sc = new Scanner(System.in);
		
		String eingabe = sc.nextLine();
		
		System.out.println("Eingabe ist: " + eingabe); //Text eingabe
		System.out.println("Ist die Eingabe gleich 'Hallo'?" );
		System.out.println(eingabe.equals("Hallo"));
		System.out.println("Hallo" == "Hallo");
		
		sc.close();
		
	}

}
