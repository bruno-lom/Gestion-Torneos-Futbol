/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Arbitro;
import Model.Jugador;
import java.io.*;
import java.util.*;

/**
 *
 * @author bruno
 */

public class ManejadorArchivos {
    File archivoJugador;
    File archivoArbitro;
    
    public ManejadorArchivos(File archivoJugador, File archivoArbitro){
        this.archivoJugador = archivoJugador;
        this.archivoArbitro = archivoArbitro;
    }
    
     public  void cargaArchivoJugador( List<Jugador> listaJugador)
            throws IOException {
         
         
        FileReader leeArchivo = new FileReader(this.archivoJugador);
        BufferedReader leeArchivoJBuff = new BufferedReader(leeArchivo);
         

        while (leeArchivoJBuff.ready()) {
            String nombre, apellido, nacionalidad, nDoc, clubActual, posicion,fechaNacimiento;
            int cantGoles, cantAmarillas, cantRojas;

            Jugador jugadorAux = new Jugador();
            
            //Leemos el archivo de Jugadores
            
            nombre = leeArchivoJBuff.readLine();
            apellido = leeArchivoJBuff.readLine();
            fechaNacimiento = leeArchivoJBuff.readLine();
            nacionalidad = leeArchivoJBuff.readLine(); 
            nDoc = leeArchivoJBuff.readLine();
            clubActual = leeArchivoJBuff.readLine();
            posicion = leeArchivoJBuff.readLine();
            cantGoles = Integer.parseInt(leeArchivoJBuff.readLine());
            cantAmarillas = Integer.parseInt(leeArchivoJBuff.readLine());
            cantRojas = Integer.parseInt(leeArchivoJBuff.readLine());
            
            //Cargamos en el JugadorAux 
            
            jugadorAux.setNombre(nombre);
            jugadorAux.setApellido(apellido);
            jugadorAux.setFechaNacimiento(fechaNacimiento);
            jugadorAux.setNacionalidad(nacionalidad);
            jugadorAux.setNumDoc(nDoc);
            jugadorAux.setClubActual(clubActual);
            jugadorAux.setPosicion(posicion);
            jugadorAux.setCantGoles(cantGoles);
            jugadorAux.setCantAmarillas(cantAmarillas);
            jugadorAux.setCantRojas(cantRojas);
            
            listaJugador.add(jugadorAux);
               
        }
        leeArchivo.close();
        leeArchivoJBuff.close();
     }
     
     
     
     public  void cargaArchivoArbitro( List<Arbitro> listaArbitro)
            throws IOException {
            
        FileReader leeArchivo = new FileReader(this.archivoArbitro);
        BufferedReader leeArchivoABuff = new BufferedReader(leeArchivo);
         

        while (leeArchivoABuff.ready()) {
            String nombre, apellido, nacionalidad, nDoc,fechaNacimiento;
            int cantTarjetas, internacional;

            Arbitro arbitroAux = new Arbitro();
            
            //Leemos el archivo de arbitros
            
            nombre = leeArchivoABuff.readLine();
            apellido = leeArchivoABuff.readLine();
            fechaNacimiento = leeArchivoABuff.readLine();
            nacionalidad = leeArchivoABuff.readLine(); 
            nDoc = leeArchivoABuff.readLine();
            cantTarjetas = Integer.parseInt(leeArchivoABuff.readLine());
            internacional = Integer.parseInt(leeArchivoABuff.readLine());
                        
            //Cargamos en el ArbitroAux 
            arbitroAux.setNombre(nombre);
            arbitroAux.setApellido(apellido);
            arbitroAux.setFechaNacimiento(fechaNacimiento);
            arbitroAux.setNacionalidad(nacionalidad);
            arbitroAux.setNumDoc(nDoc);
            arbitroAux.setCantTarjetasSacadas(cantTarjetas);
            arbitroAux.setInternacional(internacional);
            
            listaArbitro.add(arbitroAux);
               
        }
        leeArchivo.close();
        leeArchivoABuff.close();
     }
     
    //Guarda la informacion de los jugadores al archivo.
    
     public  void almacenaArchivoJ(List<Jugador> listaJugador)
            throws IOException {
        FileWriter escribeArchivoJ = new FileWriter(this.archivoJugador);
        String infoJugador = "";

        for (Jugador jugador : listaJugador) {
            infoJugador = infoJugador.concat(jugador.formatoArchivoJ());
        }

        escribeArchivoJ.write(infoJugador);
        escribeArchivoJ.close();
    }
    
    //    Guarda la informacion de los arbitros al archivo.

    public  void almacenaArchivoA(List<Arbitro> listaArbitro)
            throws IOException {
        FileWriter escribeArchivoA = new FileWriter(this.archivoArbitro);
        String infoArbitro = "";

        for (Arbitro arbitro : listaArbitro) {
            infoArbitro = infoArbitro.concat(arbitro.formatoArchivoA());
        }

        escribeArchivoA.write(infoArbitro);
        escribeArchivoA.close();
    }

}
