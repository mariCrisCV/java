package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminar {

	public static void main(String[] args) {
		String cedulaAEliminar = "1716231378";
		
		try {
			AdminPersonas.eliminar(cedulaAEliminar);
		} catch (Exception e) {
			System.out.println("error en el sistema: "+e.getMessage());
		}

	}

}
