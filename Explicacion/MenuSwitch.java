package Explicacion;
import java.util.Scanner;
public class MenuSwitch {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contadorEnvios=0;
		int contadorRecibidos=0;
		Scanner lector = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Introduzca 1. enviar 2. recibir 3. salir");
			 opcion = lector.nextInt();
			switch (opcion) {
			case 1: 
				contadorEnvios++;
				System.out.println("ENV"+contadorEnvios);
				break;
			case 2:
				contadorRecibidos++;
//				System.out.println("REC"+contadorRecibidos);
				System.out.printf("REC%03d\n",contadorRecibidos);
				break;
			case 3:
				System.out.println("Saliendo");
				break;
			default:
				System.out.println("Introduzca una opción válida");
			}
		}while(opcion!=3);		
	}

}
