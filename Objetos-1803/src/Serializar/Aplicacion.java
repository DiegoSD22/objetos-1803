/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializar;


public class Aplicacion {
    public static void main(String[] args) throws Exception{
        
        //Pues a usar nuestro modelo
        Cliente c=new Cliente();
        c.setEdad(46);
        c.setNombre("Diego Gerardo");
        c.setSueldo(45000);
        
        PresistenciaUsuario.guardar(c);
        System.out.println("Guardado con exito!!");
    }
    
}
