/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author T-101
 */
public class ValidarUsuario {

    public static void main(String[] args) {

        try {
            Usuario usu = new Usuario();
            if (usu.getLogin().equals("Diego") && usu.getPassword().equals("16503979"){
                System.out.println("Usuario correcto");
            } else {
                System.out.println("Usuario incorrecto");
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }

    }
}
