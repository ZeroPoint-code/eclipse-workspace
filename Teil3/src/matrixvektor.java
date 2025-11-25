import java.util.Random;

public class matrixvektor {

	public static void main(String[] args) {
		double[][] zahlen = new double[4][4];
		
		Random zufall = new Random();
		
		for (int z = 0; z < zahlen.length; z++) {
            for (int s = 0; s < 4; s++) {
                zahlen[z][s] = (double) (Math.random() * 1);
                System.out.printf("%.2f", zahlen[z][s]);
                System.out.println();
            }
        }
		
		double[] zahlen2 = new double[4];
		
		for (int i = 0; i < zahlen2.length; i++) {
                zahlen2[i] = (double) (Math.random() * 1);
                System.out.println("\n-----");
                System.out.printf("%.2f", zahlen2[i]);
            
        }
		
		double[] ergebnisse = new double[4];
		
		
		
		System.out.println(zahlen.length);
		
		System.out.println("\n");
		
		for (int z = 0; z < ergebnisse.length; z++) {
            for (int s = 0; s < ergebnisse.length; s++) {
                ergebnisse[z] += (double) zahlen[z][s] * zahlen2[z];
                //System.out.println("Z " + zahlen[z][s] + " S " + zahlen2[z]);
            	
            }
            
            System.out.printf("%.2f", ergebnisse[z]);
            System.out.println();
        }
		

	}

}
