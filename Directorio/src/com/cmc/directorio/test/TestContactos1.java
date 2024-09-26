package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		Contacto mp;
		boolean op;

		Telefono t1 = new Telefono("movi", "0999053232", 10);
		Telefono t2 = new Telefono("claro", "0999085234", 12);

		Contacto c1 = new Contacto("Elias", t1, 120);
		Contacto c2 = new Contacto("Rocio", t2, 150);

		AdminContactos admin = new AdminContactos();
		mp = admin.buscarMasPesado(c1, c2);
		op = admin.compararOperadoras(c1, c2);

		System.out.println("El contacto más pesado es: " + mp.getNombre() + " con un peso de: " + mp.getPeso()
				+ " con el telefono: " + mp.getTelefono().getNumero()+" y su operadora es "+mp.getTelefono().getOperadora());
		System.out.println("Misma operadora: "+op);
	}

}
