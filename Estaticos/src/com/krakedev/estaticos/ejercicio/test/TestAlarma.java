package com.krakedev.estaticos.ejercicio.test;

import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;

public class TestAlarma {

	public static void main(String[] args) {
		Alarma al1=new Alarma(DiasSemana.LUNES,5,45);
		Alarma al2=new Alarma(DiasSemana.MARTES,6,45);
		Alarma al3=new Alarma(DiasSemana.MIERCOLES,7,05);
		Alarma al4=new Alarma(DiasSemana.JUEVES,6,15);
		Alarma al5=new Alarma(DiasSemana.VIERNES,6,30);
		
		AdminAlarmas admin=new AdminAlarmas();
		admin.agregarAlarma(al1);
		admin.agregarAlarma(al2);
		admin.agregarAlarma(al3);
		admin.agregarAlarma(al4);
		admin.agregarAlarma(al5);
		
		ArrayList<Alarma> alarmasActuales=admin.getAlarmas();
		System.out.println(alarmasActuales);
		
	}

}
