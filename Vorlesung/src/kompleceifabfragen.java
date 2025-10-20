import java.util.Scanner;

public class kompleceifabfragen {

	public static void main(String[] args) {
		int alter;
		boolean istMitglied;
		String wochentag;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Alter eingeben: ");
		alter = (int) sc.nextInt();
		System.out.println("Eingeben Mitglied true/false: ");
		istMitglied = (boolean) sc.nextBoolean();
		System.out.println("Wochentag eingeben: ");
		wochentag = (String) sc.next();
		
		if ((alter < 25) && (!wochentag.equals("Samstag"))) {
			System.out.println("Ein Rabatt von 20% erhalten, da unter 25 und nicht Samstag!");
		} else if ((alter >= 65) || (wochentag.equals("Dienstag"))) {
			System.out.println("Ein Rabatt von 30% erhalten, da ü. 65 und Dienstag");
		}
		
		if (istMitglied == true) {
			System.out.println("Ein Rabatt von 10% erhalten, da Mitglied");
		}
		
		double gewichtKg;
		double laengeCm;
		boolean istZerbrechlich;
		
		System.out.println("Gewicht in KG eingeben: ");
		gewichtKg = sc.nextDouble();
		System.out.println("Länge in CM eingeben: ");
		laengeCm = sc.nextDouble();
		System.out.println("Ist die Ware zerbrechlich? true/false: ");
		istZerbrechlich = sc.nextBoolean();
		
		if ((gewichtKg >= 1.0) && (gewichtKg <= 5) && (laengeCm <= 80.0) ) {
			if ((istZerbrechlich == false) && (gewichtKg < 3)) {
				System.out.println("Premium-Express:");
			} else {
				System.out.println("Standart-Expressversand!");
			}
			
		} else if ((gewichtKg > 10) || (laengeCm > 150)) {
			System.out.println("Abgelehnt!");
		} else {
			System.out.println("Garnicht zulässig!");
		}
		
		
		System.out.println("Monat eingeben als Zahl: ");
		int monat = sc.nextInt();
		System.out.println("Tag eingeben: ");
		int tag = sc.nextInt();
		System.out.println("Norden oder Süden?");
		String hemisphäre = sc.next();
		
		if (hemisphäre.equals("Norden")) {
			if (((monat >= 6) && (monat <= 8)) || ((monat == 3) && (tag >= 21))) {
				System.out.println("Sommer!");
			} else if (((monat == 12) && (tag >= 21)) || ((monat == 1) || (monat ==2))) {
				System.out.println("Winter!");
			}
		} else if(hemisphäre.equals("Süden")) {
			if (((monat <= 6) && (monat >= 8)) || ((monat != 3) && (tag < 21))) {
				System.out.println("Winter!");
			} else if (((monat != 12) && (tag < 21)) || ((monat != 1) || (monat !=2))) {
				System.out.println("Sommer!");
			}
		} else {
			System.out.println("Nicht bestimmbare Werte!");
		}
		
		sc.close();

	}

}
