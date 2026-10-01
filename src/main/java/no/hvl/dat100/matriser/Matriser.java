package no.hvl.dat100.matriser;

import static java.lang.System.out;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] rad : matrise) {
			for(int tall : rad){
				out.print(tall + " ");
			}
			out.println();
		}
	}
	// b)
	public static String tilStreng(int[][] matrise) {

		String s = "";
		for (int[] rad : matrise) {
			for (int j = 0; j < rad.length; j++) {
				s += rad[j];
				if (j < rad.length - 1) {
					s += " ";
				}
			}
			s += "\n";
		}
		return s;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] resultat = new int[matrise.length][];

		for (int i = 0; i < matrise.length; i++) {
			resultat[i] = new int[matrise[i].length];

			for (int j = 0; j < matrise[i].length; j++) {
				resultat[i][j] = matrise[i][j] * tall;
			}
		}

		return resultat;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		if (a.length != b.length) {
			return false;
		}

		for (int i = 0; i < a.length; i++) {

			if (a[i].length != b[i].length) {
				return false;
			}

			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}

		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		int [][] speilet = new int[matrise.length][matrise.length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				speilet[i][j] = matrise[i][j];
			}
		}

		for (int i = 0; i < matrise.length; i++){
			for (int j = 0; j <= i; j++){
				int temp = speilet[i][j];
				speilet[i][j] = speilet[j][i];
				speilet[j][i] = temp;
			}
		}
		return speilet;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

			int[][] rad = new int[a.length][b[0].length];

			int sum = 0;
			int x;
			int y;

			for ( int r = 0; r < a.length; r++){
				for(int p = 0; p < b[0].length ; p++){
					sum = 0;
					for(int q = 0; q < a[0].length; q++){
						x = a[r][q];
						y = b[q][p];
						sum += x * y;
					}
					rad[r][p] = sum;
				}
			}

			return rad;
		}
	}

