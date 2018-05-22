/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;


public class Conversion {
    private Grados grados;
    private Longitudes longitudes;
    
    public float centigradosAFarenheit(){
        //Este metodo tiene lógica
        
        float resultado= grados.getCentigrados()*1.8f+32;
        return resultado;
    }

    public Grados getGrados() {
        return grados;
    }

    public void setGrados(Grados grados) {
        this.grados = grados;
    }
    
    public float metrosAPies(){
        //Este metodo tiene lógica
        
        float resultadop=longitudes.getMetros()*3.28f;
        return resultadop;
    }
    public Longitudes getLongitudes() {
        return longitudes;
    }

    public void setLongitudes(Longitudes longitudes) {
        this.longitudes = longitudes;
    }
    
    
    
}