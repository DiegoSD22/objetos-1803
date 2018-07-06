/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-101
 */
public class AplicacionFiguras {
    
    public static void main(String[] args) {
        
        try {
            //Creamos un objeto de tipo Cuadrado
            Cuadrado c=new Cuadrado();
            
            //Ajustamos el valor de lado
            ValidarValores.validarNoNegativo(-4);
            c.setLado(4);
            
            //Generamos un objeto de tipo Calculos
            Calculos cal=new Calculos();
            System.out.println(cal.calcularArea(c));
        } catch (ValorNegativoException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
