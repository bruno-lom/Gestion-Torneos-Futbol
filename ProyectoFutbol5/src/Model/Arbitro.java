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
public class Arbitro extends Persona{
    private int cantTarjetasSacadas;
    private int internacional;

    public Arbitro() {
        this.cantTarjetasSacadas = 0;
        this.internacional = 0;
    }


    public Arbitro(int cantTarjetasSacadas, int internacional, String nombre, String apellido, String fechaNacimiento,
            String nacionalidad, String numDoc) {
        super(nombre, apellido, fechaNacimiento, nacionalidad, numDoc);
        this.cantTarjetasSacadas = cantTarjetasSacadas;
        this.internacional = internacional;
    }

    public int getCantTarjetasSacadas() {
        return cantTarjetasSacadas;
    }

    public void setCantTarjetasSacadas(int cantTarjetasSacadas) {
        this.cantTarjetasSacadas = cantTarjetasSacadas;
    }

    public int getInternacional() {
        return internacional;
    }

    public void setInternacional(int internacional) {
        this.internacional = internacional;
    }

    @Override
    public String toString() {
        return super.toString() + "Arbitro:" +'\n'+ 
                "Tarjetas Sacadas:" + cantTarjetasSacadas +'\n'+ 
                "Internacional:" + internacional + '\n';
    }
    
    public String formatoArchivoA(){
       
        String formato = formatoArchivoP();
        formato += String.valueOf(this.cantTarjetasSacadas) + '\n';
        formato += String.valueOf(this.internacional) + '\n';
        
        return formato;
    }

    
    
}
