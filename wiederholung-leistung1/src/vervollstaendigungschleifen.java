import java.lang.reflect.Array;

public class vervollstaendigungschleifen {

	public static void main(String[] args) {
		double[] noten = {1.0, 2.0, 1.3, 2.3, 4.0, 2.3};
		
		double summe = 0.0;
		int i = 1;
		
		for(double note : noten) {
			summe += note;
			System.out.println(i + ". te Note: " + note);
			i++;
		}
		
		double durchschnitt = summe / noten.length;
		
		System.out.println("Durschnitt (Summe / Anzahl der Noten): " + durchschnitt);
		
		// *Kleinste Zahl finden Aufruf:
		
		int[] suche = new int[] {1, 5, 7, 3, 22, 0, 9};
		
		int[] suche2 = new int[] {100, 105, 27, 23, 220, 33, 99};
		
		
		System.out.println("Kleinste Element bzw. Summe: " + findMin(suche));
		System.out.println("Kleinste Element bzw. Summe: " + findMin(suche2));
		
	}
	
	
	
	// *Kleinste Zahl finden Methode:
	
	public static int findMin(int[] numbers) {
		int min = Integer.MAX_VALUE; 		// = 2147483647 
		for(int element : numbers) {		// nenne alle index in Array numbers - element
			if(element < min) {
				min = element;
			}
		}
		return min;
	}
	
	// Aufgabe 1:
	//public static int[] 

}
