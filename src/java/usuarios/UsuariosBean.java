/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author jhon
 */
@ManagedBean
@RequestScoped
public class UsuariosBean {
    
    private String usuario;
    private String contraseña;

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    public String getRespuesta(){
        if (usuario != null && contraseña !=null){
            return "<p>Usuario: "+usuario+"<br />contraseña: "+contraseña+"</p>";
        }
        return "";
    }

    /**
     * Creates a new instance of UsuariosBean
     */
    public UsuariosBean() {
    }
    
}
