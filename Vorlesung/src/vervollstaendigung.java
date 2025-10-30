
public class vervollstaendigung {

	public static void main(String[] args) {
		/**
		for (int i = 1; i <= 25; i++) {
			System.out.println(i);
		}
		
		for (int i = 0; i <= 20; i++) {
			System.out.println("*");
		}

		for (int i = -100; i <= 100; i++) {
			System.out.println(i);
		}
		
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
			i++;
		}
		
		for (int i = 20; i >= 0; i--) {
			System.out.println(i);
		}
		
		for (int i = 41; i <= 1379; i++) {
			if ((i % 3) == 0) {
				System.out.println(i);
			}
		}
		
		for (int i = 0; i <= 100; i++) {
			System.out.println(i + ". Making Milhouse cry is not a science project");
		}
		**/
		
		double[] arr1, arr2;
		
		int z1, z2;
		z1 = 10 + (int) (Math.random() * 11);
		z2 = 10 + (int) (Math.random() * 11);
		
		System.out.println(z1+ " " + z2);
		
		arr1 = new double[z1];
		arr2 = new double[z2];
		
		for (double d : arr1) {
			d = Math.random();
			System.out.println(d + " " + arr1[0]);
		}
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = Math.random();
			System.out.println(arr1[i]);
		}
		
		System.out.println("\n------------\n");
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = Math.random();
			System.out.println(arr2[i]);
		}
		
		System.out.println("\nFertig!");
		
		double[] arr3 = new double[arr1.length + arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[1];
		}
		
		for(int i = arr1.length; i < arr3.length; i++) {
			arr3[i] = arr2[i - arr1.length];
			System.out.println(arr3[i]);
		}
	}

}
