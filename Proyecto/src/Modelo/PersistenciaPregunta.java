/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author juan_
 */
public class PersistenciaPregunta {
    //Primero guardamos

    public static void guardar(Pregunta p) throws Exception {
        //Paso 1 generar el archivo donde se va a guardar
        //nuestro serializado
        ArrayList<Pregunta> preguntas = new ArrayList<>();
        File file = new File("cuestionario.yo");

        if (file.exists()) {
            preguntas = leer();
        }
        preguntas.add(p);

        //Paso 2 es indicar que lo vamos a generar para escribir en el
        FileOutputStream fos = new FileOutputStream(file);
        //Escribir un obejo en el

        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(preguntas);
        oos.close();
    }

    public static ArrayList<Pregunta> leer() throws Exception {
        //Para leer primero ponemos el archivo
        File file = new File("cuestionario.yo");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Pregunta> preguntas = (ArrayList<Pregunta>) ois.readObject();
        return preguntas;
    }

    public static ArrayList<Opcion> opcionesAleatorias(ArrayList<Opcion> opciones) {
        ArrayList<Opcion> opcionesAleatorios = new ArrayList<>();

        Set<Integer> enteros = new LinkedHashSet<>();

        while (enteros.size() < 4) {
            Random ram = new Random();
            int valor = ram.nextInt(4);
            enteros.add(valor);
        }

        for (Integer i : enteros) {

            opcionesAleatorios.add(opciones.get(i));

        }
        return opcionesAleatorios;
    }

    public static void borrar(int i) throws Exception {

        //paso 1: Generar el archivo donde se va a guardar nuestro seializado.
        ArrayList<Pregunta> preguntas = new ArrayList<>();
        File file = new File("cuestionario.yo");
        if (file.exists()) {
            preguntas = leer();
        }
        preguntas.remove(i);
        //paso 2: Indicar que lo vamos a generar para escribir en el.
        FileOutputStream fos = new FileOutputStream(file);
        //paso 3: Escribir un objeto en el.
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(preguntas);
        oos.close();
    }

    public static void actualizar(Pregunta p) throws Exception {

        //Paso 1: Generar el archivo donde se va a guardar nuestro serializado.
        ArrayList<Pregunta> preguntas = new ArrayList<>();
        File file = new File("cuestionario.yo");
        if (file.exists()) {
            preguntas = leer();
        }
        preguntas.add(p);
        //paso 2: Indicar que lo vamos a generar para escribir en el.
        FileOutputStream fos = new FileOutputStream(file);
        //paso 3: Escribir un objeto en el.
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(preguntas);
        oos.close();
    }
}
