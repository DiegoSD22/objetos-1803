/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializar;


public class Aplicacion {
    public static void main(String[] args) throws Exception{
        
  
      for(Cliente c:PresistenciaUsuario.leer()){
       
       System.out.println("Vamos a checar el nombre"+c.getNombre());
      }
      
       /*Cliente c=new Cliente();
       c.setNombre("Diego");
       c.setEdad(21);
       PresistenciaUsuario.guardar(c);
       */
}

    
}
