// Organize Imports: Shift + Strg + O

package leistung2;

public class testatwdh {

	public static void main(String[] args) {
		int[] arr = {0, 3, 4, 33, 45, 33, 33, 23, 5, 3, 4, 2, 7, 8, 6, 1}; // Bei i = 0: 5 > 3 < 4 > 2 --- Bedingung erfüllt
		
		System.out.println(welle(arr));
		


	}
	
	public static int welle(int[] x) {
		int i = 0;
		int stelle = 0;
		
		while(i < x.length - 3) {
			if (x[i] > x[i + 1]) {
				if(x[i + 1] < x[i + 2]) {
					if(x[i + 2] > x[i + 3]) {
						stelle = x[i];
						break;
					}
				}
			}
			
			/*
			Optional:
			
			for(int i = 0; i < x.length - 3; i++){
				if (((x[i] > x[i + 1]) && (x[i + 1] < x[i + 2]) && (x[i + 2] > x[i + 3])) || ((x[i] < x[i + 1]) && (x[i + 1] > x[i + 2]) && (x[i + 2] < x[i + 3]))) {
					stelle = x[i];
					break;
				}
			}
			*/
			
			if (x[i] < x[i + 1]) {
				if(x[i + 1] > x[i + 2]) {
					if(x[i + 2] < x[i + 3]) {
						stelle = x[i];
						break;
					}
				}
			}
			
			stelle = -1;
			i++;
		}
		
		
		
		return stelle;
	}

}
