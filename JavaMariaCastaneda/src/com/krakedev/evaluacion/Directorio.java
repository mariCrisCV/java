package com.krakedev.evaluacion;

import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;

	public Directorio() {
		contactos = new ArrayList<>();
	}

	public boolean agregarContacto(Contacto contacto) {
		if (contacto != null && buscarPorCedula(contacto.getCedula()) == null) {
			contactos.add(contacto);
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

}
