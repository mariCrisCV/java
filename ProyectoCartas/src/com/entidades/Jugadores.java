package com.entidades;

import java.util.ArrayList;

import com.servicios.Juego;

public class Jugadores {
	private ArrayList<String> jugadores;
	private Juego juego;
	
	
	public Jugadores() {
		jugadores=new ArrayList<>();
		
		jugadores.add("Jugador 1");
		jugadores.add("Jugador 2");
		jugadores.add("Jugador 3");
	}
		
	public ArrayList<String> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}
	
	public void jugarPrimero() {
		juego = new Juego(jugadores); // Crear objeto Juego con los jugadores
        juego.entregarCartas(5); // Entregar 5 cartas a cada jugador
//        mostrarResultados(); // Mostrar los resultados
    }

    
	}
	
	

