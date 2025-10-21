
public class scheliff {

	public static void main(String[] args) {
	/*	
		String s = "Ich teste was teste";
		String[] worte = s.split(" ");
		
		int i = 0;
		
		while (i < worte.length) {
			System.out.println(worte[i]);
			i++;
		}
		
		int umgekehrt = (int) worte.length - 1;
		
		while (umgekehrt >= 0) {
			System.out.println(worte[umgekehrt]);
			umgekehrt--;
		}
		*/
		
		int n = 5;
		int faku = 1;
	    int i = 0;
		
		while(i < n) {
			i++;
			faku = faku * i;
			//System.out.println(faku);
		}
		
		int [] zahlen = new int [6];
		
		//VERARBEITUNG TODO

		i = 0;
		
		while (i < zahlen.length) {
			zahlen[i] = (int) (Math.random() * 49) + 1;
			i++;
		}
		
		//Ausgabe
		i = 0;
		//while (i < zahlen.length) {
			//System.out.println(zahlen[i]);
		//}
		
		System.out.println("------------------------");
		
		int [] arr = {0, 4, 3, 2, 6, 8,5,4,2,4,6,87,4,3,2,1,3,2};
		
		i = 0;
		boolean gleich = false;
		
		while (i < arr.length - 1) {
			int z = i + 1;
			
			while (z < arr.length) {
				gleich = arr[i] == arr[z];
				
				if (gleich) {
					System.out.println(i +" " + z + "-> " + arr[i]);
					break;
				}
 				
				z++;
			}
			i++;
		}
		
	}

}
