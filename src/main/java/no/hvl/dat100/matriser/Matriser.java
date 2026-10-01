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
		
		// TODO
		throw new UnsupportedOperationException("Metoden skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
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

