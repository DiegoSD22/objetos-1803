/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-101
 */
public class ProbarOrdenamiento {

    public static void main(String[] args) {
        //Un arreglo que no acepta valores duplicados
        Set<Integer> enteros = new LinkedHashSet<>();

        //System.out.println(enteros.size());
        while (enteros.size() < 4) {
            Random r = new Random();
            int numero = r.nextInt(4);
            enteros.add(numero);
        }

        for (Integer i : enteros) {
            System.out.println(i);
        }
    }
}
