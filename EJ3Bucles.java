package Bucles;

import java.util.Scanner;

public class EJ3Bucles {

	public static void main(String[] args) {
		
		int N = 0;
		int M = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce dos números de los que quieras saber el mayor");
		
		N = teclado.nextInt();
		M = teclado.nextInt();
		
		if (N > M) {
			do {
				System.out.println(N);
				N--;
			} while (N >= M);
		} else {
			do {
				System.out.println(N);
				N++;
			} while (M >= N);
		}
		teclado.close();
	}

}
