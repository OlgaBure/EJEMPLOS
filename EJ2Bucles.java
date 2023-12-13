package Bucles;

public class EJ2Bucles {

	public static void main(String[] args) {
		
		int contador = 2;
		
		do {
			System.out.println(contador);
			contador = contador +2;
		}while (contador <= 100);

		System.out.println("---------------");
		
		contador = 2;
		while(contador <=100) {
			System.out.println(contador);
			contador = contador +2;
		}
		
		System.out.println("---------------");
		
		for(contador = 2 ; contador <= 100 ; contador = contador + 2) {
			System.out.println(contador);
		}
	}

}
