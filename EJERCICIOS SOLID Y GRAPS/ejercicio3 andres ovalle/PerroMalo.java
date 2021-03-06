
package ejercicio3;

public class PerroMalo implements interfazmala{
     public PerroMalo(){}

    @Override
    public void comer() {
         System.out.println("EL PERRO COME");

    }

    @Override
    public void volar() {
        System.out.println("EL PERRO VUELA");
        
    }

    @Override
    public void correr() {
        System.out.println("EL PERRO CORRE");
        
    }
}