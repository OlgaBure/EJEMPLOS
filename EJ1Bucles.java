package Bucles;

public class EJ1Bucles {
	public static void main(String[] args) {

		int contador = 0;
		int numero = 1;
		do {
			System.out.println(numero);
			contador++;
			numero++;
		} while (contador <= 99);

		System.out.println("----------------------------------");

		contador = 0;
		numero = 1;

		while (contador <= 99){
			System.out.println(numero);
			contador++;
			numero++;
		}

		System.out.println("----------------------------------");

		for (contador = 0, numero =1; contador <= 99; contador++, numero++) {
			System.out.println(numero);
		}
	}
}
