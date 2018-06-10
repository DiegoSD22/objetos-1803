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
public class IMC {
    private Usuario usuario;
    
    public float calculaIMC(){
        //Metodo con lógica
        
        float resultado=usuario.getPeso()/usuario.getAltura();
        return resultado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
