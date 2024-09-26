package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telef = new Telefono("movi","0999888552", 14);
		Contacto c=new Contacto("Jefferson", telef, 120 );
		
		System.out.println("contacto: "+c.getNombre());
		System.out.println("operadora: "+telef.getOperadora());
		System.out.println("numero: "+telef.getNumero());
		System.out.println("codigo: "+telef.getCodigo());
		System.out.println("tiene Whatsapp: "+telef.isTieneWhatsapp());
		System.out.println("peso: "+c.getPeso());
	}

}
