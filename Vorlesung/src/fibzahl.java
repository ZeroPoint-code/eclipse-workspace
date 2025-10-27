import java.util.Scanner;


public class fibzahl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] x = new int [2];
		
		int i = 0;
		int sum = 0;
		
		while (i < x.length) {
			x[i] = sc.nextInt();
			sum += x[i];
		}
		
		//int fib = fibonacci(sum);
		int[] erg = fibonacci(7);
		
		i = 0;
		while(i< erg.length) {
			System.out.println(erg[i]);
			i++;
		}

	}
	
	public static int[] fibonacci(int params) {
		int[] fibz = new int[params];
		
		if((params == 0) || (params == 1) || (params == 2)) {
			return fibz;
		}
		
		int i = 2;
		while(i < params) {
			fibz[i] = fibz[i-2] + fibz[i-1];
			i++;
		}
		
		//fibz[2] = fibz[0] + fibz[1];
		//fibz[3] = fibz[1] + fibz[2];
		//fibz[4] = fibz[2] + fibz[3];
		//fibz[5] = fibz[3] + fibz[4];
		//fibz[6] = fibz[4] + fibz[5];
		
		
		
		return fibz;
	}

}
