/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Jugador;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.*;


/**
 *
 * @author Usuario
 */
public class ControladorJugador {
    private final List<Jugador> listaJugador;
    
    private Jugador jugador;
    
    public ControladorJugador(){
        this.listaJugador = new ArrayList<>();
    }
    
    public ControladorJugador(List<Jugador> listaJugador){
        this.listaJugador = listaJugador;
        this.jugador = null;
    }
    
    public ControladorJugador(Jugador jugador){
        this.jugador = jugador;
        this.listaJugador = null;
    }

    public List<Jugador> getListaJugador(){
        return listaJugador;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

     public void agregarJugador_Lista(Jugador j){
        listaJugador.add(j);
    }
    
    public Jugador buscarPorDNI(String doc) {
    for (Jugador jugador : listaJugador){
        if (jugador.getNumDoc().equals(doc)) 
            return jugador;
    }
    return null;
    }

    public int contJugadoresxClub(String club){
        int cont = 0;
        for(Jugador jugador : listaJugador){
            if(jugador.getClubActual().equals(club))
                {
                cont = cont+1;
                }
            }
        return cont;
    }

    public int contxCLub(String clubA){
        int cont = 0;
        for(Jugador jugador : listaJugador){
            if(jugador.getClubActual().equals(clubA)){
                cont = cont + 1;
                }
            }
        return cont;
    }

    public void setNombre_Jugador(String nombre){
        jugador.setNombre(nombre);
    }

    public void setApellido_Jugador(String apellido){
        jugador.setApellido(apellido);
    }

    public void setFechaNac_Jugador(String fecha){
        jugador.setFechaNacimiento(fecha);
    }

    public void setNacionalidad_Jugador(String nacionalidad){
        jugador.setNacionalidad(nacionalidad);
    }

    public void setDNI_Jugador(String numDoc){
        jugador.setNumDoc(numDoc);
    }
    
    public void setClubActual_Jugador(String club){
        jugador.setClubActual(club);
    }
    
    public void setPosicion_Jugador(String posicion){
        jugador.setPosicion(posicion);
    }
    
    public void setCantGoles_Jugador(int cantGoles){
        jugador.setCantGoles(cantGoles);
    }
    
    public void setCantAmarillas_Jugador(int amarillas){
        jugador.setCantAmarillas(amarillas);
    }
    
    public void setCantRojas_Jugador(int rojas){
        jugador.setCantRojas(rojas);
    }
    

    public String getNombre_Jugador(){
        return jugador.getNombre();
    }

    public String getApellido_Jugador(){
        return jugador.getApellido();
    }

    public String getFecha_Jugador(){
        return jugador.getFechaNacimiento();
    }

    public String getNacionalidad_Jugador(){
        return jugador.getNacionalidad();
    }

    public String getNumDoc_Jugador(){
        return jugador.getNumDoc();
    }
    
    public String getClubActual_Jugador(){
        return jugador.getClubActual();
    }
    
    public String getPosicion_Jugador(){
        return jugador.getPosicion();
    }
    
    public int getCantGoles_Jugador(){
        return jugador.getCantGoles();
    }
    
    public int getCantAmarillas_Jugador(){
        return jugador.getCantAmarillas();
    }
    
    public int getCantRojas_Jugador(){
        return jugador.getCantRojas();
    }
    
}