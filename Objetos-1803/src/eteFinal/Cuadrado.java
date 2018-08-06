/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eteFinal;

/**
 *
 * @author SR116
 */
public class Cuadrado extends Figuras {

    private float lado;

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public Cuadrado() {
    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    
    public void Perimetro() {
        lado = getLado();
        System.out.println("El perimetro del cuadrado es: " + 4 * lado);
    }

    
    public void Area() {
        lado = getLado();
        System.out.println("El Area del cuadrado es: " + lado * lado);
    }

}

