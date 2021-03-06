
package ejercicio1;


    

import java.util.Scanner;

public class Ejemplo_Mal {
    
    public static void main (String[]args){
        int area;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("dame el valor de la base: ");
        int base = entrada.nextInt();
     
         System.out.print("dame el valor de la altura: ");
         int altura = entrada.nextInt();  
  
        area = base * altura;
        
   
        System.out.print("el area es: " + area );
    } 
            
    
}
