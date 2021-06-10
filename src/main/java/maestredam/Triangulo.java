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
public class Triangulo extends PoligonosRegulares {
    //Constructores
    public Triangulo() {
        super ();
    }

    public Triangulo(int longitudLado) {
        super(longitudLado);
    }

    public Triangulo(String color, int longitudLado) {
        super(color, longitudLado);
    }
    
    

    
    //Métodos
    @Override
    public int obtenerPerimetro() {
        return 3*this.longitudLado;
    }

    @Override
    public int superficie() {
        return (int)(Math.sqrt(3)/4*Math.pow(this.longitudLado, 2));
    }
    
}
