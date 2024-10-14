package com.krakedev.estaticos.ejercicio.logica;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;

public class AdminAlarmas {
	private ArrayList<Alarma> alarmas;
	
	public AdminAlarmas() {
		alarmas=new ArrayList<>();
	}
	
	public void agregarAlarma(Alarma alarma) {
		if(alarma != null) {
			alarmas.add(alarma);
		}
	}

	public ArrayList<Alarma> getAlarmas() {
		return alarmas;
	}
	
	
	
}
