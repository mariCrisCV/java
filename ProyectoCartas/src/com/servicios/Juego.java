package com.servicios;

import java.util.ArrayList;

import com.entidades.Carta;
import com.entidades.Jugadores;
import com.entidades.Naipe;

public class Juego {
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugador;
	private ArrayList<Carta> naipeBarajado;
	
	public Juego() {
		this.naipe = new Naipe();
		this.naipeBarajado= naipe.barajar();
		this.cartasJugador = new ArrayList<>();
		}
	
	public Juego(ArrayList<String> idJugadores) {
		this();//llama al constructor vacio e inicializar naipe y cartasJugador
		
		for (int i=0; i<idJugadores.size();i++) {
			cartasJugador.add(new ArrayList<Carta>());
		}
	}

	public ArrayList<ArrayList<Carta>> getCartasJugador() {
		return cartasJugador;
	}
	
	public void agregarCartaAJugador(int index, Carta carta) {
        if (index >= 0 && index < cartasJugador.size()) {
            cartasJugador.get(index).add(carta);
        }
    }

	public void entregarCartas(int cartasPorJugador) {
		int cartaIndice=0;
		
		 for (int i = 0; i < cartasPorJugador; i++) {
	            for (int j = 0; j < cartasJugador.size(); j++) {
	                if (cartaIndice < naipeBarajado.size()) {
	                    agregarCartaAJugador(j, naipeBarajado.get(cartaIndice));
	                    cartaIndice++; 
	                }
	            }
	        }
	    }
	
	public int devolverTotal(int idJugador) {
	    int sumaTotal = 0;

	    // Verifica que el índice sea válido
	    if (idJugador < 0 || idJugador >= cartasJugador.size()) {
	        throw new IllegalArgumentException("Índice de jugador inválido");
	    }

	    // Obtiene las cartas del jugador
	    ArrayList<Carta> cartas = cartasJugador.get(idJugador); 

	    // Suma los valores de las cartas
	    for (int i = 0; i < cartas.size(); i++) {
	        sumaTotal += cartas.get(i).getNumeroCarta().getValor();
	    }

	    return sumaTotal;
	}
	
	public String determinarGanador() {
	    if (cartasJugador.isEmpty()) {
	        return null; // O lanzar una excepción si no hay jugadores
	    }

	    String idGanador = null;
	    int sumaGanador = 0;

	    // Suponiendo que el primer jugador es el ganador inicialmente
	    idGanador = "jugador 1"; // Ajusta según tus IDs de jugadores
	    sumaGanador = devolverTotal(0); // Suma de cartas del primer jugador

	    // Iterar sobre los demás jugadores
	    for (int i = 1; i < cartasJugador.size(); i++) {
	        int sumaActual = devolverTotal(i); // Suma de cartas del jugador actual
	        if (sumaActual > sumaGanador) {
	            sumaGanador = sumaActual;
	            idGanador = "jugador " + (i + 1); // Actualiza el ID del ganador
	        }
	    }

	    return idGanador; // Retorna el ID del jugador con mayor puntaje
	}
	
}
