import java.util.Scanner;

public class mwst {

	public static void main(String[] args) {
		
		//Aufgabe 2.1
		double test = 10.0;
		System.out.println(test);
		
		System.out.println("Gibt Nettopreis an: ");
		Scanner sc = new Scanner(System.in);
		
		double nettopreis = sc.nextDouble();
		
		System.out.printf("Nettopreis: %8.2f", nettopreis);
		System.out.println("€");
		
		var mwst = nettopreis * 0.19;
		
		System.out.printf("Mwst: %8.2f", mwst);
		System.out.println("€");
		
	    double bruttopreis = nettopreis * 1.19;
		System.out.printf("Bruttopreis: %8.2f", bruttopreis);
		System.out.println("€");
		
		
		//Aufgabe 2.2
		
		System.out.println("Gib Zahl-1 ein: ");
		int ersterWert = sc.nextInt();
		System.out.println("Gib Zahl-2 ein: ");
		int zweiterWert = sc.nextInt();
		System.out.println("Gib Zahl-3 ein: ");
		int dritterWert = sc.nextInt();
		
		double mittelWert = (ersterWert + zweiterWert + dritterWert) / 3;
		System.out.println("Mittelwert: " + mittelWert);
		
		//Aufgabe 2.3
		
		System.out.println("Zahl 2.3: ");
		double zahl23 = sc.nextDouble();
		double zahlZufall = Math.random() * 100;
		
		System.out.printf("Zufall: %2.2f", zahlZufall);
		
		System.out.println("");
		
		if (zahl23 > zahlZufall) {
			System.out.println("Richtig");
		} else {
			System.out.println("Falsch");
		}
		
		//Aufgabe 2.4
		
		System.out.println("Gib Zahl ein");
		double zahlwurzeln = sc.nextDouble();
		
		double wurzel = Math.sqrt(zahlwurzeln);
		System.out.println("Wurzel: " + wurzel);
		
		double quadrat = wurzel * wurzel;
		System.out.println("Quadrat: " + quadrat);
		
		
		
		
		
		sc.close();
	}

}
