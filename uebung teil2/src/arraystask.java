import java.util.Scanner;

public class arraystask {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PR1: ");
		double pr1 = sc.nextDouble();
		System.out.println("PR1-ECTS: ");
		double pr1ects = sc.nextDouble();
		
		System.out.println("Tei1: ");
		double tei1 = sc.nextDouble();
		System.out.println("Tei1-ECTS: ");
		double tei1ects = sc.nextDouble();
		
		System.out.println("Ei: ");
		double ei = sc.nextDouble();
		System.out.println("EI-ECTS: ");
		double eiects = sc.nextDouble();
		
		System.out.println("NF: ");
		double nf = sc.nextDouble();
		System.out.println("NF-ECTS: ");
		double nfects = sc.nextDouble();
		
		System.out.println("MA1: ");
		double ma1 = sc.nextDouble();
		System.out.println("MA1-ECTS: ");
		double ma1ects = sc.nextDouble();
		
		double gesamtwert = (pr1 * pr1ects) + (tei1 * tei1ects) + (ei * eiects) + (nf * nfects) + (ma1 * ma1ects);
		double gesamtetcs = pr1ects + tei1ects + eiects + nfects + ma1ects;
		
		//double mittelw = (pr1 * pr1ects + tei1 * tei1ects + ei * eiects + nf * nfects + ma1 * ma1ects) / (pr1ects + tei1ects + eiects + nfects + ma1ects);
		double mittelw = gesamtwert / gesamtetcs;
		
		System.out.println(mittelw);
		
		sc.close();

	}

}
