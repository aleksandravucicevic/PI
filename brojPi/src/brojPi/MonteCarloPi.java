package brojPi;

import java.util.*;
import java.math.*;

public class MonteCarloPi {
	public static Scanner scan = new Scanner(System.in);
	public static Random rand = new Random();
	
	public static void main(String args[]) {
		System.out.print("Broj tacaka: ");
		int brTacaka = scan.nextInt();
		
		System.out.print("Broj decimala koje treba da se poklope: ");
		int brDecimala = scan.nextInt();
		
		int uKrugu = 0;
		for(int i=0;i<brTacaka;i++) {
			double x = rand.nextDouble();
			double y = rand.nextDouble();
			
			if(Math.sqrt(x*x + y*y) <= 1.0) {
				uKrugu++;
			}
		}
		
		double aproksimacijaPi = 4.0 * uKrugu / brTacaka;
		
		// uporedjivanje sa stvarnom vrijednoscu PI do zadanog broja decimala
		BigDecimal aprPi = new BigDecimal(aproksimacijaPi).setScale(brDecimala, RoundingMode.HALF_UP);
		BigDecimal stvarnoPi = new BigDecimal(Math.PI).setScale(brDecimala, RoundingMode.HALF_UP);
		
		String aprStr = aprPi.toPlainString();
		String piStr = stvarnoPi.toPlainString();
		
		int aprTacka = aprStr.indexOf('.');
		int piTacka = piStr.indexOf('.');
		
		if(aprTacka < 0 || piTacka < 0)
			return;
		
		if(!aprStr.substring(0, aprTacka).equals(piStr.substring(0, piTacka))) {
			System.out.println("Cijeli dio brojeva se razlikuje, pa nema smisla porediti decimale.");
			return;
		}
		
		int poklapanje = 0;
		for(int i=1;i<brDecimala+1;i++) {
			int aprIdx = aprTacka + i;
			int piIdx = piTacka + i;
			
			if(aprIdx >= aprStr.length() || piIdx >= piStr.length())
				break;
			
			if(aprStr.charAt(aprIdx) == piStr.charAt(piIdx)) {
				poklapanje++;
			} else {
				break;
			}
		}
		
		System.out.println("Aproksimacija broja PI: " + aprPi);
		System.out.println("Stvarna vrijednost PI: " + stvarnoPi);
		System.out.println("Broj decimala koje se poklapaju: " + poklapanje);
	}
}
