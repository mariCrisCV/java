package com.test;

import com.entidades.Carta;
import com.entidades.Numero;
import com.entidades.Palos;

public class TestPalos {

	public static void main(String[] args) {
		Palos palos=new Palos();
		palos.getCorazonRojo();

		Numero numero=new Numero("A",11);
		numero.mostrarNumero();
		
		Carta carta=new Carta(numero,"TR");
		carta.mostrarCarta();
	}

}
