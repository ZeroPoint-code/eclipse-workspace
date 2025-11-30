
public class rekursion {
	
	//static final int ANTWORT = 42;
	
	public static void main(String[] args) {
		//int ende = 100;
		
		rekursiv(95, 100);
		
		//fakultat(10);
		System.out.println(fakultat(3));
		System.out.println("Fibs: " + fibs(6));
	}
	
	public static void rekursiv(int i, int ende) {
		System.out.println("Hallo " + i);
		
		if(i < ende) {
			rekursiv(++i, ende);
		}
		System.out.println("Ende der rekursiv-Methode " + i);
	}
	
	public static int fakultat(int n) {
		if (n == 0) {
			return 1;
		}
		
		return (int) (n * fakultat(n - 1));

	}
	
	public static int fibs(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		
		// if n > 1
		return (int) fibs(n - 1) + fibs(n - 2);

	}

}
