package com.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;

	public Naipe() {
		this.numerosPosibles = new ArrayList<>();
		this.cartas = new ArrayList<>();

		Numero num1 = new Numero("A", 11);
		Numero num2 = new Numero("2", 2);
		Numero num3 = new Numero("3", 3);
		Numero num4 = new Numero("4", 4);
		Numero num5 = new Numero("5", 5);
		Numero num6 = new Numero("6", 6);
		Numero num7 = new Numero("7", 7);
		Numero num8 = new Numero("8", 8);
		Numero num9 = new Numero("9", 9);
		Numero num10 = new Numero("10", 10);
		Numero num11 = new Numero("J", 10);
		Numero num12 = new Numero("Q", 10);
		Numero num13 = new Numero("K", 10);

		numerosPosibles.add(num1);
		numerosPosibles.add(num2);
		numerosPosibles.add(num3);
		numerosPosibles.add(num4);
		numerosPosibles.add(num5);
		numerosPosibles.add(num6);
		numerosPosibles.add(num7);
		numerosPosibles.add(num8);
		numerosPosibles.add(num9);
		numerosPosibles.add(num10);
		numerosPosibles.add(num11);
		numerosPosibles.add(num12);
		numerosPosibles.add(num13);

		for (int i = 0; i < numerosPosibles.size(); i++) {
			Numero numero = numerosPosibles.get(i);
			cartas.add(new Carta(numero, "CR"));
			cartas.add(new Carta(numero, "CN"));
			cartas.add(new Carta(numero, "DI"));
			cartas.add(new Carta(numero, "TR"));
		}
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public ArrayList<Carta> barajar() {
		ArrayList<Carta> auxiliar = new ArrayList<>();

		for (int i = 0; i <= 100; i++) {
			int nuevaPosicion = Random.obtenerPosicion();
			Carta cartaBaraja = cartas.get(nuevaPosicion);
			if (cartaBaraja.getEstado().equals("N")) {
				auxiliar.add(cartaBaraja);
				cartaBaraja.setEstado("C");
			}
		}
		for (int i = 0; i < cartas.size(); i++) {
			Carta cartaBaraja = cartas.get(i);
			if (cartaBaraja.getEstado().equals("N")) {
				auxiliar.add(cartaBaraja);
				cartaBaraja.setEstado("C");
			}
		}
		return auxiliar;
	}

}
