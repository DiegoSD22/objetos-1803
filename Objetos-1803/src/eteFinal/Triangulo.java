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
public class Triangulo extends Figuras {

    float lado;
    float altura;

    public Triangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public Triangulo() {
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    
    public void Perimetro() {
        lado = getLado();
        System.out.println("El perimetro del triangulo es: " + 3 * lado);
    }

    
    public void Area() {
        lado = getLado();
        altura = getAltura();
        System.out.println("El Area del triangulo es: " + lado * altura / 2);
    }

}
