package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante estudiante1=new Estudiante("Mario");
		estudiante1.calificar(7);
		estudiante1.calificar(9);
		estudiante1.calificar(8);
		}
	
}
