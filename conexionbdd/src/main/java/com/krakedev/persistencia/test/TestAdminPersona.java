package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestAdminPersona {

	public static void main(String[] args) {
		AdminPersonas.insertar(new Persona());

	}

}
