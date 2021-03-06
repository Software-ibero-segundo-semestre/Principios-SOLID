/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author andyf
 */
public class Rectangulo {
    private int base, altura, area;
    public Rectangulo(int base, int altura){
        this.base= base;
        this.altura=altura;
        
    }    
    public void CalculoArea(){
        area = base * altura;
        
    }
    public void imprimir(){
        CalculoArea();
        System.out.print("el area es: " + area );
    } 
}
