package Explicacion;
import java.util.Scanner;
import javax.sound.midi.Soundbank;
public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		double real = 9.5;
		float realPeque = (float)3.2;
		float realPeque2 = 3.2f;
		numero = (int)realPeque2;
		System.out.println(numero);
		numero = (int)real;
		System.out.println((float)numero/2);
		System.out.println(numero%2);
		int numero2 = numero++;
		System.out.println(numero+ " - "+ numero2);
		System.out.println(numero);
		System.out.println(numero++);
		System.out.println(numero);
	}

}
