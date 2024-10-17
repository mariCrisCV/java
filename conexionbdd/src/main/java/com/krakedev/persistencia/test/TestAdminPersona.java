package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

//System.out.println solo se va a poder usar en los tests
public class TestAdminPersona {

	public static void main(String[] args) {
		EstadoCivil ec=new EstadoCivil("U","Union Libre");
		Persona p=new Persona("1716231379","Julio","Jaramillo",ec);
		
		try {
			Date fechaNac = Convertidor.convertirFecha("2020/12/23");
			Date horaNac = Convertidor.convertirHora("09:23");
			
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			p.setCantidadAhorrada(new BigDecimal(1230.45));
			p.setNumeroHijos(50);
			AdminPersonas.insertar(p);
		} catch (Exception e) {
			System.out.println("error en el sistema: "+e.getMessage());
		}
		
	}

}
