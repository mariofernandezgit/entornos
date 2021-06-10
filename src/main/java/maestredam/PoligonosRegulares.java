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
public abstract class PoligonosRegulares {
    //Variables
    protected String color;
    protected int longitudLado;
    protected boolean relleno;
    protected int rotado;
    
    //Constructores

    public PoligonosRegulares(String color, int longitudLado) {
        this.color = color;
        this.longitudLado = longitudLado;
        this.relleno=false;
        this.rotado=0;
    }
    
    public PoligonosRegulares(int longitudLado) {
        this("Negro",longitudLado);
    }
    
    public PoligonosRegulares() {
        this("Negro",0);
    }
    
    
    
    //Métodos abstractos
    abstract public int obtenerPerimetro ();
    abstract public int superficie ();
    
    //Métodos
    public void rotar (int rotacion){
        this.rotado+=rotacion;
    }
    
    public void dibujar (){
        System.out.println("se dibuja el objeto");
    }
    
    public void agrandar (int numero){
        this.longitudLado+=numero;
    }
    
    public void reducir (int numero){
        this.longitudLado-=numero;
        if (longitudLado<0){
            longitudLado=0;
        }
    }
    
    public void rellenar (){
        this.relleno=true;
    }
    
}
