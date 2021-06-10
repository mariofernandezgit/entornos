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
public class Cuadrado extends PoligonosRegulares {
    
    
    //Constructores
    public Cuadrado(String color, int longitudLado) {
        super(color, longitudLado);
    }

    public Cuadrado(int longitudLado) {
        super(longitudLado);
    }

    public Cuadrado() {
        super ();
    }
    
    
    //Métodos
    @Override
    public int obtenerPerimetro() {
        return 4*this.longitudLado;
    }

    @Override
    public int superficie() {
        return this.longitudLado*this.longitudLado;
    }
    
}
