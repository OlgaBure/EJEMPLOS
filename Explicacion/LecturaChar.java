package Explicacion;

import java.io.IOException;

public class LecturaChar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Introduce una letra");
		char letra = (char) System.in.read();
		System.out.println((char)(letra-32));
	}

}
