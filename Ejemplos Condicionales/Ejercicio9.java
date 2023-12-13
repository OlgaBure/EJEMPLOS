package ejersecuenciales;
import java.io.IOException;
/**
 * @author gema
 */
public class Ejercicio9 {
   public static void main(String[] args) throws IOException  {
   char caracter;
   int numeroAscii;
   System.out.println("Introduzca una letra");
   caracter = (char)System.in.read();
   System.out.println("Has introducido una "+ caracter);
   numeroAscii = caracter;
   System.out.println("El número ascii correspondiente es "+ numeroAscii);
   if (caracter >=0 && caracter<=32){
           System.out.println("Caracter no imprimible");
   }
   if (caracter>='A' && caracter<='Z'){
       System.out.println("Es mayúscula");
       if (caracter!='A' && caracter!='E' && caracter!='I'&& caracter !='0'&& caracter !='U'){
           System.out.println(" consonante.");
       }else{
           System.out.println(" vocal.");
       }
   }
   else if (caracter>='a' && caracter<='z'){
       System.out.println("Es minuscula");
       if (caracter!='a' && caracter!='e' && caracter!='i'&& caracter !='o'&& caracter !='u')
           System.out.println(" consonante.");
       else
           System.out.println(" vocal.");
    }
   else if (caracter=='.')
       System.out.println("ha introducido un punto");
   

   
   System.out.println("fin");
   } 
}
