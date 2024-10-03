package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;

	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefonos = new ArrayList<>();
	}

	public void imprimir() {
		System.out.println("Información del Contacto:");
		System.out.println("Cédula: "+cedula);
		System.out.println("Nombre: "+nombre+ " "+apellido);
		System.out.println("Dirección: ");
		System.out.println("  Calle Principal: "+direccion.getCallePrincipal());
		System.out.println("  Calle Secundaria: "+direccion.getCalleSecundaria());
//		System.out.println("***" + nombre + " " + apellido + "***");
//		if (direccion == null) {
//			System.out.println("No tiene asociada una direccion");
//		} else {
//			System.out.println("Dirección: " + direccion.getCallePrincipal() + " y " + direccion.getCalleSecundaria());
//		}
	}

	public void agregarTelefono(Telefono telefono) {
		if (!telefono.equals(null)) {
			telefonos.add(telefono);
		}
	}

	public void mostrarTelefonos() {
		Telefono elementoTelefono;
		System.out.println("Teléfonos con estado 'C':");
		for (int i = 0; i < telefonos.size(); i++) {
			elementoTelefono = telefonos.get(i);
			if (elementoTelefono.getEstado().equals("C")) {
				System.out.println(
						"Numero: " + elementoTelefono.getNumero() + ", " + "Tipo: " + elementoTelefono.getTipo());
			}
		}
	}

	public ArrayList<Telefono> recuperarIncorrectos() {
		ArrayList<Telefono> telefonosIncorrectos = new ArrayList<>();
		Telefono elementoTelefonoIncorrecto;
		for (int i = 0; i < telefonos.size(); i++) {
			elementoTelefonoIncorrecto = telefonos.get(i);
			if (!elementoTelefonoIncorrecto.equals(null) && elementoTelefonoIncorrecto.getEstado().equals("E")) {
				telefonosIncorrectos.add(elementoTelefonoIncorrecto);
			}
		}
		return telefonosIncorrectos;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
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

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

}
