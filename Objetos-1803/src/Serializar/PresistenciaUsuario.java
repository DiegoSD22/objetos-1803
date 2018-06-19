/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializar;
import java.io.*;

public class PresistenciaUsuario {
    
    //Primero guardamos
    public static void guardar(Cliente c)throws Exception{
        //Paso 1 generar el archivo donde se va a guardar nuestro serializado
        File file= new File("D:\\archivaldo.yomero");
        
        //Paso 2 es indicar que lo vamos a generar para escribir en el
        FileOutputStream fos= new FileOutputStream(file);
        
        //Paso 3 escribir un objeto en el
        
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(c);
        oos.close();
        
    }
    
}
