
package ejercicio1;

import java.util.Scanner;

public class RectanguloMain {
    
    public static void main (String[]args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("dame el valor de la base: ");
        int base = entrada.nextInt();
        
         System.out.print("dame el valor de la altura: ");
         int altura = entrada.nextInt();
         
         Rectangulo mensajero = new Rectangulo( base, altura);
         mensajero.imprimir();
        
    }
            
    
}
