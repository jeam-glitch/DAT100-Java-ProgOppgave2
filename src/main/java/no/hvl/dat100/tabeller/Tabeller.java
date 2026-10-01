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

	// e) ferdig
	public static int posisjonTall(int[] tabell, int tall) {

		int index = -1;
		for(int i = 0; i < tabell.length; i++){
			if (tall == tabell[i]){
				index = i;
				break;
			}
		}
		return index;
	}

	// f) ferdig
	public static int[] reverser(int[] tabell) {
		int[] reverse = new int[tabell.length];
		for(int i = 0; i < tabell.length; i++){
			reverse[i] = tabell[tabell.length - i - 1];
		}
		return reverse;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean sorter = true;
		for(int i = 1; i < tabell.length; i++){
			if(tabell[i] < tabell[i - 1]){
				sorter = false;
				break;
			}
		}
		return sorter;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
