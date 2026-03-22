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
public class Persona {
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String nacionalidad;
    private String numDoc;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String fechaNacimiento, String nacionalidad, String numDoc) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.numDoc = numDoc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    @Override
    public String toString() {
        return "Persona:" + '\n'+ 
                "Nombre:" + nombre + '\n'+ 
                "Apellido:" + apellido + '\n' +
                "Fecha de Nacimiento:" + fechaNacimiento + '\n' +
                "Nacionalidad:" + nacionalidad + '\n'+
                "Numero de Documento:" + numDoc + '\n';
    }
    
    public String formatoArchivoP(){
        String formato = this.nombre + '\n';
        formato += this.apellido + '\n';
        formato += this.fechaNacimiento + '\n';
        formato += this.nacionalidad + '\n';
        formato += this.numDoc + '\n';

        return formato;
    }

}
