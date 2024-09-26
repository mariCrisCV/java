package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono telf1=new Telefono("movi","0999888777", 12);
		Telefono telf2=new Telefono("claro","0999833222", 20);
		Telefono telf3=new Telefono("movi","0999666332", 15);
		
		AdminTelefono admin=new AdminTelefono();
		int cantidadMovi = admin.contarMovi(telf1, telf2, telf3);
		
		System.out.println("Cantidad de telefonos con operadora Movi: "+cantidadMovi);

	}

}
