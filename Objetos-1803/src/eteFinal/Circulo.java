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
public class Circulo extends Figuras {

    private float radio;

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    
    public void Perimetro() {
        radio=getRadio();
        System.out.println("El perimetro del circulo es: " + 3.1416 * 2 * radio);
    }

    
    public void Area() {
        radio = getRadio();
       
        System.out.println("El Area del circulo es: " + 3.1416 * radio * radio);
    }
}
