/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Arbitro;
import java.io.*;
import java.util.*;




/**
 *
 * @author Usuario
 */
public class ControladorArbitro {
    private final List<Arbitro> listaArbitro;
    
    private Arbitro arbitro;
    
   public ControladorArbitro(){
       this.listaArbitro = new ArrayList<>();
   }
   
   public ControladorArbitro(List<Arbitro> listaArbitro){
       this.listaArbitro = listaArbitro;
       this.arbitro = null;
   }
   
   public ControladorArbitro(Arbitro arbitro){
       this.arbitro = arbitro;
       this.listaArbitro = null;
   }

   
    public List<Arbitro> getListaArbitro(){
    return listaArbitro;
    }
   
    public Arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }
   
   
    public void agregarArbitro_Lista(Arbitro a){
        listaArbitro.add(a);
    }
    
    
    public Arbitro buscarPorDNI(String doc) {
    for (Arbitro arbitro : listaArbitro){
        if (arbitro.getNumDoc().equals(doc)) 
            return arbitro;
    }
    return null;
}
    
    
    public void setNombre_Arbitro(String nombre){
        arbitro.setNombre(nombre);
    }
    
    public void setApellido_Arbitro(String apellido){
        arbitro.setApellido(apellido);
    }
    
    public void setFechaNac_Arbitro(String fecha){
        arbitro.setFechaNacimiento(fecha);
    }
    
    public void setNacionalidad_Arbitro(String nacionalidad){
        arbitro.setNacionalidad(nacionalidad);
    }
      
    public void setDNI_Arbitro(String numDoc){
        arbitro.setNumDoc(numDoc);
    }
    
    public void setCantTarjetas_Arbitro(int cantTarjetas){
        arbitro.setCantTarjetasSacadas(cantTarjetas);
    }
    
    public void setInternacional_Arbitro(int internacional){
        arbitro.setInternacional(internacional);
    }
    
    public String getNombre_Arbitro(){
        return arbitro.getNombre();
    }
    
    public String getApellido_Arbitro(){
        return arbitro.getApellido();
    }
    
    public String getFecha_Arbitro(){
        return arbitro.getFechaNacimiento();
    }
    
    public String getNacionalidad_Arbitro(){
        return arbitro.getNacionalidad();
    }

    public String getNumDoc_Arbitro(){
        return arbitro.getNumDoc();
    }
    
    public int getCantTarjetas_Arbitro(){
        return arbitro.getCantTarjetasSacadas();
    }
    
    public int getInternacional_Arbitro(){
        return arbitro.getInternacional();
    }
    
    
    
}
