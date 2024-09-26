package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("movi", "0999888777", 12);
		Telefono telf2 = new Telefono("claro", "0999833222", 20);
		Telefono telf3 = new Telefono("movi", "0999666332", 15);
		Telefono telf4 = new Telefono("claro", "0989652314", 10);

		AdminTelefono admin = new AdminTelefono();
		int cantidadClaro = admin.contaClaro(telf1, telf2, telf3, telf4);

		System.out.println("Cantidad de telefonos con operadora Claro: " + cantidadClaro);

	}

}
