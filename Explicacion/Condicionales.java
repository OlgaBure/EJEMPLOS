package Explicacion;
import java.io.IOException;
public class Condicionales {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Introduce una letra");
		char letra = (char) System.in.read();
		if(letra>='a' && letra <= 'z') {
			System.out.println("Ha introducido una minúscula, la paso a mayúscula");
			System.out.println((char)(letra-32));
		}else 
			if (letra>='A' && letra <= 'Z') {
				System.out.println((char)(letra+32));
			}else {
				System.out.println("Por favor, introduce una letra");
			}
	}

}
