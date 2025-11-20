

public class mehrdiemnsionalearray {

	public static void main(String[] args) {
		//char zeichen = '|';
		/*
		for(int i = 1; i <= 12; i++) {
			System.out.print(i + ":");
			
			for(int s = 1; s <= i; s++) {
				System.out.print("|");
			}
			
			System.out.println();
		}
		
		for(int i = 1; i <= 10; i++) {
			
			for(int s = 1; s <= 10; s++) {
				System.out.println(i + " * " + s + " = "+ (i*s));
				//System.out.printf("i = %2d, s = %2d -> i * s = %3d%n", i, s, (i*s));
			}
			//System.out.println();
		}
		
		int[] keme1D = new int[100];
		
		int[][] keme2D = new int[10][10];
		
		int cnt = 0;
		
		for(int i = 1; i <= 10; i++) {
			
			for(int s = 1; s <= 10; s++) {
				keme2D[i - 1][s - 1] = (i*s);
				//keme1D[(i - 1) * 10 + s - 1] = (i*s);
				keme1D[cnt++] = (i*s);
				System.out.printf("i = %2d, s = %2d -> i * s = %3d%n", i, s, keme2D[i - 1][s - 1]);
			}
			System.out.println();
		}
		
		System.out.println(keme2D[6-1][5-1]); // Minus 1 weil Array Null basiert ist!
		*/
		
		
		char[][] ttt = new char[3][3];
		
		ttt[1][1] = 'x';
		ttt[0][2] = 'o';
		ttt[1][2] = 'x';
		ttt[1][0] = 'o';
		ttt[0][0] = 'x';
		ttt[2][2] = 'o';
		ttt[2][1] = 'x';
		ttt[0][1] = 'o';
		ttt[2][0] = 'x';
		
		/*
		for(int z = 0; z < ttt.length; z++) {			// Zeile zuerst Y
			for(int s = 0; s < ttt[z].length; s++) {	// Spalte dannach X
				System.out.println(z + " x " + s + " -> " + ttt[z][s]);
			}
		}
		*/
		
		for(int z = 0; z < ttt.length; z++) {			// Zeile zuerst Y
			for(int s = 0; s < ttt[z].length; s++) {	// Spalte dannach X
				System.out.print(ttt[z][s] + " ");
			}
			System.out.println();
		}

	}

}
