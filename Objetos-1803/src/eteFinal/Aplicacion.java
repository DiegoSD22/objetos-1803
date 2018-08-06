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
public class Aplicacion {

    public static void main(String[] args) {

        //Objeto circulo
        Circulo c1 = new Circulo(1);

        //Objeto triangulo
        Triangulo t1 = new Triangulo(2, 3);

        //Objeto cuadrado
        Cuadrado cua1 = new Cuadrado(2);

        //Iteramos para sacar el area y perimetro de las figuras
        ArrayList<Figuras> figuras = new ArrayList<>();
        figuras.add(c1);
        figuras.add(t1);
        figuras.add(cua1);

        for (Figuras f : figuras) {
            f.Perimetro();
            f.Area();
        }

    }
}
