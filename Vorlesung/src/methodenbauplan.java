
public class methodenbauplan {

	public static void main(String[] args) {
		double[] rechnung = new double[] {8.8, 7.4, 9.2, 8.8, 9.1, 10.12, -8.12, 9.3, -10};
		
		
		double[] ergebnis = umsatz(rechnung);
		
		int i = 0;
		
		while (i < ergebnis.length) {
			System.out.println(ergebnis[i]);
			i++;
			
		}
		
		
		
		//Aufgabe 4
		int[] furkan = new int[] {88, 4, 5, 2, 6, 77, 3, 3434, 0, 10000, 232, 4342, 3454};
		
		i = 0;
		
		int[] sort = sortier_furkan(furkan);
		
		System.out.println("-----------------");
		
		while (i < sort.length) {
			System.out.println(sort[i]);
			i++;
			
		}
		
		
		
		int[] schrank = new int[] {3, 5, 2, 6, 8, 4, 1, 4, 6, 77, 8};
		int decke = 4;
		
		//int methodefurkan = furkan(schrank, decke);
		
		//System.out.println(methodefurkan);
		
		System.out.println(furkan(schrank, decke));
		
		int[] zufallszahl = mert(17, 36, 15);
		
		i = 0;
		
		while(i < zufallszahl.length) {
			System.out.println(zufallszahl[i]);
			i++;
		}
		
		int[] neu = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};
		
		int n = 20;
		
		int[] primzahl = primzahlen(n, neu);
		
		i = 0;
		
		System.out.println("--------");
		
		while(i < primzahl.length) {
			System.out.println(primzahl[i]);
			i++;
		}
		
		System.out.println("--------");
		
		i = 0;
		
		boolean[] neue = ermittlePrimzahl(50);
		
		while(i < neue.length) {
			System.out.println(neue[i]);
			i++;
		}
		
		
		
	}
	
	
	//Aufgabe 4
	public static double[] umsatz (double[] liste) {
		double[] neuewerte = new double[3];
		
		int i = 0;
		while(i < liste.length) {
			if(liste[i] < 0.0) {
				neuewerte[0] -= liste[i];		//negativ
			} else if(liste[i] > 0.0) {
				neuewerte[1] += liste[i];		//positiv
			}
			i++;
		}
		neuewerte[2] = neuewerte[1] + neuewerte[0];
		
		return neuewerte;
	}
	
	
	//Aufgabe 2
	public static int[] sortier_furkan(int[] arr) {
		//int[] neu = new int[arr.length];
		int temp = 0;
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					
				}
			}
		}
		
		
		return arr;
	}
	
	
	
	public static int furkan(int[] arrayganzzahl, int ganzzahl) {
		int i = 0;
		int ergebnis = 0;
		
		while(i < arrayganzzahl.length) {
			if(ganzzahl == arrayganzzahl[i]) {
				ergebnis++;
			}
			
			i++;
		}
		
		return ergebnis;
	}
	
	// Aufgabe 3
	
	
	
	
	/*
	public static int[] primzahl(int[] arr) {
		int i = 0;
		while(i <= 100) {
			i++;
		}
		
		return i;
	}
	*/
	
	public static int[] mert(int min, int max, int n) {
		int[] mertosch = new int[n];
		int i = 0;
		
		while(i < mertosch.length) {
			mertosch[i] = (int) ((Math.random() * (max - min + 1) + min));
			i++;
		}
		
		
		return mertosch;
	}
	
	//array.delete(i)
	public static int[] primzahlen(int n, int[] liste) {
		int i = 0;
		int[] liste2 = new int[n];
		while(i < liste2.length) {
			int j = 1;
			
			if (((liste[i] % 1) == 0) && ((liste[i] % liste[i]) == 0)) {
				
				if(liste[i] != 0) {
					while(j < liste[i] - 1) {
						if(liste[i] % j == 0) {
							break;
						} else {
							liste2[i] = liste[i];
						}
						j++;
					}
				}
			}
			
			i++;
		}
		
		return liste2;
	}
	
	public static boolean[] ermittlePrimzahl(int anz) {
		
		if (anz < 1) {
			return new boolean[0];
		}
		
		boolean[] pzs = new boolean[anz];
		pzs[0] = true;
		
		for(int i = 2; i < pzs.length / 2; i++) {		// 1 weil 0 oben drüber erledigt wurde!
			if(!pzs[i - 1] != true) {					// oder !pzs[i]		
				for(int j = i + i; i < pzs.length + 1; j += 1) {
					pzs[j - 1] = true;
				}
			}
		}
		
		return pzs;
	}

}
