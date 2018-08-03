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
public class Figuras {
    private Cuadrado cuadrado;
    private Circulo circulo;
    private Triangulo triangulo;

    public Cuadrado getCuadrado() {
        return cuadrado;
    }

    public void setCuadrado(Cuadrado cuadrado) {
        this.cuadrado = cuadrado;
    }

    public Circulo getCirculo() {
        return circulo;
    }

    public void setCirculo(Circulo circulo) {
        this.circulo = circulo;
    }

    public Triangulo getTriangulo() {
        return triangulo;
    }

    public void setTriangulo(Triangulo triangulo) {
        this.triangulo = triangulo;
    }

    public Figuras() {
    }

    public Figuras(Cuadrado cuadrado, Circulo circulo, Triangulo triangulo) {
        this.cuadrado = cuadrado;
        this.circulo = circulo;
        this.triangulo = triangulo;
    }

    @Override
    public String toString() {
        return "Figuras{" + "cuadrado=" + cuadrado + ", circulo=" + circulo + ", triangulo=" + triangulo + '}';
    }
    
    
}
