package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date ultimaModificacion;

	public Directorio() {
		contactos = new ArrayList<>();
		ultimaModificacion = null;
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

}
