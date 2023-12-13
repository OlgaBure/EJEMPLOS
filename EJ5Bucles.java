package Bucles;

import java.util.Scanner;

public class EJ5Bucles {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int M;
		int N;
		int Y;
		
		do {	
			System.out.println("Introduce 3 números");

			M = teclado.nextInt();
			N = teclado.nextInt();
			Y = teclado.nextInt();
			
			
		} while (Y > Math.abs(M - N));
			
		if (M < N) {
				int aux = M;
				M = N;
				N = aux;
			}
			
			do {
				System.out.println(M);
				M = M - Y;
			} while (M >= N);
			

		teclado.close();
	}

}
