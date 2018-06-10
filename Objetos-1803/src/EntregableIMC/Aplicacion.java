/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntregableIMC;

/**
 *
 * @author SR116
 */
public class Aplicacion {
    public static void main(String[] args) {
        //Crear el objeto de tipo usuario
        Usuario usu= new Usuario();
        //Le damos los valores de altura y peso
        usu.setAltura(1.70f);
        usu.setPeso(100.5f);
        
        //Crear el objeto de tipo IMC
        IMC i=new IMC();
        i.setUsuario(usu);
        //Aplicar el modelo
        System.out.println(i.calculaIMC());
        
        if(i.calculaIMC()<20){
            System.out.println("Es peligroso, indica posibilidad de anemia");
        }
        else if(i.calculaIMC()>19 && i.calculaIMC()<26){
            System.out.println("Esta en un indice ideal");
        }
        else{
            System.out.println("Puede que este en sobrepeso, tiene posibilidad de enfermedades");
        }
    }
}
