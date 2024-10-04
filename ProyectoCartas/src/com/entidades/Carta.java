package com.entidades;

public class Carta {
	private Numero numeroCarta;
	private String palo;
		
	public Carta(Numero numeroCarta, String palo) {
		this.numeroCarta = numeroCarta;
		this.palo = palo;
	}
	
	public Numero getNumeroCarta() {
		return numeroCarta;
	}

	public void setNumeroCarta(Numero numeroCarta) {
		this.numeroCarta = numeroCarta;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public void mostrarCarta() {
		System.out.println(numeroCarta.getNumeroCarta()+"-"+palo);
	}
	
}
