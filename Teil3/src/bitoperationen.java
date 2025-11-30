import java.math.BigInteger;

public class bitoperationen {

	public static void main(String[] args) {
		// 25 << 1 = 50
		// 25 << 2 = 100
		// 100 >> 1 = 50
		// -100 << 1 = -200
		
		int red = 123;
		int green = 217;
		int blue = 18;
		
		// Bit rechts bis 8 links soll ein farbe zustehen...

		int rgb = blue + (red << 16) + (green << 8);
		// rgb & 255 = 18
		// rgb & (255 << 7) = 22748

		// (rgb & (255 << 16)) >> 16 = 123 rot ursprünglich
		// rgb & (255 << 8) >> 8 = 18 blau ursprünglich
		// (rgb & (255 << 8)) >> 8 = 217 green ursprünglich
		
		System.out.println(Integer.toBinaryString(217));
		
		System.out.println(Integer.toBinaryString(4711));
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toBinaryString(rgb));
		
		
		String s = "Hallo";
		s.substring(1);
		
		s.charAt(0);
		
		s.length();
		
		s.substring(s.length()-2);
		
		s.substring(2,4);
		
		BigInteger bi = new BigInteger("89243597463587964329569348659342765963429756347092659473265097469725693476509732");
		
		bi.add(BigInteger.ONE);
	}

}
