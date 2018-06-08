/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericos;

import java.util.*;
/**
 *
 * @author T-101
 */
public class AplicacionPregunta {
    
    public static void main(String[] args) {
        //Generamos las opciones de la p1
        Opcion o11= new Opcion();
            o11.setTitulo("Mizcalco");
            o11.setCorrecta(false);
            
         Opcion o21= new Opcion();
            o21.setTitulo("Texcoco");
            o21.setCorrecta(false);
            
         Opcion o31= new Opcion();
            o31.setTitulo("Madrid");
            o31.setCorrecta(true);
            
         Opcion o41= new Opcion();
            o41.setTitulo("Ecatepec");
            o41.setCorrecta(false);
            
        //Generamos las opciones de la p1
        Opcion o12= new Opcion();
            o12.setTitulo("Long");
            o12.setCorrecta(true);
            
         Opcion o22= new Opcion();
            o22.setTitulo("Int");
            o22.setCorrecta(false);
            
         Opcion o32= new Opcion();
            o32.setTitulo("Byte");
            o32.setCorrecta(false);
            
         Opcion o42= new Opcion();
            o42.setTitulo("Short");
            o42.setCorrecta(false);
            
        //Sigue la primer pregunta
        Pregunta p11= new Pregunta();
        p11.setTitulo("¿Cual es la capital de España?");
        
        //Sigue la segunda pregunta
        Pregunta p21= new Pregunta();
        p21.setTitulo("¿Que valos es mas grande?");
        
        //Antes generamos el ArrayList con las opciones de arriba
        ArrayList<Opcion> opcionesp11=new ArrayList<>();
        opcionesp11.add(o11);
        opcionesp11.add(o21);
        opcionesp11.add(o31);
        opcionesp11.add(o41);
        
        ArrayList<Opcion> opcionesp12=new ArrayList<>();
        opcionesp12.add(o12);
        opcionesp12.add(o22);
        opcionesp12.add(o32);
        opcionesp12.add(o42);
        
        //Ahora si este ArrayList lo agregamos a la primera pregunta
        p11.setOpciones(opcionesp11);
        p21.setOpciones(opcionesp12);
        
        //El cuestionario
        Cuestionario c1=new Cuestionario();
        ArrayList<Pregunta> preguntas=new ArrayList<>();
        preguntas.add(p11);
        preguntas.add(p21);
        c1.setPreguntas(preguntas);
        
        
        for(Pregunta p:preguntas){
            System.out.println(p.getTitulo());
            for(Opcion o:p.getOpciones()){
                System.out.println(o.getTitulo()+" "+o.isCorrecta());
            }
        }
    }
}
