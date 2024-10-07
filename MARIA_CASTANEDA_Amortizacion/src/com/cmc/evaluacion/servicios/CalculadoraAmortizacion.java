package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.entidades.Prestamo;

public class CalculadoraAmortizacion {
	
	
	public static double calcularCuota(Prestamo prestamo) {
		double cuota=0.0;
		double interesAnual=0.0;
		interesAnual=(prestamo.getInteres()/12)/100;
		cuota=(prestamo.getMonto()*interesAnual)/(1-Math.pow((1+interesAnual), prestamo.getPlazo()*-1));
		
		return cuota;
	}
	
	
	
}
