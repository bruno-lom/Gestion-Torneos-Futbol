/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.io.*;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class Jugador extends Persona{
    private String clubActual;
    private String posicion;
    private int cantGoles;
    private int cantAmarillas;
    private int cantRojas;

    public Jugador() {
    }



    public Jugador(String clubActual, String posicion, int cantGoles, int cantAmarillas, int cantRojas,
            String nombre, String apellido, String fechaNacimiento, String nacionalidad, String numDoc) {
        super(nombre, apellido, fechaNacimiento, nacionalidad, numDoc);
        this.clubActual = clubActual;
        this.posicion = posicion;
        this.cantGoles = cantGoles;
        this.cantAmarillas = cantAmarillas;
        this.cantRojas = cantRojas;
    }

    public String getClubActual() {
        return clubActual;
    }

    public void setClubActual(String clubActual) {
        this.clubActual = clubActual;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getCantGoles() {
        return cantGoles;
    }

    public void setCantGoles(int cantGoles) {
        this.cantGoles = cantGoles;
    }

    public int getCantAmarillas() {
        return cantAmarillas;
    }

    public void setCantAmarillas(int cantAmarillas) {
        this.cantAmarillas = cantAmarillas;
    }

    public int getCantRojas() {
        return cantRojas;
    }

    public void setCantRojas(int cantRojas) {
        this.cantRojas = cantRojas;
    }

    @Override
    public String toString() {
        return super.toString()+  "Jugador:" + '\n' + 
                "Club Actual:" + clubActual + '\n' + 
                "Posicion:" + posicion + '\n'+ 
                "Goles:" + cantGoles + '\n' + 
                "Amarillas:" + cantAmarillas + '\n'+
                "Rojas:" + cantRojas + '\n';
    }

    public String formatoArchivoJ(){
       
        String formato = formatoArchivoP();
        formato += this.clubActual + '\n';
        formato += this.posicion +'\n';
        formato += String.valueOf(this.cantGoles) + '\n';
        formato += String.valueOf(this.cantAmarillas) + '\n';
        formato += String.valueOf(this.cantRojas) + '\n';
        
        return formato;
    }
    
}
