package ejersecuenciales;
import java.io.IOException;
import java.util.Scanner;
/**
 * @author gema
 */
public class Ejercicio10b {
   public static void main(String[] args) {
       int opcion, num1,num2,resultado;
       Scanner lector = new Scanner (System.in);
       System.out.println("Introduce opcion 1. suma\n 2. resta\n 3.multiplicación\n");
       opcion = lector.nextInt();
       System.out.println("Introduce dos numeros");
       num1 =lector.nextInt();
       num2 =lector.nextInt();
       switch (opcion){
           case 1:
                   System.out.println(num1+num2);
                   break;
           case 2: if (num1>=num2){
                        System.out.println("El numero introducido en primer lugar es el mayor");
                        System.out.println(num1-num2);
                   }else
                        System.out.println(num2-num1);
                   break;
           case 3: System.out.println(num1*num2);
                   break;
           default : System.out.println("Introduce 1, 2 o 3");
       }
       System.out.println("hasta luego");
   } 
}
