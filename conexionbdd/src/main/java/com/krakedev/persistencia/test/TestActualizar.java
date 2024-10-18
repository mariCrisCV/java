package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizar {

	public static void main(String[] args) {
		EstadoCivil ec=new EstadoCivil("S","Soltero");
		Persona p=new Persona("1716231379","Hector","Mendez",ec);
		
		try {
			Date fechaNac = Convertidor.convertirFecha("2018/05/20");
			Date horaNac = Convertidor.convertirHora("07:33");
			
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			p.setEstatura(1.75);
			p.setCantidadAhorrada(new BigDecimal(2665.44));
			p.setNumeroHijos(2);
			
			AdminPersonas.actualizar(p);
		} catch (Exception e) {
			System.out.println("error en el sistema: "+e.getMessage());
		}
		
	}

	}


