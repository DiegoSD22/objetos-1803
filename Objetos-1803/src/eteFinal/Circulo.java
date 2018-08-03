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
public class Circulo implements Geometria{
    private float radio;
    private float areaC;
    private float perimetroC;

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getAreaC() {
        return areaC;
    }

    public Circulo(float radio) {
        this.radio = radio;
    }
    
    public float getPerimetroC() {
        return perimetroC;
    }
    
    public void area(){
        areaC= (radio*radio)*3.1416f;
    }

    public void perimetro(){
        perimetroC=(2*3.1416f)*radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "areaC=" + areaC + ", perimetroC=" + perimetroC + '}';
    }
    
    
}
