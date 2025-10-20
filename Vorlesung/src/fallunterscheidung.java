
public class fallunterscheidung {

	public static void main(String[] args) {
		int byteBits = 8;
        int byteMax = (int)(Math.pow(2, byteBits) / 2 - 1);  	// 2^(8-1) - 1
        int byteMin = (int)(Math.pow(2, byteBits) / 2 * (-1));    
        System.out.println("Wertebereich von byte: " + byteMin + " bis " + byteMax);
        
        int x = 3;
        int y = 7;
        
        System.out.println("Wertebereich von byte: " + ((x > y )? "erste":"zweite"));  // then : else
        
        boolean geschlecht = true;
        
        System.out.println(((geschlecht)? "Frau":"Mann" + "Hallo: "));  // then : else
        
        System.out.println("\\ + \" ");

	}

}
