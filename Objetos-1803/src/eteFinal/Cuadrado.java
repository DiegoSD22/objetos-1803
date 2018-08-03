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
public class Cuadrado implements Geometria {

    private float lado;
    private float areaCu;
    float perimetroCu;

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getAreaCu() {
        return areaCu;
    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float getPerimetroCu() {
        return perimetroCu;
    }

    public void area() {
        areaCu = lado * lado;
    }
    
    public void perimetro(){
        perimetroCu=lado*4;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "areaCu=" + areaCu + ", perimetroCu=" + perimetroCu + '}';
    }

}
