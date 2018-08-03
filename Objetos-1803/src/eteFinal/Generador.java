/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eteFinal;

import java.util.ArrayList;

/**
 *
 * @author SR116
 */
public class Generador {
    private ArrayList<Figuras> figuras;

    public ArrayList<Figuras> getFiguras() {
        return figuras;
    }

    public void setFiguras(ArrayList<Figuras> figuras) {
        this.figuras = figuras;
    }
    
    public Generador(){
        figuras=new ArrayList<>();
        figuras.add(new Figuras(new Cuadrado(2), new Circulo(3), new Triangulo(2, 3)));
        
    }
    
}
