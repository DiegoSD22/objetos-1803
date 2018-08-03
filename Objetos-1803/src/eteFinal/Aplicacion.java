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
        
        for(Figuras f: new Generador().getFiguras()){
            System.out.println(f);
        }
        
    }
}
