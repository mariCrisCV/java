package com.cmc.directorio.entidades;

public class Contacto {
	private String nombre;
	private boolean activo;
	private Telefono telefono;
	private double peso;
	
	public Contacto(String nombre, Telefono telefono, double peso) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Telefono getTelefono() {
		return telefono;
	}

	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	
	 
	
	
}
