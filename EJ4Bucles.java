package Bucles;

import java.util.Scanner;

public class EJ4Bucles {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introducir dos números");
		int M = teclado.nextInt();
		int N = teclado.nextInt();
		

		if (M < N)
		{
			int aux = M;
			M = N;
			N = aux;
		}

		do {
			System.out.println(M);
			M--;
		} while (M > N);

		teclado.close();
	}

}
