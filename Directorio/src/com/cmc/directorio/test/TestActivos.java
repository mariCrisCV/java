package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono t1 = new Telefono("movi", "0999078964", 20);
		Contacto c1 = new Contacto("Lucia", t1, 114);

		System.out.println("---Datos iniciales---");
		System.out.println("nombre: " + c1.getNombre());
		System.out.println("peso: " + c1.getPeso());
		System.out.println("activo: " + c1.isActivo());
		System.out.println("numero: " + c1.getTelefono().getNumero());
		System.out.println("operadora: " + c1.getTelefono().getOperadora());
		System.out.println("codigo: " + c1.getTelefono().getCodigo());
		System.out.println("tiene Whatsapp: " + c1.getTelefono().isTieneWhatsapp());

		AdminTelefono adtel = new AdminTelefono();
		adtel.activarMensajeria(t1);

		AdminContactos admin = new AdminContactos();
		admin.activarUsuario(c1);

		System.out.println("---Datos modificados---");
		System.out.println("nombre: " + c1.getNombre());
		System.out.println("peso: " + c1.getPeso());
		System.out.println("activo: " + c1.isActivo());
		System.out.println("numero: " + c1.getTelefono().getNumero());
		System.out.println("operadora: " + c1.getTelefono().getOperadora());
		System.out.println("codigo: " + c1.getTelefono().getCodigo());
		System.out.println("tiene Whatsapp: " + c1.getTelefono().isTieneWhatsapp());

	}

}
