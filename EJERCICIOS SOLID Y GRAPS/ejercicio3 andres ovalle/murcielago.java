
package ejercicio3;

public class murcielago implements mamifero,mamifevolar {
    
   public murcielago(){
     
        
    }

   
   
   @Override
    public void comer() {
         System.out.println("EL MURCIELAGO COME");
       
    }

    
   @Override
    public void volar() {
       System.out.println("EL MURCIELAGO VUELA");
    }
    
}
