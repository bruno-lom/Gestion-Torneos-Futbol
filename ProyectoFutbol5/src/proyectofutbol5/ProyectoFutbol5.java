/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofutbol5;

import Controller.ControladorJugador;
import Controller.ControladorArbitro;
import Controller.ManejadorArchivos;
import Model.Arbitro;
import Model.Jugador;

import View.InterfazPrincipal;
import java.io.*;
import java.util.*;


/**
 *
 * @author Usuario
 */
public class ProyectoFutbol5 {

     public static void main(String[] args) throws IOException {
        List<Jugador> jugadores = new ArrayList<>();
        List<Arbitro> arbitros = new ArrayList<>();

        File archivoJugador = new File("archivo-Jugador.txt");
        File archivoArbitro = new File("archivo-Arbitro.txt");

        if (!archivoJugador.exists()) {
            System.out.println("ERROR: El archivo de información de jugadores no existe.");
            System.exit(0);
        }
        if (!archivoArbitro.exists()) {
            System.out.println("ERROR: El archivo de información de arbitros no existe.");
            System.exit(0);
        }

        ManejadorArchivos manejaArch = new ManejadorArchivos(archivoJugador, archivoArbitro);

        manejaArch.cargaArchivoJugador(jugadores);
        manejaArch.cargaArchivoArbitro(arbitros);

        ControladorJugador controladorListaJ = new ControladorJugador(jugadores); 
        ControladorArbitro controladorListaA = new ControladorArbitro(arbitros);

        manejaArch.almacenaArchivoJ(controladorListaJ.getListaJugador());
        manejaArch.almacenaArchivoA(controladorListaA.getListaArbitro());

        new InterfazPrincipal(controladorListaJ, controladorListaA).setVisible(true);
    }
}

    

