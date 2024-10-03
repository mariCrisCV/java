package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date ultimaModificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;

	public Directorio() {
		contactos = new ArrayList<>();
		ultimaModificacion = null;
		correctos= new ArrayList<>();
		incorrectos= new ArrayList<>();
	}

	public boolean agregarContacto(Contacto contacto) {
		if (contacto != null && buscarPorCedula(contacto.getCedula()) == null) {
			contactos.add(contacto);
			ultimaModificacion = new Date();
			return true;
		}
		return false;
	}

	public Contacto buscarPorCedula(String cedula) {
		Contacto contactoEncontrado = null;
		Contacto elementoContacto = null;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			if (elementoContacto.getCedula().equals(cedula)) {
				contactoEncontrado = elementoContacto;
				return contactoEncontrado;
			}
		}
		return null;
	}

	public String consultarUltimaModificacion() {
		if (ultimaModificacion == null) {
			return "No se ha realizado ninguna modificacion";
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
		return sdf.format(ultimaModificacion);
	}

	public int contarPerdidos() {
		int contador = 0;
		Contacto elementoPerdido = null;
		Contacto elementoContacto = null;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			if (elementoContacto.getDireccion() == null) {
				elementoPerdido = elementoContacto;
				contador++;
			}
		}

		return contador;
	}

	public int contarFijos() {
		int contador = 0;
		Contacto elementoContacto = null;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			for (int j = 0; j < elementoContacto.getTelefonos().size(); j++) {
				Telefono telefono = elementoContacto.getTelefonos().get(j);
				if (telefono.getTipo().equals("Convencional") && telefono.getEstado().equals("C")) {
					contador++;
				}
			}
		}
		return contador;
	}

	public void depurar() {
		Contacto elementoContacto = null;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			if (elementoContacto.getDireccion() != null) {
				correctos.add(elementoContacto);
			} else if (elementoContacto.getDireccion() == null) {
				incorrectos.add(elementoContacto);
			}
		}
		contactos.clear();
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public Date getUltimaModificacion() {
		return ultimaModificacion;
	}

	public void setUltimaModificacion(Date ultimaModificacion) {
		this.ultimaModificacion = ultimaModificacion;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}

	
}
