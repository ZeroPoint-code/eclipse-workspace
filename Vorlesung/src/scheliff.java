
import java.net.URL;
import java.util.Scanner;

import sun.awt.www.content.audio.x_aiff;

public class scheliff {

	public static void main(String[] args) {
		
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

	}

}
