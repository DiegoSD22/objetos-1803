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
public class Triangulo implements Geometria {


    private float base;
    private float altura;
    private float areaT;
    private float perimetroT;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAreaT() {
        return areaT;
    }

    public float getPerimetroT() {
        return perimetroT;
    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public void area() {
        areaT = (base * altura) / 2;

    }
    
    public void perimetro(){
        perimetroT=(altura*2)+base;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "areaT=" + areaT + ", perimetroT=" + perimetroT + '}';
    }

}
