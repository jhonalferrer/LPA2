/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muestrahora;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author jhon
 */
@ManagedBean(name="MuestraHora")
@RequestScoped
public class MuestraHora {
    
    public String getTime(){
       return DateFormat.getTimeInstance(DateFormat.LONG).format(new Date());
    }

 
}
