/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericos;

import java.util.ArrayList;

/**
 *
 * @author T-101
 */
public class GeneradorCuestionario {
    
    private Cuestionario cuestionario;
    
    public GeneradorCuestionario(){
        cuestionario=new Cuestionario();
        
        //Generamos las opciones de la p1
        Opcion o11= new Opcion();
            o11.setTitulo("Pelé");
            o11.setCorrecta(false);
            
         Opcion o21= new Opcion();
            o21.setTitulo("Laudrup");
            o21.setCorrecta(true);
            
         Opcion o31= new Opcion();
            o31.setTitulo("Hugo Sánchez");
            o31.setCorrecta(false);
            
         Opcion o41= new Opcion();
            o41.setTitulo("Shevchenko");
            o41.setCorrecta(false);
            
        //Generamos las opciones de la p2
        Opcion o12= new Opcion();
            o12.setTitulo("Brasil");
            o12.setCorrecta(false);
            
         Opcion o22= new Opcion();
            o22.setTitulo("Francia");
            o22.setCorrecta(false);
            
         Opcion o32= new Opcion();
            o32.setTitulo("Alemania");
            o32.setCorrecta(false);
            
         Opcion o42= new Opcion();
            o42.setTitulo("Uruguay");
            o42.setCorrecta(true);
            
        //Sigue la primer pregunta
        Pregunta p11= new Pregunta();
        p11.setTitulo("¿Quien es este jugador?");
        
        //Sigue la segunda pregunta
        Pregunta p21= new Pregunta();
        p21.setTitulo("¿Que selección gano el primer mundial?");
        
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
        
        ArrayList<Pregunta> preguntas=new ArrayList<>();
        preguntas.add(p11);
        preguntas.add(p21);
        cuestionario.setPreguntas(preguntas);
    }

    public Cuestionario getCuestionario() {
        return cuestionario;
    }

    public void setCuestionario(Cuestionario cuestionario) {
        this.cuestionario = cuestionario;
    }
    
    
    
}
