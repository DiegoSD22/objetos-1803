/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializar;
import java.io.*;
import java.util.ArrayList;

public class PresistenciaUsuario {
    
    
    
    //Primero guardamos
    public static void guardar(Cliente c)throws Exception{
        //Paso 1 generar el archivo donde se va a guardar nuestro serializado
        ArrayList<Cliente> clientes=new ArrayList<>();
        File file= new File("D:\\archivaldo.yomero");
        if(file.exists())clientes=leer(); 
        clientes.add(c);

        //Paso 2 es indicar que lo vamos a generar para escribir en el
        FileOutputStream fos= new FileOutputStream(file);
        
        //Paso 3 escribir un objeto en el
        
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(clientes);
        oos.close();
        
    }
    
     public static ArrayList<Cliente> leer()throws Exception{
        //Para leer primero ponemos el archivo
        File file= new File("D:\\archivaldo.yomero");
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois= new ObjectInputStream(fis);
        ArrayList<Cliente> clientes=(ArrayList<Cliente>) ois.readObject();
        return clientes;
    }
    
}
