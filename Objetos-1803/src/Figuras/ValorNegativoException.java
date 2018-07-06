/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *
 * @author T-101
 */
public class ValorNegativoException extends Exception{
    public ValorNegativoException(){
        super("No se permite valores negativos!");
    }
}
