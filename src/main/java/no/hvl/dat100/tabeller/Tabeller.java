package no.hvl.dat100.tabeller;

import java.util.Arrays;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO
		for (int i = 0; i < 3; i++){
			System.out.println(tabell[i]);
		}
		

	}

	// b) ferdig
	public static String tilStreng(int[] tabell) {

		String bokstav;
		bokstav = Arrays.toString(tabell).replace(", ", ",");
		return bokstav;

	}

	// c) ferdig
	public static int summer(int[] tabell) {
		int sum = 0;

		for(int i = 0; i < tabell.length; i++){
			sum += tabell[i];
		}
		return sum;
	}

	// d) ferdig
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean tallFinnes = false;

		for(int i = 0; i < tabell.length; i++){
			if(tall == tabell[i]){
				tallFinnes = true;
			}
		}
		return tallFinnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
