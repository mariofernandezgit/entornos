/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maestredam;

/**
 *
 * @author CHOLY
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PoligonosRegulares [] array = new PoligonosRegulares [3];
        array[0]= new Triangulo ("Verde",10);
        array[1]= new Triangulo (10);
        array[2]= new Cuadrado ("Rojo", 20);
        
        for (int i=0;i<array.length;i++){
            System.out.println(array[i].color);
            System.out.println(array[i].obtenerPerimetro());
            System.out.println(array[i].superficie());
        }
    }
    
}
