
package ejercicio2;

public class ejemplomalo {
    
 public int numpatas;
     private String especie;
     boolean cola;
 
     public String imprime(){
         String cadena = "";
         cadena += "numpatas:"+String.valueOf(getnumpatas());
         cadena += "||especie:"+String.valueOf(getespecie());
         cadena += "||cola:"+tienecola();
         return cadena;
     }
     
     public void setnumpatas(int num){
         this.numpatas = num;
        
    }
     public int getnumpatas(){
         return this.numpatas;
     }
     
      public String getespecie(){
         return especie;
     }
      public void setespecie(String especie){
          this.especie = especie;
      }
      public String tienecola(){
          if(cola){
              return "si";
              
          }else{
              return "no";
          }
      }
      
      public boolean iscola(){
          return cola;
      }
      public void setcola(boolean cola){
          this.cola = cola;
      }
    public void perro(){
        this.numpatas = 4;
        this.setcola(true);
        this.setespecie("Mamifero");
    }
    
        public void gato(){
        this.numpatas = 4;
        this.setcola(true);
        this.setespecie("felino");
    }
        public static void main(String[]args){
         perro miperro = new perro();
         
         System.out.println(miperro.imprime()); 
         gato migato = new gato();
           System.out.println(migato.imprime()); 
     }

     
}
